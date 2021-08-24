/*
 * Ler um conjunto de alunos, cada uma com o nome e a nota.
 * Em seguida exibir o nome dos alunos que possuem a nota maior do que a média da turma.
 */

package PrimeiroAno.Exercicios.Vetores; //package
import java.util.Scanner;  //Import do Scanner.

public class Vetor_6_Exercicios {   //inicio da class
    
    public static void main(String[] args) { //inicio da main
        int soma=0, media=0, qaluno=0;  //declaração das minhas variaveis do tipo int, como tem declarado o valor 0 vão ser usadas para contadores.
        
        System.out.println("Introduzir o número de Alunos q serão registrados: ");  //String a ser imprimida.
        qaluno = new Scanner(System.in).nextInt();  //Scanner que vai guardar o proximo numero inteiro na variavel qaluno
        
        String[] nome = new String[qaluno]; //declaração do vetor nome do tipo String e o seu tamanho é definido pela variavel qaluno
        int [] nota = new int[qaluno];      //declaração do vetor nota do tipo int e o seu tamanho é definido pela variavel qaluno
        
        for (int i=0; i<qaluno; i++){   //Ciclo for, começando no 0 até a posição ser <qaluno, repetindo-se em paços de 1
            System.out.println("Introduzir o Nome do Aluno nº " + i);   //String a ser imprimida + o local onde vai ser guardada a informação no vetor.
            nome[i] = new Scanner(System.in).nextLine();    //Novo scanner que vai guardar a proxima String no vetor nome a proxima string digitada pelo utilizador
            
            System.out.println("Introduzir a Nota do Aluno nº "+ i);    //String a ser imprimida + o local onde vai ser guardada a informação no vetor.
            nota[i] = new Scanner(System.in).nextInt(); //Novo scanner que vai guardar o proximo int no vetor nota a ser digitado pelo utilizador
            
            soma = soma+ nota[i];   //Somar todos os valores da Array notas e guarda-os na variavel soma que vale 0.
        }
        media = soma/qaluno;    //dividir a media por o valor definido na variavel quantidade e guardar o resultado na variavel mediafinal.
        
        System.out.println("Alunos c/ Nota maior que a média da Turma: ");  //String a ser imprimida.
        
        for (int i=0; i<qaluno; i++){   //Ciclo for, começando no 0 até a posição ser <qaluno, repetindo-se em paços de 1
            if(nota[i]>media){  //ele vai ler as notas uma a uma e se elas foram >media elas vão ser imprimidas nas proximas linhas
                System.out.print(nome[i]+" - ");   //imprimir o nome dos alunos com notas maiores que a media
                System.out.println(nota[i]);    //imprimir a nota dos alunos com notas maiores que a media
            }
        }
    }
}
