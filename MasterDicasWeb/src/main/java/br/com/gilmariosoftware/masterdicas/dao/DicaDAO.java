package br.com.gilmariosoftware.masterdicas.dao;

import br.com.gilmariosoftware.masterdicas.dominio.Dica;
import br.com.gilmariosoftware.masterdicas.dominio.Dica_;
import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author gilmario
 */
@Stateless
public class DicaDAO extends DAO<Dica, Long> implements Serializable {

    public List<Dica> buscarPor(List<Tag> tags, String titulo) {
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Dica> query = builder.createQuery(Dica.class);
        Root<Dica> dicaRoot = query.from(Dica.class);
        query.where(builder.like(dicaRoot.get(Dica_.titulo), titulo));
        query.orderBy(builder.asc(dicaRoot.get(Dica_.titulo)));
        return getEntityManager().createQuery(query).setMaxResults(100).getResultList();
    }

    public List<Dica> buscarUltimas() {
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Dica> query = builder.createQuery(Dica.class);
        Root<Dica> dicaRoot = query.from(Dica.class);
        query.orderBy(builder.asc(dicaRoot.get(Dica_.titulo)));
        return getEntityManager().createQuery(query).setMaxResults(100).getResultList();
    }
}
