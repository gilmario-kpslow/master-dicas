package br.com.gilmariosoftware.masterdicas.servico;

import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author gilmario
 */
@WebService(targetNamespace = "http://mestredasdicas-gilserver.openshift.com")
public interface TagServicoInterface {

    @WebResult(name = "tags")
    @RequestWrapper(localName = "BuscarTags")
    @WebMethod(operationName = "BuscarTags")
    @ResponseWrapper(localName = "BuscarTagsResponse")
    public ListaDeTag buscar(@WebParam(partName = "nome") String nome) throws FaultException;

    @WebResult(name = "tag")
    @RequestWrapper(localName = "AdicionarTag")
    @WebMethod(operationName = "AdicionarTag")
    @ResponseWrapper(localName = "AdicionarTagResponse")
    public Tag adicionarTag(@WebParam(partName = "tag", name = "AdicionarTag") Tag tag) throws FaultException;

    @WebResult(name = "informacao")
    @RequestWrapper(localName = "RemoverTag")
    @WebMethod(operationName = "RemoverTag")
    @ResponseWrapper(localName = "RemoverTagResponse")
    public String removerTag(@WebParam(partName = "tag", name = "RemoverTag") Tag tag) throws FaultException;
}
