/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soap.web.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author abdullah
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {
    @WebResult(partName="lookupOutput")
    public String getShopInfo(@WebParam(partName="lookupInput")String property) throws InValidInputException{
        String response="invalid property";
        if("shopName".equals(property))
        {
            response="Test Shop";
        }else if("since".equals(property))   
            response="since 2012";
        else
            throw new InValidInputException("İnvalid inpur",property+"is not a valid input");
        return response;
    }
    
}
