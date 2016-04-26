package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de AdicionarTagResponse complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="AdicionarTagResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tag" type="{http://mestredasdicas-gilserver.openshift.com}tag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdicionarTagResponse", propOrder = {
    "tag"
})
public class AdicionarTagResponse {

    protected Tag tag;

    /**
     * Obtém o valor da propriedade tag.
     *
     * @return possible object is {@link tag }
     *
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * Define o valor da propriedade tag.
     *
     * @param value allowed object is {@link tag }
     *
     */
    public void setTag(Tag value) {
        this.tag = value;
    }

}
