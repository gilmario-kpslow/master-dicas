package br.com.gilmariosoftware.masterdicas.servico.cliente;

import br.com.gilmariosoftware.masterdicas.servico.TagServicoInterface;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author gilmario
 */
@Stateless
public class TagServicoCliente {

    @WebServiceRef(wsdlLocation = "http://localhost:8080/masterdicas/tagServico?wsdl")
    private TagServicoInterface servicoInterface;

    public static void main(String[] args) {
        TagServicoCliente t = new TagServicoCliente();
        System.err.println(t.servicoInterface.testando());
    }

}
