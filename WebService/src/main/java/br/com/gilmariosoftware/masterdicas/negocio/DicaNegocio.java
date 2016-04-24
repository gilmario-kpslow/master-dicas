package br.com.gilmariosoftware.masterdicas.negocio;

import br.com.gilmariosoftware.masterdicas.dao.DicaDAO;
import br.com.gilmariosoftware.masterdicas.dominio.Dica;
import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author gilmario
 */
@Stateless
public class DicaNegocio implements Serializable {

    @EJB
    private DicaDAO dao;

    public Dica adicionarDica(Dica dica) throws Exception {
        dica.setDataCadastro(Calendar.getInstance());
        dao.salvar(dica);
        return dica;
    }

    public Dica alterarDica(Dica dica) throws Exception {
        return dao.atualizar(dica);
    }

    public void removerDica(Dica dica) throws Exception {
        dao.excluir(dica);
    }

    public List<Dica> buscarPor(List<Tag> tags, String titulo) throws Exception {
        return dao.buscarPor(tags, titulo);
    }

}
