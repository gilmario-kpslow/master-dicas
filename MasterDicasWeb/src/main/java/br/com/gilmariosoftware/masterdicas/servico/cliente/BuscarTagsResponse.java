package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de BuscarTagsResponse complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="BuscarTagsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tags" type="{http://mestredasdicas-gilserver.openshift.com}listaDeTags" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BuscarTagsResponse {

    protected ListaDeTags tags;

    /**
     * Obtém o valor da propriedade tags.
     *
     * @return possible object is {@link ListaDeTags }
     *
     */
    public ListaDeTags getTags() {
        return tags;
    }

    /**
     * Define o valor da propriedade tags.
     *
     * @param value allowed object is {@link ListaDeTags }
     *
     */
    public void setDicas(ListaDeTags value) {
        this.tags = value;
    }

}
