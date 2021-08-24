package SegundoAno.MateriaNova.Exercicios;  //package

import java.time.Year;  //import de time.year para ter o ano atual
import java.util.Scanner;   //import do scanner

//exercicio: Construir 3 metodos:
// metodo que soma 5 numeros;
//metodo que concatena 3 Strings por exemplo o nome de uma pessoa
// metodo que calcula a idade atual de uma pessoa

public class AlexandreGonçalves_100256_FT9 {    //Classe




    public static void main(String[] args) {    //metodo main
        
        //Variaveis
        int year = Year.now().getValue(); //Variavel para guardar ano atual.
        int num1,num2,num3,num4,num5, somafinal;    //variaveis para sistema de somar 5 numeros
        String nome1,nome2,nome3,nomejunto;     //variaveis para sistema de concatenar 3 nomes
        
        //introdução
        System.out.println("Ola Bem vindo ao Servidor de testes! Vamos começar...");    //sout padrão
        System.out.println();   //linha de espaço
        
   
        //Bloco de codigo para descobrir a idade
        System.out.println("Vamos fazer um jogo! podes me dizer em que ano nasceste?"); //sout padrão
        
        Scanner anonascimentoscanner = new Scanner(System.in);  //Declaração de um scanner chamado anonascimentoscanner
        int anonascimento = anonascimentoscanner.nextInt(); //o valor do tipo inteiro que o scanner retirar vai ser guardado na variavel anonascimento
        
        idadecalculo(year,anonascimento);   //invocação do metodo idadecalculo que vai calcular a idade.
        
        
        //Bloco de codigo para soma dos 5 numeros
        
        System.out.println();   //linha de espaço
        System.out.println("Ok Agora Da me 5 numeros quaisquer:");  //sout padrão
        
        Scanner entrada = new Scanner(System.in);   //Declaração de um scanner chamado entrada
        
        num1 = entrada.nextInt();//o valor do tipo inteiro que o scanner retirar vai ser guardado na variavel num1
        num2 = entrada.nextInt();//o valor do tipo inteiro que o scanner retirar vai ser guardado na variavel num2
        num3 = entrada.nextInt();//o valor do tipo inteiro que o scanner retirar vai ser guardado na variavel num3
        num4 = entrada.nextInt();//o valor do tipo inteiro que o scanner retirar vai ser guardado na variavel num4
        num5 = entrada.nextInt();//o valor do tipo inteiro que o scanner retirar vai ser guardado na variavel num5
        
        somafinal = somacalculo(num1,num2,num3,num4,num5);  //invocação do metodo somacalculo que vai calcular 5 numeros
        System.out.println();   //linha de espaço
        System.out.println("A soma dos seus numeros é: ");  //sout padrão
        System.out.println(somafinal);  //sout para imprimir a minha soma total
        System.out.println();   //linha de espaço
        
       //Bloco de codigo para juntar Strings
        Scanner nome = new Scanner(System.in);  //Declaração de um scanner chamado nome
        System.out.println("E já agora qual é o teu nome?");    
        System.out.println("E o teu nome do Meio?");
        System.out.println("E o teu nome de familia qual é?");
        System.out.println("Um de cada vez por favor...");
        
        nome1 = nome.nextLine();
        nome2 = nome.nextLine();
        nome3 = nome.nextLine();
        System.out.println();
        
        nomejunto = concatenar(nome1,nome2,nome3);
        System.out.println("Entendido " + nomejunto);
 
    }
    
    //metodo de somar 5 numeros
    public static int somacalculo(int num1, int num2, int num3, int num4, int num5){ 
        int soma;
        soma = num1+num2+num3+num4+num5;
        System.out.println("O Valor total desses teus numeros é: " + soma);
        return soma;
    }
    
    //metodo de juntar as 3 strings
    public static String concatenar(String pnome,String nome_do_meio, String unome){
    String a;
    a = ("O teu nome é " + pnome + " " + nome_do_meio + " " + unome);
    return a;
}


    //Finalizado
    //metodo de calcular a idade da pessoa.
public static int idadecalculo(int anoatual, int anonascimento){
    int idade;
    idade = anoatual - anonascimento;
    System.out.println("Ao que parece tens " + idade + " anos de idade!!");
    System.out.println("Acertei certo???");
    return idade;
}
        
}
