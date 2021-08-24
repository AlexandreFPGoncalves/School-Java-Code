package SegundoAno.MateriaNova.Exercicios;

import java.util.Scanner;

public class quadrado_teste_ajuda {
    
    public static int quadrado(int num){
        int quadrado;
        quadrado = num*num;
        return quadrado;
    }
    
    public static void main(String[] args) {
        
        int numero;
        int numero_quadrado;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduzir um inteiro para calcular o Quadrado:");
        numero = entrada.nextInt();
        
        numero_quadrado=quadrado(numero);
        System.out.println(numero+ " elevado ao quadrado é " + numero_quadrado);
    }
    
}
