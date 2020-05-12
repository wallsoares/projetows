/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetowebservice.jsf;

import com.mycompany.projetowebservice.crud.CrudCliente;
import com.mycompany.projetowebservice.model.Cidade;
import com.mycompany.projetowebservice.model.Cliente;
import com.mycompany.projetowebservice.ws.ClienteCliente;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Wallace
 */

@Named( value = "jsfCliente")
@RequestScoped
public class JsfCliente {

    public JsfCliente() {
    }
    
    private int codigo;
    private String nome;
    private Cidade cidade;

    public void adicionar(){
        Cliente cliente = new Cliente(codigo,nome,cidade);
        ClienteCliente cc = new ClienteCliente();
        cc.adicionaCliente(cliente, Integer.toString(codigo), nome, cidade.getNome());
        cc.close();
    }
    
    public ArrayList<Cliente> buscaTodos(){
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ClienteCliente cc = new ClienteCliente();
        listaCliente = cc.getJson(ArrayList.class);
        cc.close();
        return listaCliente;
    }
    
    public void remove(){
        Cliente cliente = new Cliente(codigo,nome,cidade);
        ClienteCliente cc = new ClienteCliente();
        cc.delete(""+cliente.getCodigo());
        cc.close();
    }
    
    public void altera(){
        Cliente cliente = new Cliente(codigo,nome,cidade);
        ClienteCliente cc = new ClienteCliente();
        cc.altera(cliente, nome);
        cc.close();
    }

    public Cliente getCliente(){
        ClienteCliente cc = new ClienteCliente();
        Cliente cliente = cc.getCliente(Cliente.class, Integer.toString(codigo));
        cc.close();
        return cliente;
    }     
      
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
}
