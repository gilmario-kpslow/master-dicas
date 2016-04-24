package br.com.gilmariosoftware.masterdicas.servico;

import br.com.gilmariosoftware.masterdicas.dominio.Dica;
import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import br.com.gilmariosoftware.masterdicas.negocio.DicaNegocio;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.jws.WebService;

/**
 *
 * @author gilmario
 */
@WebService(endpointInterface = "br.com.gilmariosoftware.masterdicas.servico.DicaServicoInterface", serviceName = "DicaWS", portName = "DicaWSPort")
@Singleton
public class DicaServico implements DicaServicoInterface {

    @EJB
    private DicaNegocio negocio;

    @Override
    public ListaDeDicas buscar(List<Tag> tags, String titulo) throws FaultException {
        try {
            return new ListaDeDicas(negocio.buscarPor(tags, titulo));
        } catch (Exception e) {
            throw new FaultException(e.getMessage());
        }
    }

    @Override
    public Dica adicionarDica(Dica dica) throws FaultException {
        try {
            return negocio.adicionarDica(dica);
        } catch (Exception e) {
            throw new FaultException(e.getMessage());
        }
    }

    @Override
    public Dica alterarDica(Dica dica) throws FaultException {
        try {
            return negocio.alterarDica(dica);
        } catch (Exception e) {
            throw new FaultException(e.getMessage());
        }
    }

    @Override
    public String removerDica(Dica dica) throws FaultException {
        try {
            negocio.removerDica(dica);
            return "Dica removida com sucesso!!!";
        } catch (Exception e) {
            throw new FaultException(e.getMessage());
        }
    }

}