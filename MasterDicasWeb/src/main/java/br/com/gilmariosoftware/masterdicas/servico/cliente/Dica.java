package br.com.gilmariosoftware.masterdicas.servico.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java de dica complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="dica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDica" type="{http://mestredasdicas-gilserver.openshift.com}statusDica" minOccurs="0"/>
 *         &lt;element name="obervacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tags" type="{http://mestredasdicas-gilserver.openshift.com}tag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dica", propOrder = {
    "id",
    "titulo",
    "dataCadastro",
    "autor",
    "referencias",
    "descricao",
    "statusDica",
    "obervacao",
    "tags"
})
public class Dica {

    protected Long id;
    protected String titulo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCadastro;
    protected String autor;
    protected String referencias;
    protected String descricao;
    protected StatusDica statusDica;
    protected String obervacao;
    @XmlElement(nillable = true)
    protected List<Tag> tags;

    /**
     * Obtém o valor da propriedade id.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setId(Long value) {
        this.id = value;
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

    /**
     * Obtém o valor da propriedade dataCadastro.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDataCadastro(XMLGregorianCalendar value) {
        this.dataCadastro = value;
    }

    /**
     * Obtém o valor da propriedade autor.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Define o valor da propriedade autor.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAutor(String value) {
        this.autor = value;
    }

    /**
     * Obtém o valor da propriedade referencias.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReferencias() {
        return referencias;
    }

    /**
     * Define o valor da propriedade referencias.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReferencias(String value) {
        this.referencias = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade statusDica.
     *
     * @return possible object is {@link StatusDica }
     *
     */
    public StatusDica getStatusDica() {
        return statusDica;
    }

    /**
     * Define o valor da propriedade statusDica.
     *
     * @param value allowed object is {@link StatusDica }
     *
     */
    public void setStatusDica(StatusDica value) {
        this.statusDica = value;
    }

    /**
     * Obtém o valor da propriedade obervacao.
     *
     * @return possible object is {@link String }
     *
     */
    public String getObervacao() {
        return obervacao;
    }

    /**
     * Define o valor da propriedade obervacao.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setObervacao(String value) {
        this.obervacao = value;
    }

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

    public String getSimpleDescricao() {
        if (this.descricao != null) {
            if (this.descricao.length() >= 15) {
                return this.descricao.substring(0, 15).concat("...");
            } else {
                return this.descricao.concat("...");
            }
        }
        return this.descricao;
    }

}
