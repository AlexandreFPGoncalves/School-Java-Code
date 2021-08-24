package PrimeiroAno.netbeanswithalex;
import java.util.Scanner;

public class quadradoComFunçoes {
    
    public static int quadrado(int num){
        int quadrado;
        quadrado = num * num;
        return quadrado;
    }
    
    public static void main(String[] args) {
        int numero, numero_quadrado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indroduzir um numero inteiro: ");
        numero = entrada.nextInt();
        
        numero_quadrado=quadrado(numero);
        
        System.out.println(numero + " elevado ao quadrado é " + numero_quadrado);
    }
}