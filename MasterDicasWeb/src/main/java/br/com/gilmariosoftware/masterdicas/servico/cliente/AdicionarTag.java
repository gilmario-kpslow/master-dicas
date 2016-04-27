package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de AdicionarTag complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="AdicionarTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://mestredasdicas-gilserver.openshift.com}tag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdicionarTag", propOrder = {
    "arg0"
})
public class AdicionarTag {

    protected Tag arg0;

    /**
     * Obtém o valor da propriedade arg0.
     *
     * @return possible object is {@link Tag }
     *
     */
    public Tag getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     *
     * @param value allowed object is {@link Tag }
     *
     */
    public void setArg0(Tag value) {
        this.arg0 = value;
    }

}
