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

    public Cliente getCliente(int codigo) {
        return listaCliente.get(codigo);
    }
    
    public void delete(int codigo){
        Cliente cliente = getCliente(codigo);
        if (cliente != null){
            listaCliente.remove(cliente);
        }
    }

    public void altera(Cliente cliente){
        Cliente c = getCliente(cliente.getCodigo());
        c.setNome(cliente.getNome());
        c.setCidade(cliente.getCidade());
    }
}
