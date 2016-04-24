package br.com.gilmariosoftware.masterdicas.dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;

/**
 *
 * @author gilmario
 * @param <T>
 * @param <PK>
 */
public abstract class DAO<T, PK extends Serializable> {

    @PersistenceContext
    private EntityManager em;
    private Session session;

    protected Session getSession() {
        if (session == null) {
            session = (Session) em.getDelegate();
        }
        return session;
    }

    public void salvar(T t) {
        getSession().save(t);
    }

    public T atualizar(T t) {
        return (T) getSession().merge(t);
    }

    public void excluir(T t) {
        getSession().refresh(t);
        getSession().delete(t);
    }

    public T carregar(Class<T> entidade, Serializable pk) {
        return (T) getSession().get(entidade, pk);
    }

}
