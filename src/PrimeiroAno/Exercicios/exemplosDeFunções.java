package PrimeiroAno.Exercicios;
import java.util.Scanner;

public class exemplosDeFunções {
    
    public static int adicionar(int n){
        int d;
        d=n+5;
        return d;
}
    
    public static void main(String[] args) {
        
        int numero, numerocom5;
        Scanner entrada = new Scanner(System.in);     
        
        System.out.println("Introduza um numero inteiro: ");
        numero = entrada.nextInt();
        
        numerocom5=adicionar(numero);
        System.out.println("O seu numero final é " + numerocom5);
    }
}
