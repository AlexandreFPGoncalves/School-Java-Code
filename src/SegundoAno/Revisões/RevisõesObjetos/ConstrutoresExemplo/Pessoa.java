package SegundoAno.Revisões.RevisõesObjetos.ConstrutoresExemplo;

public class Pessoa {
    
    //atributos
    String nome;
    int idade;
    
    //O construtor serve para inicializar atributos // Construtor defalt vazio    
    Pessoa(){
        System.out.println("Inicialização do Construtor nº1");
        nome ="Pedro";
        idade=46;
        System.out.println();
    }

        //outro construtor //
    Pessoa(String nome, int idade){
        System.out.println("Inicialização do Construtor nº2");
        System.out.println();
        this.nome = nome;
        this.idade = idade;
    }
    
}
