package com.mycompany.lojaapp;

public class Desconto {
    private double percentual;
    private Artigo a;
    
    public Desconto(){}
    public Desconto(double percentual, Artigo a){
        this.percentual = percentual;
        this.a = a;
    }
    public double getPercentual(){
        return percentual;
    }
    public void setPercentual(double percentual){
        percentual = this.percentual;
    }
    public Artigo getArtigo(){
        return a;
    }
    public void setArtigo(Artigo a){
        this.a = a;
    }
    public double getTotalDesconto(){
        if(a != null){
            return (this.percentual * a.getPreco())/100;
        }
        return 0;
    }
    public double getTotalAPagar(){
        if(a != null){
            return a.getPreco()- getTotalDesconto();
        }
        return 0;
    }
    public void exibirResumo(int numeroItem){
        
        if( a != null){
            System.out.println();
            System.out.println("Item" + numeroItem + ": " + a.getNome());
            System.out.println(" - Preço Original: R$ " + a.getPreco());
            System.out.println(" - Desconto(" + percentual + "%): R$");
            System.out.println(" - Total do Item: R$ " + getTotalAPagar());
        }
    }
    
}
