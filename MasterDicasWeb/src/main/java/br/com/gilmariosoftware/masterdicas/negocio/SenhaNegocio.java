package br.com.gilmariosoftware.masterdicas.negocio;

import br.com.gilmariosoftware.masterdicas.dao.SenhaDAO;
import br.com.gilmariosoftware.masterdicas.dominio.Senha;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author gilmario
 */
@Stateless
public class SenhaNegocio implements Serializable {

    @EJB
    private SenhaDAO dao;

    public Senha salvar(Senha senha) throws Exception {
        senha.criptografar();
        dao.salvar(senha);
        return senha;
    }

    public void excluir(Senha senha) throws Exception {
        dao.excluir(Senha.class, senha.getId());
    }

}
