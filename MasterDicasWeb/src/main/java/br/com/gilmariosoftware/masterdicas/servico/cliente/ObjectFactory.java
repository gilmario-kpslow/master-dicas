package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.com.gilmariosoftware.masterdicas.servico.cliente package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarDicasResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "BuscarDicasResponse");
    private final static QName _BuscarTagsResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "BuscarYagsResponse");
    private final static QName _Fault_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "Fault");
    private final static QName _Tag_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "tag");
    private final static QName _Dica_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "dica");
    private final static QName _ListaDeDicas_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "listaDeDicas");
    private final static QName _ListaDeTags_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "listaDeTags");
    private final static QName _AdicionarDicaResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "AdicionarDicaResponse");
    private final static QName _AdicionarTagResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "AdicionarTagResponse");
    private final static QName _AlterarDica_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "AlterarDica");
    private final static QName _BuscarDicas_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "BuscarDicas");
    private final static QName _BuscarUltimasDicas_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "BuscarUltimasDicas");
    private final static QName _BuscarUltimasDicasResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "BuscarUltimasDicasResponse");
    private final static QName _BuscarTags_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "BuscarTags");
    private final static QName _RemoverDica_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "RemoverDica");
    private final static QName _RemoverTag_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "RemoverTag");
    private final static QName _RemoverDicaResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "RemoverDicaResponse");
    private final static QName _RemoverTagResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "RemoverTagResponse");
    private final static QName _AdicionarDica_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "AdicionarDica");
    private final static QName _AdicionarTag_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "AdicionarTag");
    private final static QName _AlterarTagResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "AlterarTagResponse");
    private final static QName _AlterarDicaResponse_QNAME = new QName("http://mestredasdicas-gilserver.openshift.com", "AlterarDicaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.com.gilmariosoftware.masterdicas.servico.cliente.dicas
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarDicas }
     *
     * @return
     */
    public BuscarDicas createBuscarDicas() {
        return new BuscarDicas();
    }

    /**
     * Create an instance of {@link BuscarUltimasDicas }
     *
     * @return
     */
    public BuscarUltimasDicas createBuscarUltimasDicas() {
        return new BuscarUltimasDicas();
    }

    /**
     * Create an instance of {@link BuscarTags }
     *
     * @return
     */
    public BuscarTags createBuscarTags() {
        return new BuscarTags();
    }

    /**
     * Create an instance of {@link RemoverDica }
     *
     * @return
     */
    public RemoverDica createRemoverDica() {
        return new RemoverDica();
    }

    /**
     * Create an instance of {@link RemoverTag }
     *
     * @return
     */
    public RemoverTag createRemoverTag() {
        return new RemoverTag();
    }

    /**
     * Create an instance of {@link AdicionarDicaResponse }
     *
     * @return
     */
    public AdicionarDicaResponse createAdicionarDicaResponse() {
        return new AdicionarDicaResponse();
    }

    /**
     * Create an instance of {@link AdicionarTagResponse }
     *
     * @return
     */
    public AdicionarTagResponse createAdicionarTagResponse() {
        return new AdicionarTagResponse();
    }

    /**
     * Create an instance of {@link AlterarDica }
     *
     * @return
     */
    public AlterarDica createAlterarDica() {
        return new AlterarDica();
    }

    /**
     * Create an instance of {@link AdicionarDica }
     *
     * @return
     */
    public AdicionarDica createAdicionarDica() {
        return new AdicionarDica();
    }

    /**
     * Create an instance of {@link AdicionarTag }
     *
     * @return
     */
    public AdicionarTag createAdicionarTag() {
        return new AdicionarTag();
    }

    /**
     * Create an instance of {@link AlterarDicaResponse }
     *
     * @return
     */
    public AlterarDicaResponse createAlterarDicaResponse() {
        return new AlterarDicaResponse();
    }

    /**
     * Create an instance of {@link RemoverDicaResponse }
     *
     * @return
     */
    public RemoverDicaResponse createRemoverDicaResponse() {
        return new RemoverDicaResponse();
    }

    /**
     * Create an instance of {@link RemoverTagResponse }
     *
     * @return
     */
    public RemoverTagResponse createRemoverTagResponse() {
        return new RemoverTagResponse();
    }

    /**
     * Create an instance of {@link BuscarDicasResponse }
     *
     * @return
     */
    public BuscarDicasResponse createBuscarDicasResponse() {
        return new BuscarDicasResponse();
    }

    /**
     * Create an instance of {@link BuscarDicasUltimasResponse }
     *
     * @return
     */
    public BuscarUltimasDicasResponse createBuscarUltimasDicasResponse() {
        return new BuscarUltimasDicasResponse();
    }

    /**
     * Create an instance of {@link BuscarTagsResponse }
     *
     * @return
     */
    public BuscarTagsResponse createBuscarTagsResponse() {
        return new BuscarTagsResponse();
    }

    /**
     * Create an instance of {@link Tag }
     *
     * @return
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link Dica }
     *
     * @return
     */
    public Dica createDica() {
        return new Dica();
    }

    /**
     * Create an instance of {@link ListaDeDicas }
     *
     * @return
     */
    public ListaDeDicas createListaDeDicas() {
        return new ListaDeDicas();
    }

    /**
     * Create an instance of {@link ListaDeTags }
     *
     * @return
     */
    public ListaDeTags createListaDeTags() {
        return new ListaDeTags();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BuscarDicasResponse }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "BuscarDicasResponse")
    public JAXBElement<BuscarDicasResponse> createBuscarDicasResponse(BuscarDicasResponse value) {
        return new JAXBElement<>(_BuscarDicasResponse_QNAME, BuscarDicasResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BuscarUltimasDicasResponse }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "BuscarUltimasDicasResponse")
    public JAXBElement<BuscarUltimasDicasResponse> createBuscarUltimasDicasResponse(BuscarUltimasDicasResponse value) {
        return new JAXBElement<>(_BuscarUltimasDicasResponse_QNAME, BuscarUltimasDicasResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BuscarTagsResponse }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "BuscarTagsResponse")
    public JAXBElement<BuscarTagsResponse> createBuscarTagsResponse(BuscarTagsResponse value) {
        return new JAXBElement<>(_BuscarTagsResponse_QNAME, BuscarTagsResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "Fault")
    public JAXBElement<String> createFault(String value) {
        return new JAXBElement<>(_Fault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tag }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "tag")
    public JAXBElement<Tag> createTag(Tag value) {
        return new JAXBElement<>(_Tag_QNAME, Tag.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link Dica }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "dica")
    public JAXBElement<Dica> createDica(Dica value) {
        return new JAXBElement<>(_Dica_QNAME, Dica.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link ListaDeDicas }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "listaDeDicas")
    public JAXBElement<ListaDeDicas> createListaDeDicas(ListaDeDicas value) {
        return new JAXBElement<>(_ListaDeDicas_QNAME, ListaDeDicas.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link ListaDeTags }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "listaDeTags")
    public JAXBElement<ListaDeTags> createListaDeDicas(ListaDeTags value) {
        return new JAXBElement<>(_ListaDeTags_QNAME, ListaDeTags.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link AdicionarTagResponse }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "AdicionarTagResponse")
    public JAXBElement<AdicionarTagResponse> createAdicionarDicaResponse(AdicionarTagResponse value) {
        return new JAXBElement<>(_AdicionarTagResponse_QNAME, AdicionarTagResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link AlterarDica }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "AlterarDica")
    public JAXBElement<AlterarDica> createAlterarDica(AlterarDica value) {
        return new JAXBElement<>(_AlterarDica_QNAME, AlterarDica.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BuscarDicas }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "BuscarDicas")
    public JAXBElement<BuscarDicas> createBuscarDicas(BuscarDicas value) {
        return new JAXBElement<>(_BuscarDicas_QNAME, BuscarDicas.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BuscarUltimasDicas }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "BuscarUltimasDicas")
    public JAXBElement<BuscarUltimasDicas> createBuscarUltimasDicas(BuscarUltimasDicas value) {
        return new JAXBElement<>(_BuscarUltimasDicas_QNAME, BuscarUltimasDicas.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BuscarTags }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "BuscarTags")
    public JAXBElement<BuscarTags> createBuscarTags(BuscarTags value) {
        return new JAXBElement<>(_BuscarTags_QNAME, BuscarTags.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RemoverDica }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "RemoverDica")
    public JAXBElement<RemoverDica> createRemoverDica(RemoverDica value) {
        return new JAXBElement<>(_RemoverDica_QNAME, RemoverDica.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RemoverTag }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "RemoverTag")
    public JAXBElement<RemoverTag> createRemoverDica(RemoverTag value) {
        return new JAXBElement<>(_RemoverTag_QNAME, RemoverTag.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RemoverDicaResponse }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "RemoverDicaResponse")
    public JAXBElement<RemoverDicaResponse> createRemoverDicaResponse(RemoverDicaResponse value) {
        return new JAXBElement<>(_RemoverDicaResponse_QNAME, RemoverDicaResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RemoverTagResponse }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "RemoverTagResponse")
    public JAXBElement<RemoverTagResponse> createRemoverTagResponse(RemoverTagResponse value) {
        return new JAXBElement<>(_RemoverTagResponse_QNAME, RemoverTagResponse.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link AdicionarDica }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "AdicionarDica")
    public JAXBElement<AdicionarDica> createAdicionarDica(AdicionarDica value) {
        return new JAXBElement<>(_AdicionarDica_QNAME, AdicionarDica.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link AdicionarTag }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "AdicionarTag")
    public JAXBElement<AdicionarTag> createAdicionarTag(AdicionarTag value) {
        return new JAXBElement<>(_AdicionarTag_QNAME, AdicionarTag.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link AlterarDicaResponse }{@code >}}
     *
     * @param value
     * @return
     */
    @XmlElementDecl(namespace = "http://mestredasdicas-gilserver.openshift.com", name = "AlterarDicaResponse")
    public JAXBElement<AlterarDicaResponse> createAlterarDicaResponse(AlterarDicaResponse value) {
        return new JAXBElement<>(_AlterarDicaResponse_QNAME, AlterarDicaResponse.class, null, value);
    }

}
