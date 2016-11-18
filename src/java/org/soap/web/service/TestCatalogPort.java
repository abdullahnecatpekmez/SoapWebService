/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soap.web.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author abdullah
 */
@Path("testcatalogport")
public class TestCatalogPort {
    private org.soap.web.service_client.TestCatalog port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TestCatalogPort
     */
    public TestCatalogPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method getCatalogCategories
     * @return an instance of javax.xml.bind.JAXBElement<org.soap.web.service_client.GetCatalogCategoriesResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getcatalogcategories/")
    public JAXBElement<org.soap.web.service_client.GetCatalogCategoriesResponse> getCatalogCategories() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<java.lang.String> result = port.getCatalogCategories();

                class GetCatalogCategoriesResponse_1 extends org.soap.web.service_client.GetCatalogCategoriesResponse {

                    GetCatalogCategoriesResponse_1(java.util.List<java.lang.String> _return) {
                        this._return = _return;
                    }
                }
                org.soap.web.service_client.GetCatalogCategoriesResponse response = new GetCatalogCategoriesResponse_1(result);
                return new org.soap.web.service_client.ObjectFactory().createGetCatalogCategoriesResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getProducts
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<org.soap.web.service_client.GetProductsResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getproducts/")
    public JAXBElement<org.soap.web.service_client.GetProductsResponse> getProducts(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<java.lang.String> result = port.getProducts(arg0);

                class GetProductsResponse_1 extends org.soap.web.service_client.GetProductsResponse {

                    GetProductsResponse_1(java.util.List<java.lang.String> _return) {
                        this._return = _return;
                    }
                }
                org.soap.web.service_client.GetProductsResponse response = new GetProductsResponse_1(result);
                return new org.soap.web.service_client.ObjectFactory().createGetProductsResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addProduct
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("addproduct/")
    public String getAddProduct(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                boolean result = port.addProduct(arg0, arg1);
                return new java.lang.Boolean(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getProductsV2
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<org.soap.web.service_client.GetProductsV2Response>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getproductsv2/")
    public JAXBElement<org.soap.web.service_client.GetProductsV2Response> getProductsV2(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<org.soap.web.service_client.Product> result = port.getProductsV2(arg0);

                class GetProductsV2Response_1 extends org.soap.web.service_client.GetProductsV2Response {

                    GetProductsV2Response_1(java.util.List<org.soap.web.service_client.Product> _return) {
                        this._return = _return;
                    }
                }
                org.soap.web.service_client.GetProductsV2Response response = new GetProductsV2Response_1(result);
                return new org.soap.web.service_client.ObjectFactory().createGetProductsV2Response(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private org.soap.web.service_client.TestCatalog getPort() {
        try {
            // Call Web Service Operation
            org.soap.web.service_client.PrologCatalogservice service = new org.soap.web.service_client.PrologCatalogservice();
            org.soap.web.service_client.TestCatalog p = service.getTestCatalogPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
