package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de AdicionarDicaResponse complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="AdicionarDicaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dica" type="{http://mestredasdicas-gilserver.openshift.com}dica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AdicionarDicaResponse {

    protected Dica dica;

    /**
     * Obtém o valor da propriedade dica.
     *
     * @return possible object is {@link Dica }
     *
     */
    public Dica getDica() {
        return dica;
    }

    /**
     * Define o valor da propriedade dica.
     *
     * @param value allowed object is {@link Dica }
     *
     */
    public void setDica(Dica value) {
        this.dica = value;
    }

}
