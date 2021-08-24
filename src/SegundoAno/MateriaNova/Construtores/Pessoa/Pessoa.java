package SegundoAno.MateriaNova.Construtores.Pessoa;

public class Pessoa {
        
    //atributos
    String nome;
    int idade;
    
    // o construtro serve para inicilizar atributos 
    // CONSTRUTOR defult é vazio 
    
    Pessoa(){   //construtor default
        System.out.println("Iniciou o Primeiro construtor !!"); //sout a ser imprimido
        nome = "PEDRO"; // demos logo um valor ao atributo nome
        idade = 46;     // demos logo um valor ao atributo idade
    System.out.println();} //linha de espaço
    
    
    // outro construtor //SEM o "THIS"
    //ou seja com variaveis para dar aceder aos atributos
    Pessoa(String n, int i) {   //Construtor com 2 variaveis de acesso relacionadas aos atributos
    System.out.println("Iniciou o SEGUNDO construtor !!");  //sout a ser imprimido
    nome = n;   //o valor de n fica reservado no atributo nome
    idade = i; }    //o valor de i fica reservado no atributo idade
}