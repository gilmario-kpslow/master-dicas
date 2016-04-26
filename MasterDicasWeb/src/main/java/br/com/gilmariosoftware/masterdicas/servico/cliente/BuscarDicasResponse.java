package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de BuscarDicasResponse complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="BuscarDicasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dicas" type="{http://mestredasdicas-gilserver.openshift.com}listaDeDicas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarDicasResponse", propOrder = {
    "dicas"
})
public class BuscarDicasResponse {

    protected ListaDeDicas dicas;

    /**
     * Obtém o valor da propriedade dicas.
     *
     * @return possible object is {@link ListaDeDicas }
     *
     */
    public ListaDeDicas getDicas() {
        return dicas;
    }

    /**
     * Define o valor da propriedade dicas.
     *
     * @param value allowed object is {@link ListaDeDicas }
     *
     */
    public void setDicas(ListaDeDicas value) {
        this.dicas = value;
    }

}
