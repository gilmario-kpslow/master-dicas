package br.com.gilmariosoftware.masterdicas.dao;

import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import br.com.gilmariosoftware.masterdicas.dominio.Tag_;
import java.io.Serializable;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gilmario
 */
@Stateless
@LocalBean
public class TagDAO extends DAO<Tag, String> implements Serializable {

    public List<Tag> listar(String nome) {
        return getSession().createCriteria(Tag.class).add(Restrictions.ilike(Tag_.nome.getName(), nome, MatchMode.START)).list();
    }
}
