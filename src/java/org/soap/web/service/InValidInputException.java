/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soap.web.service;

/**
 *
 * @author abdullah
 */
public class InValidInputException extends Exception {
    private String errorDetails;
    public InValidInputException (String reason,String errorDetails)
    {
        super(reason);
        errorDetails=errorDetails;
    }
    public String getFaultDetails()
    {
        return errorDetails;
    }
}
