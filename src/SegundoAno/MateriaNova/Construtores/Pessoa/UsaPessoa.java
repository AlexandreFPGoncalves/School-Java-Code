package SegundoAno.MateriaNova.Construtores.Pessoa;

public class UsaPessoa {

    public static void main(String[] args) {    //main

        //Criação de um objeto com a utilização do construtor default
        
        Pessoa objeto = new Pessoa();//construtor DEFAULT
        
        //Imprimir os atributos
        //ja tem valores atribuidos na classe Pessoa
        System.out.println(objeto.nome);//ACEDER AO ATRIBUTO
        System.out.println(objeto.idade);//ACEDER AO ATRIBUTO
        
        //Imprimir os atributos 
        //associamos agora a string " Jose" 
        // e o inteiro 35 as respetivas variaveis n e i que o construtor criou
        
        //e imprimimos os mesmo
        Pessoa objeto2 = new Pessoa("JOSE",35);// OUTRO CONSTRUTOR com 2 atributos
        System.out.println(objeto2.nome);//ACEDER AO ATRIBUTO
        System.out.println(objeto2.idade);//ACEDER AO ATRIBUTO  
        
        //isto é uma forma simples de dar set aos atributos de um objeto sem
        //gastar muito tempo e muitas linhas de codigo.
        
    }
    
}

