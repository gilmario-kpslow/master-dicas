package br.com.gilmariosoftware.masterdicas.servico;

import br.com.gilmariosoftware.masterdicas.dominio.Dica;
import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import java.util.List;
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
public interface DicaServicoInterface {

    @WebResult(name = "dicas")
    @RequestWrapper(localName = "BuscarDicas")
    @WebMethod(operationName = "BuscarDicas")
    @ResponseWrapper(localName = "BuscarDicasResponse")
    public ListaDeDicas buscarDicas(@WebParam(partName = "tags", name = "tags") List<Tag> tags, @WebParam(partName = "titulo", name = "titulo") String titulo) throws FaultException;

    @WebResult(name = "dicas")
    @RequestWrapper(localName = "BuscarUltimasDicas")
    @WebMethod(operationName = "BuscarUltimasDicas")
    @ResponseWrapper(localName = "BuscarUltimasDicasResponse")
    public ListaDeDicas buscarUltimasDicas() throws FaultException;

    @WebResult(name = "dica")
    @RequestWrapper(localName = "AdicionarDica")
    @WebMethod(operationName = "AdicionarDica")
    @ResponseWrapper(localName = "AdicionarDicaResponse")
    public Dica adicionarDica(@WebParam(partName = "dica") Dica dica) throws FaultException;

    @WebResult(name = "dica")
    @RequestWrapper(localName = "AlterarDica")
    @WebMethod(operationName = "AlterarDica")
    @ResponseWrapper(localName = "AlterarDicaResponse")
    public Dica alterarDica(@WebParam(partName = "dica") Dica dica) throws FaultException;

    @WebResult(name = "informacao")
    @RequestWrapper(localName = "RemoverDica")
    @WebMethod(operationName = "RemoverDica")
    @ResponseWrapper(localName = "RemoverDicaResponse")
    public String removerDica(@WebParam(partName = "dica", name = "RemoverDica") Dica dica) throws FaultException;

    @WebResult(name = "tags")
    @RequestWrapper(localName = "BuscarTags")
    @WebMethod(operationName = "BuscarTags")
    @ResponseWrapper(localName = "BuscarTagsResponse")
    public ListaDeTag buscarTags(@WebParam(partName = "nome") String nome) throws FaultException;

    @WebResult(name = "tag")
    @RequestWrapper(localName = "AdicionarTag")
    @WebMethod(operationName = "AdicionarTag")
    @ResponseWrapper(localName = "AdicionarTagResponse")
    public Tag adicionarTag(@WebParam(partName = "tag") Tag tag) throws FaultException;

    @WebResult(name = "informacao")
    @RequestWrapper(localName = "RemoverTag")
    @WebMethod(operationName = "RemoverTag")
    @ResponseWrapper(localName = "RemoverTagResponse")
    public String removerTag(@WebParam(partName = "tag", name = "RemoverTag") Tag tag) throws FaultException;
}
