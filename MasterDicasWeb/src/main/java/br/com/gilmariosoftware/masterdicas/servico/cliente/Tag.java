package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de tag complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="tag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Tag {

    @XmlElement(required = true)
    protected String nome;

    /**
     * Obtém o valor da propriedade nome.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNome(String value) {
        this.nome = value;
    }

}
