package br.com.gilmariosoftware.masterdicas.mb;

import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import br.com.gilmariosoftware.masterdicas.negocio.TagNegocio;
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
    private TagNegocio negocio;
    private Tag tag = new Tag();
    private List<Tag> listaDeTags;
    private String nome = "";
    @EJB
    private GeradorMensagem mensagem;

    public TagMB() {
    }

    public void salvar() {
        try {
            tag = negocio.adicionarTag(tag);
            mensagem.info("Tag Cadastrada");
            tag = new Tag();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public void remover(Tag tag) {
        try {
            negocio.removerTag(tag);
            mensagem.info("Tag Removida com sucesso!");
            buscarTags();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public void buscarTags() {
        try {
            listaDeTags = negocio.buscarPor(nome);
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
