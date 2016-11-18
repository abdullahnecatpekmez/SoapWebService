/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soap.web.service;

import java.util.List;
import java.util.jar.Attributes;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import org.jboss.logging.Param;
import org.soap.web.service.model.Product;

/**
 *
 * @author abdullah
 */
@WebService
//@WebService(name="TestCatalog",portName = "TestCatalogPort",serviceName = "PrologCatalogservice",targetNamespace ="http://www.TestCatalog.com" )
public interface ProductCatalogI {

    @WebMethod(action = "fetch_catageries",operationName = "fetchCatageries")
    public boolean addProduct(@WebParam(partName="lookupInput")String category,String product);

    @WebResult(name="ProductCategory")
    @WebMethod(action = "fetch_catageries", operationName = "fetchCatageries")
    public List<String> getCatalogCategories();

   @WebResult(name="Product")
   public  List<String> getProducts(String category);
   @WebResult(name="ProductList")
   public  List<Product> getProductsV2(String category);
    
}
