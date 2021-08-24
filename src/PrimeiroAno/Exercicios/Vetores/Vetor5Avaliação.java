/*
 *  Ler um conjunto de notas, cuja quantidade seja determinada pelo utilizador
 *  Calcular a média de todas elas. Exiba o conjunto das notas maiores
 *  do que a média calculada. Em seguida, de forma agrupada.
 *  exiba o outro conjunto de notas (menores do que a média).
 */

//nota para o professor, eu notei ao correr o programa varias vezes que as notas que fossem iguais a media
//não iam ser imprimidar para isso eu criei mais um ciclo for para imprimir essas notas que foram deixadas de fora.

package PrimeiroAno.Exercicios.Vetores; //package

import java.util.Scanner;  //Import do Scanner.

public class Vetor5Avaliação {  //inicio da class
    
    public static void main(String[] args) {    //inicio do main 
        
        int quantidade; //declaração de uma variavel do tipo inteiro
        double mediafinal; //declaração de uma variavel do tipo double
        
        double media = 0;   //declaração de uma variavel do tipo double para servir de contador
        
        System.out.println("Informe a quantidade de notas que quer inserir: "); //String a ser imprimida.
        quantidade = new Scanner(System.in).nextInt();  //Scanner que vai guardar o valor inserido na variavel quantidade.
        
        double vetor[]; //Declaração do meu vetor chamado vetor do tipo Double
        vetor= new double[quantidade];  //O tamanho do vetor é decidido pelo valor da variavel quantidade
        
        for(int i =0 ;i <quantidade ; i++){ //Ciclo for, começando no 0 até a posição ser <=4, repetindo-se.
            
            System.out.println("Informar a nota nº " + (i+1)); //String a ser imprimida
                                                                //Adiciona 1 a variavel 1, ela vai parar até o ciclo for ser <=4.
            vetor[i] = new Scanner(System.in).nextDouble();   //Novo scanner que vai guardar na Array nomes a proxima string digitada pelo utilizador

            media = media + vetor[i]; //Somar todos os valores da Array notas e guarda-os na variavel soma que vale 0.
         }
        
        mediafinal = media/quantidade;  //dividir a media por 5 e guardar o resultado na variavel mediafinal.
        
        System.out.println();   //String para dar uma linha de separação.
        System.out.println("A média é: " + mediafinal);   //String a ser imprimida com a adição da variavel mediafinal
        System.out.println();   //String para dar uma linha de separação.
        
        System.out.println("Nota(s) acima da média: ");
        for(int i = 0; i <quantidade; i++){ //Ciclo for, começando no 0 até a posição definida quantidade, repetindo-se.
            if(vetor[i] > mediafinal)    //o If vai ver se cada nota individualmente é superior a media, 
                                    //se sim, na proxima linha a nota superior a media vai ser imprimida.
                System.out.println(vetor[i]);  //Imprimir a nota que for superior a media.
        }
        
        System.out.println("Nota(s) abaixo da média: ");
        for(int i = 0; i <quantidade; i++){ //Ciclo for, começando no 0 até a posição definida quantidade, repetindo-se.
            if(vetor[i] < mediafinal)    //o If vai ver se cada nota individualmente é inferior a media, 
                                    //se sim, na proxima linha a nota inferior a media vai ser imprimida.
                System.out.println(vetor[i]);  //Imprimir o nome dos alunos cuja nota foi inferior a media.
        }
        
        System.out.println("Nota(s) dentro da média: ");
        for(int i = 0; i <quantidade; i++){ //Ciclo for, começando no 0 até a posição definida quantidade, repetindo-se.
            if(mediafinal == vetor[i])    //o If vai ver se cada nota individualmente é igual a media, 
                                    //se sim, na proxima linha a nota igual a media vai ser imprimida.
                System.out.println(vetor[i]);  //Imprimir o nome dos alunos cuja nota foi igual a media.
        }
        
    }
    
}
