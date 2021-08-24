package PrimeiroAno.Exercicios;

public class Incremento {
    public static void main(String[] args) {
        int a,b =1;
        
        System.out.println("b = " + b);
        System.out.println("a = b++ ");
        a = b++;
        System.out.println("Então: a = "+a);
        System.out.println("Na proxima linha B vale: " +b );
        
            System.out.println();
        
        System.out.println("b= "+ b);
        System.out.println("a = ++b ");
        a = ++b;
        System.out.println("Então: a = " + a);
    }
    
}
