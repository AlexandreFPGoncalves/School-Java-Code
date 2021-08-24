package SegundoAno.MateriaNova.Construtores.Pessoa2;

public class Pessoa {
    
    //set dos atributos
    String nome = "Alex";
    
    //construtor default
    
    Pessoa(){
        String nome = "Mariana";    //variavel local.
        System.out.println(nome);   //imprime a variavel local
        
        //Palavra Reservada "THIS"
        //A palavra THIS fala sempre sobre os atributos da classe 
        System.out.println(this.nome); //referencia ao atributo da Classe
    };
}
