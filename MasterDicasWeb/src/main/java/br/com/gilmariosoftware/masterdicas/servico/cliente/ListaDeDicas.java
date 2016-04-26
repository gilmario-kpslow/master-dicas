package br.com.gilmariosoftware.masterdicas.servico.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de listaDeDicas complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="listaDeDicas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dicas" type="{http://mestredasdicas-gilserver.openshift.com}dica" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaDeDicas", propOrder = {
    "dicas"
})
public class ListaDeDicas {

    @XmlElement(nillable = true)
    protected List<Dica> dicas;

    /**
     * Gets the value of the dicas property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the dicas property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDicas().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Dica }
     *
     *
     * @return
     */
    public List<Dica> getDicas() {
        if (dicas == null) {
            dicas = new ArrayList<>();
        }
        return this.dicas;
    }

}
