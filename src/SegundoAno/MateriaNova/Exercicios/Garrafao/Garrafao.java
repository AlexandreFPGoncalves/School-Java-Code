package SegundoAno.MateriaNova.Exercicios.Garrafao;

public class Garrafao {
    
    //atributos da classe
    String material;
    int capacidade;
    
    
    //construtor com 2 parametros
    public Garrafao(String material, int capacidade){
        
        //valores a ser guardados nos atributos
        this.material = material;
        this.capacidade = capacidade;
    }
        
        
     //metodo encher 
    void encher(){
        System.out.println("O Garrafão Encheu... Foram por volta de " + this.capacidade);
    }
    
    //metodo esvaziar
    void esvaziar(){
        System.out.println("O Garrafão Esvaziou... Que Desperdicio de " + this.capacidade);
    }
    
    //metodo partir
    void partir(){
        System.out.println("O Garrfão Partiu... Talvez porque era de " + this.material);
    }
    
    }