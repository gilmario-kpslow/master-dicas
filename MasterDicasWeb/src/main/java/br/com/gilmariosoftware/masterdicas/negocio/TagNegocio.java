package br.com.gilmariosoftware.masterdicas.negocio;

import br.com.gilmariosoftware.masterdicas.dao.TagDAO;
import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author gilmario
 */
@Stateless
public class TagNegocio implements Serializable {

    @EJB
    private TagDAO dao;

    public Tag adicionarTag(Tag tag) throws Exception {
        dao.salvar(tag);
        return tag;
    }

    public void removerTag(Tag tag) throws Exception {
        dao.excluir(tag);
    }

    public List<Tag> buscarPor(String nome) throws Exception {
        if (nome == null) {
            nome = "";
        }
        return dao.buscarPor(nome);
    }

    public List<Tag> paginar(String nome, int inicio, int quantidade) throws Exception {
        if (Objects.isNull(nome)) {
            nome = "";
        }
        return dao.paginar(nome, inicio, quantidade);
    }

    public Long contar(String nome) {
        return dao.contar(nome);
    }

}
