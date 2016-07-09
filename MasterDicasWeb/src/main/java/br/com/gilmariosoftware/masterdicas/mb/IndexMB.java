package br.com.gilmariosoftware.masterdicas.mb;

import br.com.gilmariosoftware.masterdicas.servico.cliente.Dica;
import br.com.gilmariosoftware.masterdicas.servico.cliente.DicaWSCliente;
import br.com.gilmariosoftware.masterdicas.util.GeradorMensagem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author gilmario
 */
@Named
@RequestScoped
public class IndexMB implements Serializable {

    @EJB
    private DicaWSCliente cliente;
    @EJB
    private GeradorMensagem mensagem;
    private List<Dica> dicas;
    private Dica dica;

    public IndexMB() {
        dicas = new ArrayList<>();
    }

    @PostConstruct
    private void iniciar() {
        ultimasDicas();
    }

    public void ultimasDicas() {
        try {
            dicas = cliente.getServico().buscarUltimasDicas().getDicas();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public List<Dica> getDicas() {
        return dicas;
    }

    public Dica getDica() {
        return dica;
    }

    public void setDica(Dica dica) {
        this.dica = dica;
    }

}
