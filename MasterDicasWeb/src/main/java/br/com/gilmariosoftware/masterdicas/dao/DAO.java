package br.com.gilmariosoftware.masterdicas.dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gilmario
 * @param <T>
 * @param <PK>
 */
public abstract class DAO<T, PK extends Serializable> {

    @PersistenceContext
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public void salvar(T t) {
        getEntityManager().persist(t);
    }

    public T atualizar(T t) {
        return (T) getEntityManager().merge(t);
    }

    public void excluir(Class<T> entidade, PK id) {
        T t = carregar(entidade, id);
        getEntityManager().remove(t);
    }

    public T carregar(Class<T> entidade, PK pk) {
        return (T) getEntityManager().find(entidade, pk);
    }

}
