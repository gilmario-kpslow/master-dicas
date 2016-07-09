package br.com.gilmariosoftware.masterdicas.servico;

import br.com.gilmariosoftware.masterdicas.dominio.Dica;
import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author gilmario
 */
@WebService(targetNamespace = "http://mestredasdicas-gilserver.openshift.com")
public interface DicaServicoInterface {

    @WebResult(name = "dicas")
    @WebMethod(operationName = "BuscarDicas")
    public ListaDeDicas buscarDicas(@WebParam(name = "tags") List<Tag> tags, @WebParam(name = "titulo") String titulo) throws FaultException;

    @WebResult(name = "dicas")
    @WebMethod(operationName = "BuscarUltimasDicas")
    public ListaDeDicas buscarUltimasDicas() throws FaultException;

    @WebResult(name = "dica")
    @WebMethod(operationName = "AdicionarDica")
    public Dica adicionarDica(@WebParam(name = "dica") Dica dica) throws FaultException;

    @WebResult(name = "dica")
    @WebMethod(operationName = "AlterarDica")
    public Dica alterarDica(@WebParam(name = "dica") Dica dica) throws FaultException;

    @WebResult(name = "informacao")
    @WebMethod(operationName = "RemoverDica")
    public String removerDica(@WebParam(name = "dica") Dica dica) throws FaultException;

    @WebResult(name = "tags")
    @WebMethod(operationName = "BuscarTags")
    public ListaDeTag buscarTags(@WebParam(name = "nome") String nome) throws FaultException;

    @WebResult(name = "tags")
    @WebMethod(operationName = "PaginarTags")
    public ListaDeTag paginarTags(@WebParam(name = "nome") String nome, @WebParam(name = "inicio") int inicio, @WebParam(name = "quantidade") int quantidade) throws FaultException;

    @WebResult(name = "tag")
    @WebMethod(operationName = "AdicionarTag")
    public Tag adicionarTag(@WebParam(name = "tag") Tag tag) throws FaultException;

    @WebResult(name = "informacao")
    @WebMethod(operationName = "RemoverTag")
    public String removerTag(@WebParam(name = "tag") Tag tag) throws FaultException;

    @WebResult(name = "total")
    @WebMethod(operationName = "TotalTags")
    public Long totalTags(@WebParam(name = "nome") String nome) throws FaultException;
}
