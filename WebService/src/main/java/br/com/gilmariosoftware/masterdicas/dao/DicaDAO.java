package br.com.gilmariosoftware.masterdicas.dao;

import br.com.gilmariosoftware.masterdicas.dominio.Dica;
import br.com.gilmariosoftware.masterdicas.dominio.Tag;
//import br.com.gilmariosoftware.masterdicas.dominio.Tag_;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gilmario
 */
@Stateless
public class DicaDAO extends DAO<Dica, Long> implements Serializable {

    public List<Dica> buscarPor(List<Tag> tags, String titulo) {
        return getSession().createCriteria(Dica.class).add(Restrictions.ilike("titulo", titulo, MatchMode.START))
                //                .add(Criteria)
                .addOrder(Order.asc("titulo")).list();
    }
}
