package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de RemoverDicaResponse complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="RemoverDicaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RemoverDicaResponse {

    protected String informacao;

    /**
     * Obtém o valor da propriedade informacao.
     *
     * @return possible object is {@link String }
     *
     */
    public String getInformacao() {
        return informacao;
    }

    /**
     * Define o valor da propriedade informacao.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setInformacao(String value) {
        this.informacao = value;
    }

}
