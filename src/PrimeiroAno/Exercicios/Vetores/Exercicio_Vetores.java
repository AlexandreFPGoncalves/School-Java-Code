/*
 * Lê 5 nomes e notas de uma turma,
 * calcula e exibe a média das notas da turma e em seguida
 * exibe a relação de nomes cuja nota é superior a este média.
 * Comentar todas as linhas de código (mandar mail para sistemassi18@gmail.com
 * com o nome nº_1Nome_UltimoNome_Vetor_4
 */
package PrimeiroAno.Exercicios.Vetores; //package

import java.util.Scanner;  //Import do Scanner.

public class Exercicio_Vetores {   //Class publica.
    
    public static void main(String[] args) {    //inicio do main
        
        String[] nomes; //Declaração da minha Array nomes do tipo String
        nomes = new String[5];  //esta Array tem 5 indices
        
        double[] notas = new double[5]; //Declaração da minha Array notas do tipo Double com 5 indices
        double soma = 0, media; //Declaração de 2 variaveis, some e media.
        
        for(int i =0 ; i <= 4 ; i++){ //Ciclo for, começando no 0 até a posição ser <=4, repetindo-se.
            
            System.out.println("Entre com o nome do aluno nº " + (i+1)); //String a ser imprimida
                                                                //Adiciona 1 a variavel 1, ela vai parar até o ciclo for ser <=4.
            nomes[i] = new Scanner(System.in).nextLine();   //Novo scanner que vai guardar na Array nomes a proxima string digitada pelo utilizador
            
            System.out.println("Entre com a nota do aluno nº " + (i+1)); //String a ser imprimida
                                                                //Adiciona 1 a variavel 1, ela vai parar até o ciclo for ser <=4.
            notas[i] = new Scanner(System.in).nextDouble(); //Novo scanner que vai guardar na Array notas o proximo double digitado pelo utilizador
            
            soma = soma + notas[i]; //Somar todos os valores da Array notas e guarda-los na variavel soma que vale 0.
        }
        
        media = soma/5; //dividir a soma por 5 e guardar o resultado na variavel media.
        
        System.out.println("A média dos alunos é: " + media);   //String a ser imprimida com a adição da variavel media
        System.out.println();   //String para dar uma linha de separação.
        System.out.println("Lista dos Alunos cuja nota é superior a média da turma"); //String a ser imprimida.
        
        for(int i = 0; i <=4; i++){ //Ciclo for, começando no 0 até a posição ser <=4, repetindo-se.
            if(notas[i] > media)    //o If vai ver se cada nota individualmente é superior a media, 
                                    //se sim, na proxima linha o nome do aluno que teve esse nova vai ser imprimido.
                System.out.println(nomes[i]);   //Imprimir o nome dos alunos cuja nota foi superior a media.
        }
    }   
}
