package br.com.gilmariosoftware.masterdicas.util;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author gilmario
 */
@Stateless
public class GeradorMensagem implements Serializable {

    public void gerar(String titulo, String mensagem, FacesMessage.Severity severidade) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severidade, titulo, mensagem));
    }

    public void info(String mensagem) {
        gerar("Informação", mensagem, FacesMessage.SEVERITY_INFO);
    }

    public void alerta(String mensagem) {
        gerar("Atenção", mensagem, FacesMessage.SEVERITY_WARN);
    }

    public void erro(String mensagem) {
        gerar("Erro", mensagem, FacesMessage.SEVERITY_ERROR);
    }

}
