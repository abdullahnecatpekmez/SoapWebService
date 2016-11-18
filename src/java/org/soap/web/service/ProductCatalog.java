/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soap.web.service;

import java.util.List;
import javax.jws.WebService;
import org.soap.web.service.business.ProductServiceImp;
import org.soap.web.service.model.Product;

/**
 *
 * @author abdullah
 */

//@WebService(endpointInterface = "org.soap.web.service.ProductCatalogI")
@WebService(name="TestCatalog",portName = "TestCatalogPort",serviceName = "PrologCatalogservice",targetNamespace ="http://www.TestCatalog.com" )
public class ProductCatalog implements ProductCatalogI {
     ProductServiceImp productService=new ProductServiceImp();
   
    @Override
    public List<String> getCatalogCategories()
    {
        return productService.getCatalogCategories();
    }
   
    @Override
    public List<String> getProducts(String category)
    {
        return productService.getProducts(category);
    }
    @Override
    public boolean addProduct(String category,String product)
    {
        return productService.addProduct(category,product);
    }
    @Override
     public List<Product> getProductsV2(String category)
    {
        return productService.getProductsV2(category);
    }
}
