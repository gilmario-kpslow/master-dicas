package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de statusDica.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * <p>
 *
 * <pre>
 * &lt;simpleType name="statusDica">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ativa"/>
 *     &lt;enumeration value="Inativa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "statusDica")
@XmlEnum
public enum StatusDica {

    @XmlEnumValue("Ativa")
    ATIVA("Ativa"),
    @XmlEnumValue("Inativa")
    INATIVA("Inativa");
    private final String value;

    StatusDica(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusDica fromValue(String v) {
        for (StatusDica c : StatusDica.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
