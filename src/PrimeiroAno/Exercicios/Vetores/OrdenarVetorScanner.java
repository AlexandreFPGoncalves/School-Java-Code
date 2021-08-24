package PrimeiroAno.Exercicios.Vetores;; //package
//Ler um conjunto de números introduzidos pelo utilizador
//Exibir em ordem numérica crescente.
//Avaliação 7 - Comentar o código.

import java.util.Scanner;   //import do Scanner

public class OrdenarVetorScanner {  //class
    
    public static void main(String[] args) {    //main
        
        int quant;  //declaração de 3 variaveis do tipo int, para ser a quantidade de dados a serem introduzidos     
        int aux; //declaração de uma variavel do tipo inteiro com a função de auxiliar.
        
        System.out.println("Introduzir a quantidade a ser registrada: ");  //String a ser imprimida.
        quant = new Scanner(System.in).nextInt();  //Scanner que vai guardar o proximo numero inteiro na variavel qalun
        
        int numeros[] = new int[quant]; //declaração de um vetor do tipo inteiro com 5 posições
        
        for (int i =0; i<quant; i++){   //Ciclo for, começando no 0 até a posição ser <qaluno, repetindo-se em paços de 1
            System.out.println("Introduzir o número nº " + i);   //String a ser imprimida + o local onde vai ser guardada a informação no vetor.
             numeros[i] = new Scanner(System.in).nextInt();    //Novo scanner que vai guardar a proxima String no vetor nome a proxima string digitada pelo utilizador
        }
        
        //#############################################################################
        //#############################################################################
        
        System.out.println("Organizando os números em ordem crescente..."); //String a ser imprimida
        
       boolean trocou = true;   //declaração de uma variavel do tipo boolean para server de chave para o meu ciclo while.      
       while(trocou){  //ciclo while, enquanto while for verdadeiro(1) o ciclo vai continuar.
           
           trocou = false;  //Chave para parar o ciclo while assim que o ciclo for chegar a ultima posição.
                            //Declaramos já que é falso pois na linha 38, dizemos que é verdade dentro do ciclo, assim continuando o ciclo while.
           
           for(int i = 0;i < quant; i++){    //Ciclo for, começando na posição 0 até a posição ser <5, repetindo-se em paços de 1
               if(numeros[i]    >       numeros[i+1]){  //Se o numero gerado na posição atual for maior que o numero da posição atual+1
                   
                   aux          =       numeros[i]; //O valor da posição atual vai ser guardado na variavel aux
                   numeros[i]   =       numeros[i+1];   //O valor da posição atual+1 vai ser guardado na posição atual
                   numeros[i+1] =       aux;    //o valor que foi guardado na variavel aux vai passar para a posição atual+1
                   
                   trocou = true;   //declaramos que a variavel trocou é 1, logo o ciclo vai se voltar a repetir na linha 27
                                    //até o ciclo for que começa na linha 32 chegar a ultima posição e o valor da linha 28 ser o final
                                    //e fechar assim o ciclo while.
               }
           }
       }
        //Exibição do resultado da ordenação:
                System.out.println("Vetor odenado:");   //String a ser imprimida
                for(int i=0; i <quant; i++){   //Ciclo for, começando na posição 0 até a posição ser <5, repetindo-se em paços de 1
                    System.out.println(numeros[i]); //imprimir os valores de cada uma das posições da Array.
        
        
        
    
               }
    
    }
}