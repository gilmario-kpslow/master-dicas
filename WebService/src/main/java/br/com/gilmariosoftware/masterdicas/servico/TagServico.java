package br.com.gilmariosoftware.masterdicas.servico;

import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import br.com.gilmariosoftware.masterdicas.negocio.TagNegocio;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.jws.WebService;

/**
 *
 * @author gilmario
 */
@WebService(endpointInterface = "br.com.gilmariosoftware.masterdicas.servico.TagServicoInterface", serviceName = "TagWS", portName = "TagWSPort")
@Singleton
public class TagServico implements TagServicoInterface {

    @EJB
    private TagNegocio negocio;

    @Override
    public ListaDeTag buscar(String nome) throws FaultException {
        try {
            return new ListaDeTag(negocio.buscarPor(nome));
        } catch (Exception e) {
            throw new FaultException(e.getMessage());
        }
    }

    @Override
    public Tag adicionarTag(Tag tag) throws FaultException {
        try {
            return negocio.adicionarTag(tag);
        } catch (Exception e) {
            throw new FaultException(e.getMessage());
        }
    }

    @Override
    public String removerTag(Tag tag) throws FaultException {
        try {
            negocio.removerTag(tag);
            return "Tag removida com sucesso!!!";
        } catch (Exception e) {
            throw new FaultException(e.getMessage());
        }
    }

}
