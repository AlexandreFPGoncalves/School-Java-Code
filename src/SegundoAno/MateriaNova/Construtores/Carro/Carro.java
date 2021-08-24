package SegundoAno.MateriaNova.Construtores.Carro;

public class Carro {
    
   //atributos da Classe
    String cor;
    double preco;
    String modelo;
    String matricula;
    String capacidade;
    boolean disponivel;
    
    
    //Construtor Default 
    public Carro(){
        System.out.println("Amostra do Carro: ");
    }
    
    //Construtor com 1 parametro
    public Carro(boolean disponivel){
        this.disponivel = disponivel;
    };
    
    //Construtor com 5 parametros
    public Carro(String cor, double preco, String modelo, String matricula, String capacidade){
        this.cor = cor;
        this.preco = preco;
        this.modelo = modelo;
        this.matricula = matricula;
        this.capacidade = capacidade;
    }
}