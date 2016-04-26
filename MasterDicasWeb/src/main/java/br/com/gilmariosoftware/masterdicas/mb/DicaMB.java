package br.com.gilmariosoftware.masterdicas.mb;

import br.com.gilmariosoftware.masterdicas.servico.cliente.Dica;
import br.com.gilmariosoftware.masterdicas.servico.cliente.DicaWSCliente;
import br.com.gilmariosoftware.masterdicas.servico.cliente.Tag;
import br.com.gilmariosoftware.masterdicas.util.GeradorMensagem;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author gilmario
 */
@Named
@ViewScoped
public class DicaMB implements Serializable {

    @EJB
    private DicaWSCliente servico;
    private Dica dica = new Dica();
    private List<Tag> listaDeTags;
    private List<Dica> listaDeDicas;
    private String titulo = "";
    @EJB
    private GeradorMensagem mensagem;

    public void salvar() {
        try {
            if (dica.getId() != null) {

                dica = servico.getServico().alterarDica(dica);
                mensagem.info("Dica alterada com sucesso!");
            } else {
                dica = servico.getServico().adicionarDica(dica);
                mensagem.info("Dica Cadastrada com sucesso!");
            }
            dica = new Dica();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public void remover(Dica dica) {
        try {
            mensagem.info(servico.getServico().removerDica(dica));
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public void adicionaTag(Tag tag) {
        dica.getTags().add(tag);
    }

    public void buscarDicas() {
        try {
            listaDeDicas = servico.getServico().buscarDicas(listaDeTags, titulo).getDicas();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public Dica getDica() {
        return dica;
    }

    public void setDica(Dica dica) {
        this.dica = dica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Tag> getListaDeTags() {
        return listaDeTags;
    }

    public void setListaDeTags(List<Tag> listaDeTags) {
        this.listaDeTags = listaDeTags;
    }

    public List<Dica> getListaDeDicas() {
        return listaDeDicas;
    }

    public void setListaDeDicas(List<Dica> listaDeDicas) {
        this.listaDeDicas = listaDeDicas;
    }

}
