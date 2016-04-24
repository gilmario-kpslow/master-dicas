package br.com.gilmariosoftware.masterdicas.dao;

import br.com.gilmariosoftware.masterdicas.dominio.Tag;
//import br.com.gilmariosoftware.masterdicas.dominio.Tag_;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gilmario
 */
@Stateless
public class TagDAO extends DAO<Tag, String> implements Serializable {

    public List<Tag> buscarPor(String nome) {
        return getSession().createCriteria(Tag.class).add(Restrictions.ilike("nome", nome, MatchMode.START)).addOrder(Order.asc("nome")).list();
    }
}