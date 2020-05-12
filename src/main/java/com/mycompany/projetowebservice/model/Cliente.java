/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetowebservice.model;

import br.alerario.ICidade;
import br.alerario.ICliente;
import java.io.Serializable;
/**
 *
 * @author Wallace
 */
public class Cliente implements ICliente, Serializable {

    private int codigo;
    private String nome;
    private ICidade cidade;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, ICidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
    }
    
    
    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public ICidade getCidade() {
        return cidade;
    }

    @Override
    public void setCidade(ICidade cidade) {
        this.cidade = cidade;
    }
    
}
