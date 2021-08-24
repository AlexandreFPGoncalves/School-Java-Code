//Ler um conjunto de números introduzidos pelo utilizador
//Exibir em ordem numérica crescente.
//Avaliação 7 - Comentar o código.
package PrimeiroAno.Exercicios.Vetores; //package
import java.util.Scanner;   //import do Scanner
import java.util.Arrays;    //import de funções para as Arrays

public class OrdenarVetorScanner2 { //class
    public static void main(String[] args) {    //main
       int quant;  //Declaração de uma variavel do tipo int
       int[] numeros; //declaração de um vetor do tipo int
       
        System.out.println("Introduzir a quantidade a ser registrada: "); //String a ser imprimida
        quant = new Scanner(System.in).nextInt(); //proximo int vai ser guardado na variavel quant
        
        numeros = new int[quant]; //declaração do meu vetor com [quant] posições
        
        for(int i=0; i<quant; i++){ //Ciclo for, começando na posição 0 até a posição ser <5, repetindo-se em paços de 1
            System.out.println("Introduzir o nº " + i); //String a ser imprimida + o local onde vai ser guardada a informação no vetor.
            numeros[i] = new Scanner(System.in).nextInt();  //Novo scanner que vai guardar a proxima String no vetor nome a proxima string digitada pelo utilizador
        }
    
        Arrays.sort(numeros);   //vai dar sort aos valores da array.
        
        System.out.println("A ordem crescente dos números é: ");    //String a ser imprimida
            for(int i = 0; i < quant;i++){ //Ciclo for, começando na posição 0 até a posição ser <5, repetindo-se em paços de 1
                System.out.println(numeros[i]); //imprimir valores da Array.
            }
    }

}
