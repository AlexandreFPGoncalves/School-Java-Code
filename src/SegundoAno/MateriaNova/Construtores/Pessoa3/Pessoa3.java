package SegundoAno.MateriaNova.Construtores.Pessoa3;

public class Pessoa3 {
    
    //atributos da classe
    String nome;
    String cidade;
    int idade;
    int cartaoCidadao;
    
    //construtor com 4 parametros
    //com referencia utilizando "THIS" aos atributos da classe
    
    Pessoa3(String nome, int idade, int cartaoCidadao, String Cidade){
        this.nome = nome;
        this.idade = idade;
        this.cartaoCidadao = cartaoCidadao;
        this.cidade = Cidade;
    };
    
}
