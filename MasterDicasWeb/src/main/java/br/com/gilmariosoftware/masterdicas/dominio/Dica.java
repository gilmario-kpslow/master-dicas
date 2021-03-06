package br.com.gilmariosoftware.masterdicas.dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Dica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String titulo;
    @XmlElement(required = true)
    @Column(nullable = false)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataCadastro;
    @JoinColumn(nullable = false)
    @ManyToOne
    private Usuario autor;
    @Column(length = 1000)
    private String referencias;
    @Column(nullable = false, length = 100000)
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusDica statusDica;
    @Column(length = 100000)
    private String observacao;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private final List<Tag> tags;

    public Dica() {
        tags = new ArrayList<>();
        statusDica = StatusDica.ATIVA;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public String getDataCadastroFormatada() {
        return dataCadastro.format(new DateTimeFormatterBuilder().appendPattern("dd/MM/yyyy").toFormatter());
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

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
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

    public StatusDica getStatusDica() {
        return statusDica;
    }

    public void setStatusDica(StatusDica statusDica) {
        this.statusDica = statusDica;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public enum StatusDica {
        ATIVA, INATIVA
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
        final Dica other = (Dica) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Dica{" + "titulo=" + titulo + ", autor=" + autor + ", tags=" + tags + '}';
    }

}
