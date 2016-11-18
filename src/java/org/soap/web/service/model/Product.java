/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soap.web.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author abdullah
 */
@XmlRootElement(name="Product")
public class Product {
   private String name;
   private int price;
   private String sku;

    public Product() {
    }
   
    public Product(String name, String sku, int price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }
@XmlElement(name="ProductName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@XmlElement(name="ProductSku")
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
@XmlElement(name="ProductPrice")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
  
}
