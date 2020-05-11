/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetowebservice.jsf;

import com.mycompany.projetowebservice.model.Cidade;
import com.mycompany.projetowebservice.ws.ClienteCidade;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Wallace
 */
@Named(value = "jsfCidades")
@RequestScoped
public class jsfCidades {

    private int codigo;
    private String nome;
    
    /**
     * Creates a new instance of jsfCidades
     */
    public jsfCidades() {
    }

    public ArrayList<Cidade> buscaTudo(){
        ArrayList<Cidade> listaCidade = new ArrayList<>();
        ClienteCidade cc = new ClienteCidade();
        
        listaCidade = cc.get(ArrayList.class);
        cc.close();
        return listaCidade;
    }
    
    public String buscaCidade(int codigo){
        ClienteCidade cc = new ClienteCidade();
        String nome = cc.get(String.class);
        cc.close();
        return nome;
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
    
    
}
