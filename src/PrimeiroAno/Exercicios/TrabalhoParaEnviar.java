package PrimeiroAno.Exercicios;
import java.util.Scanner;

public class TrabalhoParaEnviar {
    
    public static int conta(int num, int num2){
        int resultado;
        resultado = num*2 + num2;
        return resultado;  
}
    public static void main(String[] args) {
        
        int numero1, numero2, numerofinal;
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Introduza um numero inteiro : ");
        numero1 = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Escreva mais um numero inteiro : ");
        numero2 = entrada2.nextInt();
        
        numerofinal=conta(numero1,numero2);
        
        System.out.println("O numero final é: " + numerofinal);
        
    }
}