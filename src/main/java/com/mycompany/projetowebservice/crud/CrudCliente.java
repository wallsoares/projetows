/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetowebservice.crud;

import com.mycompany.projetowebservice.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Wallace
 */
public class CrudCliente {
    
    private static ArrayList<Cliente> listaCliente = new ArrayList<>();

    public CrudCliente() {
    }
    
    public ArrayList<Cliente> getAll(){
        return listaCliente;
    }
    
    public void add(Cliente c){
        listaCliente.add(c);
    }
}
