package br.com.gilmariosoftware.masterdicas.servico;

import javax.xml.ws.WebFault;

/**
 *
 * @author gilmario
 */
@WebFault(name = "Fault", faultBean = "Fault")
public class FaultException extends Exception {

    public FaultException() {
        super();
    }

    public FaultException(String message) {
        super(message);
    }

    public String getFaultInfo() {
        return getMessage();
    }

}
