/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.dao;

import br.com.gilmariosoftware.masterdicas.dominio.Senha;
import br.com.gilmariosoftware.masterdicas.dominio.Senha_;
import br.com.gilmariosoftware.masterdicas.dominio.Usuario;
import br.com.gilmariosoftware.masterdicas.dominio.Usuario_;
import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

/**
 *
 * @author gilmario
 */
@Stateless
public class UsuarioDAO extends DAO<Usuario, Long> {

    public Usuario encontraPor(String login, String email) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Usuario> query = cb.createQuery(Usuario.class);
        Root<Usuario> usuarioRoot = query.from(Usuario.class);
        query.where(cb.equal(usuarioRoot.get(Usuario_.login), login), cb.equal(usuarioRoot.get(Usuario_.email), email));
        return getEntityManager().createQuery(query).getSingleResult();
    }

    public Usuario encontraPorSemSenha(String login, String email) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Usuario> query = cb.createQuery(Usuario.class);
        Root<Usuario> usuarioRoot = query.from(Usuario.class);
        query.where(cb.equal(usuarioRoot.get(Usuario_.login), login),
                cb.equal(usuarioRoot.get(Usuario_.email), email),
                cb.isNull(usuarioRoot.get(Usuario_.senha))
        );
        return getEntityManager().createQuery(query).getSingleResult();
    }

    public Usuario login(String login, String senha) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Usuario> query = cb.createQuery(Usuario.class);
        Root<Usuario> usuarioRoot = query.from(Usuario.class);
        Join<Usuario, Senha> senhaRoot = usuarioRoot.join(Usuario_.senha);
        query.where(cb.equal(usuarioRoot.get(Usuario_.login), login),
                cb.equal(senhaRoot.get(Senha_.hashing), senha)
        );
        return getEntityManager().createQuery(query).getSingleResult();
    }

}
