/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetowebservice.jsf;

import com.mycompany.projetowebservice.crud.CrudCliente;
import com.mycompany.projetowebservice.model.Cidade;
import com.mycompany.projetowebservice.model.Cliente;
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
        Cliente cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setNome(nome);
        cliente.setCidade(cidade);
        new CrudCliente().add(cliente);
    }
    
    public ArrayList<Cliente> buscaTodos(){
        return new CrudCliente().getAll();
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
