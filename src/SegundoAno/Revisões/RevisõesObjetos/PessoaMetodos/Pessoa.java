package SegundoAno.Revisões.RevisõesObjetos.PessoaMetodos;

//exercicio 
// 1- criar mais 4 atributos na classe " pessoa "
// 2- criar mais 3 metodos na classe " pessoa "
// 3- aceder aos atributos e metodos respetivos com a criação de mais 2 objetos

public class Pessoa {
    
    //atributos
    String nome;
    String unome;
    String animalfav;
    byte idade;
    
    //metodos simples com a palavra reservada "void"
    //não devolver nada para o "main"
    // (apenas imprime quando é chamado no "main"
    
    //metodos
    void dormir(){
        System.out.println("ZzzzzzZzZzzZ");
    }
    void cao(){
        System.out.println("Os Cães são super amigaveis");
    }
    
    void gato(){
        System.out.println("Mesmo que mais isolados eles são reais companheiros");
    }
    
    void nenhum(){
        System.out.println("E não tenho nenhum animal favorito :c");
    }
    
}
