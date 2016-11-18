
package org.soap.web.service_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soap.web.service_client package. 
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

    private final static QName _AddProduct_QNAME = new QName("http://www.TestCatalog.com", "addProduct");
    private final static QName _GetCatalogCategories_QNAME = new QName("http://www.TestCatalog.com", "getCatalogCategories");
    private final static QName _GetProductsV2Response_QNAME = new QName("http://www.TestCatalog.com", "getProductsV2Response");
    private final static QName _GetCatalogCategoriesResponse_QNAME = new QName("http://www.TestCatalog.com", "getCatalogCategoriesResponse");
    private final static QName _GetProducts_QNAME = new QName("http://www.TestCatalog.com", "getProducts");
    private final static QName _Product_QNAME = new QName("http://www.TestCatalog.com", "Product");
    private final static QName _AddProductResponse_QNAME = new QName("http://www.TestCatalog.com", "addProductResponse");
    private final static QName _GetProductsResponse_QNAME = new QName("http://www.TestCatalog.com", "getProductsResponse");
    private final static QName _GetProductsV2_QNAME = new QName("http://www.TestCatalog.com", "getProductsV2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soap.web.service_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductsV2Response }
     * 
     */
    public GetProductsV2Response createGetProductsV2Response() {
        return new GetProductsV2Response();
    }

    /**
     * Create an instance of {@link GetCatalogCategoriesResponse }
     * 
     */
    public GetCatalogCategoriesResponse createGetCatalogCategoriesResponse() {
        return new GetCatalogCategoriesResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link GetCatalogCategories }
     * 
     */
    public GetCatalogCategories createGetCatalogCategories() {
        return new GetCatalogCategories();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductsV2 }
     * 
     */
    public GetProductsV2 createGetProductsV2() {
        return new GetProductsV2();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "getCatalogCategories")
    public JAXBElement<GetCatalogCategories> createGetCatalogCategories(GetCatalogCategories value) {
        return new JAXBElement<GetCatalogCategories>(_GetCatalogCategories_QNAME, GetCatalogCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "getProductsV2Response")
    public JAXBElement<GetProductsV2Response> createGetProductsV2Response(GetProductsV2Response value) {
        return new JAXBElement<GetProductsV2Response>(_GetProductsV2Response_QNAME, GetProductsV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "getCatalogCategoriesResponse")
    public JAXBElement<GetCatalogCategoriesResponse> createGetCatalogCategoriesResponse(GetCatalogCategoriesResponse value) {
        return new JAXBElement<GetCatalogCategoriesResponse>(_GetCatalogCategoriesResponse_QNAME, GetCatalogCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.TestCatalog.com", name = "getProductsV2")
    public JAXBElement<GetProductsV2> createGetProductsV2(GetProductsV2 value) {
        return new JAXBElement<GetProductsV2>(_GetProductsV2_QNAME, GetProductsV2 .class, null, value);
    }

}
