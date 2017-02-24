package br.com.gilmariosoftware.masterdicas.dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gilmario
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ideia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @XmlElement(required = true)
    @Column(nullable = false)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataCadastro;
    @JoinColumn(nullable = false)
    @ManyToOne
    private Usuario autor;
    @Column(nullable = false, length = 100000)
    private String descricao;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private final List<Tag> tags;

    public Ideia() {
        tags = new ArrayList<>();
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public void removeTag(Tag tag) {
        tags.remove(tag);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Tag> getTags() {
        return Collections.unmodifiableList(tags);
    }

    public enum StatusDica {
        Ativa, Inativa
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ideia other = (Ideia) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Ideia{" + "nome=" + nome + ", tags=" + tags + '}';
    }

}
