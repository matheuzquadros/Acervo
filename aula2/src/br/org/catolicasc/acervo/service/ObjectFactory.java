
package br.org.catolicasc.acervo.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.org.catolicasc.acervo.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarLivro_QNAME = new QName("http://service.acervo.catolicasc.org.br/", "listarLivro");
    private final static QName _ListarLivroResponse_QNAME = new QName("http://service.acervo.catolicasc.org.br/", "listarLivroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.org.catolicasc.acervo.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarLivro }
     * 
     */
    public ListarLivro createListarLivro() {
        return new ListarLivro();
    }

    /**
     * Create an instance of {@link ListarLivroResponse }
     * 
     */
    public ListarLivroResponse createListarLivroResponse() {
        return new ListarLivroResponse();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.acervo.catolicasc.org.br/", name = "listarLivro")
    public JAXBElement<ListarLivro> createListarLivro(ListarLivro value) {
        return new JAXBElement<ListarLivro>(_ListarLivro_QNAME, ListarLivro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.acervo.catolicasc.org.br/", name = "listarLivroResponse")
    public JAXBElement<ListarLivroResponse> createListarLivroResponse(ListarLivroResponse value) {
        return new JAXBElement<ListarLivroResponse>(_ListarLivroResponse_QNAME, ListarLivroResponse.class, null, value);
    }

}
