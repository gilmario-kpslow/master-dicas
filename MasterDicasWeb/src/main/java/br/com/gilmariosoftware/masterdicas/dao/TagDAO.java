package br.com.gilmariosoftware.masterdicas.dao;

import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import br.com.gilmariosoftware.masterdicas.dominio.Tag_;
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
public class TagDAO extends DAO<Tag, String> implements Serializable {

    public List<Tag> buscarPor(String nome) {
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Tag> query = builder.createQuery(Tag.class);
        Root<Tag> tagRoot = query.from(Tag.class);
        query.where(builder.equal(tagRoot.get(Tag_.nome), nome + "%"));
        query.orderBy(builder.asc(tagRoot.get(Tag_.nome)));
        return getEntityManager().createQuery(query).setMaxResults(25).getResultList();
    }

    public List<Tag> paginar(String nome, int inicio, int resultados) {
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Tag> query = builder.createQuery(Tag.class);
        Root<Tag> tagRoot = query.from(Tag.class);
        query.where(builder.equal(tagRoot.get(Tag_.nome), nome));
        query.orderBy(builder.asc(tagRoot.get(Tag_.nome)));
        return getEntityManager().createQuery(query).setMaxResults(resultados).setFirstResult(inicio).getResultList();
    }

    public Long contar(String nome) {
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);
        Root<Tag> tagRoot = query.from(Tag.class);
        query.where(builder.equal(tagRoot.get(Tag_.nome), nome));
        query.select(builder.count(tagRoot.get(Tag_.nome)));
        return getEntityManager().createQuery(query).getSingleResult();
    }
}
