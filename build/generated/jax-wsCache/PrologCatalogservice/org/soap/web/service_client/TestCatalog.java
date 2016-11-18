
package org.soap.web.service_client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestCatalog", targetNamespace = "http://www.TestCatalog.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestCatalog {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatalogCategories", targetNamespace = "http://www.TestCatalog.com", className = "org.soap.web.service_client.GetCatalogCategories")
    @ResponseWrapper(localName = "getCatalogCategoriesResponse", targetNamespace = "http://www.TestCatalog.com", className = "org.soap.web.service_client.GetCatalogCategoriesResponse")
    @Action(input = "http://www.TestCatalog.com/TestCatalog/getCatalogCategoriesRequest", output = "http://www.TestCatalog.com/TestCatalog/getCatalogCategoriesResponse")
    public List<String> getCatalogCategories();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProducts", targetNamespace = "http://www.TestCatalog.com", className = "org.soap.web.service_client.GetProducts")
    @ResponseWrapper(localName = "getProductsResponse", targetNamespace = "http://www.TestCatalog.com", className = "org.soap.web.service_client.GetProductsResponse")
    @Action(input = "http://www.TestCatalog.com/TestCatalog/getProductsRequest", output = "http://www.TestCatalog.com/TestCatalog/getProductsResponse")
    public List<String> getProducts(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://www.TestCatalog.com", className = "org.soap.web.service_client.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://www.TestCatalog.com", className = "org.soap.web.service_client.AddProductResponse")
    @Action(input = "http://www.TestCatalog.com/TestCatalog/addProductRequest", output = "http://www.TestCatalog.com/TestCatalog/addProductResponse")
    public boolean addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.soap.web.service_client.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductsV2", targetNamespace = "http://www.TestCatalog.com", className = "org.soap.web.service_client.GetProductsV2")
    @ResponseWrapper(localName = "getProductsV2Response", targetNamespace = "http://www.TestCatalog.com", className = "org.soap.web.service_client.GetProductsV2Response")
    @Action(input = "http://www.TestCatalog.com/TestCatalog/getProductsV2Request", output = "http://www.TestCatalog.com/TestCatalog/getProductsV2Response")
    public List<Product> getProductsV2(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
