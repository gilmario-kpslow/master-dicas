package br.com.gilmariosoftware.masterdicas.servico.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de BuscarDicas complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="BuscarDicas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tags" type="{http://mestredasdicas-gilserver.openshift.com}tag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarDicas", propOrder = {
    "tags",
    "titulo"
})
public class BuscarDicas {

    protected List<Tag> tags;
    protected String titulo;

    /**
     * Gets the value of the tags property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the tags property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTags().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Tag }
     *
     *
     * @return
     */
    public List<Tag> getTags() {
        if (tags == null) {
            tags = new ArrayList<>();
        }
        return this.tags;
    }

    /**
     * Obtém o valor da propriedade titulo.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
