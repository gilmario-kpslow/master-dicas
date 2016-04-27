package br.com.gilmariosoftware.masterdicas.servico;

import br.com.gilmariosoftware.masterdicas.dominio.Dica;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gilmario
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaDeDicas {

    private List<Dica> dicas;

    public ListaDeDicas() {
    }

    public ListaDeDicas(List<Dica> dicas) {
        this.dicas = dicas;
    }

    public List<Dica> getDicas() {
        return dicas;
    }

    public void setDicas(List<Dica> dicas) {
        this.dicas = dicas;
    }

}
