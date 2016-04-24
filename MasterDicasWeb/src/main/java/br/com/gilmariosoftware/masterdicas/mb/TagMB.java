package br.com.gilmariosoftware.masterdicas.mb;

import br.com.gilmariosoftware.masterdicas.servico.cliente.TagWSCliente;
import br.com.gilmariosoftware.masterdicas.servico.cliente.tags.Tag;
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
public class TagMB implements Serializable {

    @EJB
    private TagWSCliente servico;
    private Tag tag = new Tag();
    private List<Tag> listaDeTags;
    private String nome = "";
    @EJB
    private GeradorMensagem mensagem;

    public void salvar() {
        try {
            tag = servico.getServico().adicionarTag(tag);
            mensagem.info("Tag Cadastrada");
            tag = new Tag();
            buscarTags();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public void remover(Tag tag) {
        try {
            mensagem.info(servico.getServico().removerTag(tag));
            buscarTags();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public void buscarTags() {
        try {
            listaDeTags = servico.getServico().buscarTags(nome).getTags();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public List<Tag> getListaDeTags() {
        return listaDeTags;
    }

    public void setListaDeTags(List<Tag> listaDeTags) {
        this.listaDeTags = listaDeTags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
