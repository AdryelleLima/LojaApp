package com.mycompany.lojaapp;

public class Artigo {
    private String nome;
    private double preco;
    
    public Artigo(){
        //vazio
    }
    public Artigo(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(){
        this.preco = preco;
    }
   
}
