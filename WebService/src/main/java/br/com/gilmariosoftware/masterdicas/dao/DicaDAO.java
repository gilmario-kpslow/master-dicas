package br.com.gilmariosoftware.masterdicas.dao;

import br.com.gilmariosoftware.masterdicas.dominio.Dica;
import br.com.gilmariosoftware.masterdicas.dominio.Dica_;
import br.com.gilmariosoftware.masterdicas.dominio.Tag;
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
        return getSession().createCriteria(Dica.class)
                .add(Restrictions.ilike(Dica_.titulo.getName(), titulo, MatchMode.START))
                .addOrder(Order.asc(Dica_.titulo.getName()))
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                .setMaxResults(100)
                .list();
    }

    public List<Dica> buscarUltimas() {
        return getSession().createCriteria(Dica.class)
                .addOrder(Order.desc(Dica_.dataCadastro.getName()))
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                .setMaxResults(100)
                .list();
    }
}
