package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de RemoverTag complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="RemoverTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoverTag" type="{http://mestredasdicas-gilserver.openshift.com}tag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoverTag", propOrder = {
    "removerTag"
})
public class RemoverTag {

    @XmlElement(name = "RemoverTag")
    protected Tag removerTag;

    /**
     * Obtém o valor da propriedade removerTag.
     *
     * @return possible object is {@link Tag }
     *
     */
    public Tag getRemoverTag() {
        return removerTag;
    }

    /**
     * Define o valor da propriedade removerTag.
     *
     * @param value allowed object is {@link Tag }
     *
     */
    public void setRemoverTag(Tag value) {
        this.removerTag = value;
    }

}
