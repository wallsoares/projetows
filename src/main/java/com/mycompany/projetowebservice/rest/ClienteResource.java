/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetowebservice.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.projetowebservice.crud.CrudCliente;
import com.mycompany.projetowebservice.model.Cidade;
import com.mycompany.projetowebservice.model.Cliente;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Wallace
 */
@Path("cliente")
@RequestScoped
public class ClienteResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ClienteResource
     */
    public ClienteResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.projetowebservice.rest.ClienteResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Cliente> getJson() {
        //TODO return proper representation object
        
        return new CrudCliente().getAll();
    }
    
    @GET
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente getCliente(@PathParam("codigo") int codigo) {
        //TODO return proper representation object
        
        return new CrudCliente().getCliente(codigo);
    }

    /**
     * PUT method for updating or creating an instance of ClienteResource
     * @param content representation for the resource
     */
    @POST
    @Path("/{codigo}/{nome}/{cidade}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void adicionaCliente(@PathParam("codigo") int codigo, @PathParam("nome") String nome, @PathParam("cidade") Cidade cidade) {
        Cliente cliente = new Cliente(codigo, nome, cidade);
        new CrudCliente().add(cliente);
    }
    
    @PUT
    @Path("/{put}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void altera(String content) {
        ObjectMapper om = new ObjectMapper();
        try{
            Cliente cliente = om.readValue(content, Cliente.class);
            new CrudCliente().altera(cliente);
        }catch(Exception e){
            System.out.println("erro: " + e.getMessage());
        }
    }
    
    @DELETE
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("codigo") int codigo) {
        //TODO return proper representation object
        
        new CrudCliente().delete(codigo);
    }
    
}
