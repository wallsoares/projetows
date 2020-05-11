/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetowebservice.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Wallace
 */

@Path("cliente")
public class ClienteRest {
    
    @Context
    private UriInfo context;
    
    public ClienteRest(){
        
    }
    
}
