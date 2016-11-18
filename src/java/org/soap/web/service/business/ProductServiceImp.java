/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soap.web.service.business;

import java.util.ArrayList;
import java.util.List;
import org.soap.web.service.model.Product;

/**
 *
 * @author abdullah
 */
public class ProductServiceImp {
     
        List<String> musicList=new ArrayList();
        List<String> moveList=new ArrayList();
        List<String> bookList=new ArrayList();

    public ProductServiceImp() {
        musicList.add("Music1");
        musicList.add("Music2");
        musicList.add("Music3"); 
        
        moveList.add("Movie1");
        moveList.add("Movie2");
        moveList.add("Movie3"); 
        
        bookList.add("Book1");
        bookList.add("Book2");
        bookList.add("Book3"); 
    }
    public boolean addProduct(String category,String product)
    {
        switch(category.toLowerCase())
        {
            case "books" :
                bookList.add(product);
                break;     
            case "music" :
                musicList.add(product);
                break;
            case "movies":
                moveList.add(product);
            default:
             return false;
       }
        return true; 
    }
    public List<String> getProducts(String category)
    {
        switch(category.toLowerCase())
        {
            case "books" :
                return bookList;
            case "music" :
                return musicList;
            case "movies":
                return moveList;
        }
        return null;
    }
     public List<Product> getProductsV2(String category)
    {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product("Book5","123",99));
        productList.add(new Product("Book6","ABC",88));
        return productList;
    }
 
    public List<String> getCatalogCategories()
    {
        
        List<String> categories=new ArrayList();
        categories.add("Music");
        categories.add("Books");
        categories.add("Movies");
        return categories;
    }

}
