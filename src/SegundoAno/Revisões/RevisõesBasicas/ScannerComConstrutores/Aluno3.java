package SegundoAno.Revisões.RevisõesBasicas.ScannerComConstrutores; //package

import java.util.Scanner; //import Scanner

public class Aluno3 {   //classe Aluno3
    
    //atributos publicos
    public String nome; //atributo do tipo String
    public double notaMat, notaFis, media;  //atributos do tipo double
    
    //construtor default
    public Aluno3(){
        System.out.println("Objeto Criado");}   //Construtor default com um sout padrao
    
    //Construtor com 3 parametros
    public Aluno3(String nome, double notaMat, double notaFis){ //set de 3 variaveis
        //utilização do this para dar os valores das variaveis aos atributos
        this.nome = nome; 
        this.notaMat = notaMat;
        this.notaFis = notaFis;
        
        //calculo da media
        media = (notaMat + notaFis) /2 ;
    }
    
    
    //#########################MAIN######################
    public static void main(String[] args) {    //main
        
        //criação de um objeto chamado objetocriado
        //que vai imprimir uma string
        Aluno3 objetocriado = new Aluno3();
        
        //declaração de variaveis
        String nome;
        Double notaMat, notaFis;
        
        //declaração do meu scanner entrada
        Scanner entrada = new Scanner(System.in);
        //a proxima linha do meu scanner vai ser guardada na variavel nome
        System.out.println("Nome do Aluno: ");
        nome = entrada.nextLine();
        
        //sout padrão
        System.out.println("Nota de matemarica: ");
        //o proximo double vai ser guardado na variavel notaMat
        notaMat = entrada.nextDouble();
        
        //sout padrao
        System.out.println("Nota em Fisica: ");
        //o proximo double vai ser guardado na variavel notaMat
        notaFis = entrada.nextDouble();
        
        //construtor "classico"
        System.out.println();   //linha de espaço
        
        //criação de um segundo objeto utilizando o construtor de 3 parametros
        
        Aluno3 donaMaria = new Aluno3(nome,notaMat,notaFis); // os valores retirados com o scanner vai ser atribuidos no construtor
        
        
        System.out.println("O meu nome é " + donaMaria.nome +" tive " + donaMaria.notaMat + "a matematica e tive "+notaFis+" a Fisica");
        System.out.println("Logo a minha média é de: " + donaMaria.media);
        
    }
}
