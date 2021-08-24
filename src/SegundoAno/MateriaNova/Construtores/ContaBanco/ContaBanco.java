package SegundoAno.MateriaNova.Construtores.ContaBanco;

public class ContaBanco {
    
    //atributos
    
    //info pessoa
    String nome;
    String unome;
    String morada;
    long cc;
    
    //idade
    int idade;
    String datanascimento;
    boolean maioridade;
    
    //saldo
    int saldo;
    boolean saldonegativo;
    
    //construtor com 4 parametros
    //info pessoal
    public ContaBanco(String nome, String unome, String morada, long cc){
        System.out.println("Dados Pessoais: ");
        this.nome = nome;
        this.unome = unome;
        this.morada = morada;
        this.cc = cc;
    
    };
    
    //construtor com 2 parametros
    //info de idade
    public ContaBanco(int idade, boolean maioridade, String datanascimento){
        this.idade = idade;
        this.datanascimento = datanascimento;
        this.maioridade = maioridade;
    };
    
    //construtor com 2 parametros
    //info do saldo
    public ContaBanco(int saldo, boolean saldonegativo){
        this.saldo = saldo;
        this.saldonegativo = saldonegativo;
    };
    
    
}
