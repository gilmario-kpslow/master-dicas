package br.com.gilmariosoftware.masterdicas.negocio;

import br.com.gilmariosoftware.masterdicas.dao.UsuarioDAO;
import br.com.gilmariosoftware.masterdicas.dominio.Usuario;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author gilmario
 */
@Stateless
public class UsuarioNegocio implements Serializable {

    @EJB
    private UsuarioDAO dao;

    public Usuario salvar(Usuario usuario) throws Exception {
        dao.salvar(usuario);
        return usuario;
    }

    public Usuario alterar(Usuario usuario) throws Exception {
        return dao.atualizar(usuario);
    }

    public void excluir(Usuario usuario) throws Exception {
        dao.excluir(Usuario.class, usuario.getId());
    }

    public Usuario encontrarPorLoginEmail(String login, String email) {
        return dao.encontraPor(login, email);
    }

    public Usuario encontrarPorLoginEmailSemSenha(String login, String email) {
        return dao.encontraPorSemSenha(login, email);
    }

    public Usuario logar(String login, String senha) {
        return dao.login(login, senha);
    }

}
