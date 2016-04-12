package br.com.gilmariosoftware.masterdicas.servico;

import br.com.gilmariosoftware.masterdicas.dominio.Tag;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author gilmario
 */
@WebService(serviceName = "tagServico")
public class TagServico implements TagServicoInterface {

    @Override
    @WebMethod
    public List<Tag> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @WebMethod(operationName = "testando")
    public String testando() {
        return "tetes OK";
    }

}
