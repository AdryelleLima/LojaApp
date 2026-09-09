package com.mycompany.lojaapp;
import java.util.ArrayList;
import java.util.List;

public class LojaApp {

    public static void main(String[] args) {
        
       List<Desconto> listaDescontos = new ArrayList<>();
       
       listaDescontos.add(new Desconto(25.0, new Artigo("macarrao", 3.97)));
       listaDescontos.add(new Desconto(25.0, new Artigo("molho de tomate", 1.77)));
       listaDescontos.add(new Desconto(10.0, new Artigo("macarrao", 7.50)));
  
       double totalGeral = 0;
       
       for (int i = 0; i < listaDescontos.size(); i++){
           Desconto d = listaDescontos.get(i);
           
           d.exibirResumo(i + 1);
           
           totalGeral += d.getTotalAPagar();
       }
       System.out.println("TOTAL GERAL A PAGAR: R$ " + totalGeral);
    }
}
