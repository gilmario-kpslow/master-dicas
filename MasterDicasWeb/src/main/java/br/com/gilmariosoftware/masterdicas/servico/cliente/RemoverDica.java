package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de RemoverDica complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="RemoverDica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoverDica" type="{http://mestredasdicas-gilserver.openshift.com}dica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoverDica", propOrder = {
    "removerDica"
})
public class RemoverDica {

    @XmlElement(name = "RemoverDica")
    protected Dica removerDica;

    /**
     * Obtém o valor da propriedade removerDica.
     *
     * @return possible object is {@link Dica }
     *
     */
    public Dica getRemoverDica() {
        return removerDica;
    }

    /**
     * Define o valor da propriedade removerDica.
     *
     * @param value allowed object is {@link Dica }
     *
     */
    public void setRemoverDica(Dica value) {
        this.removerDica = value;
    }

}
