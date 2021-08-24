package PrimeiroAno.AC;

import java.util.Scanner; //Import do Scanner

public class conversor8para10 {
    public static void main(String[] args) { //inicio do main.
        
        System.out.println("Programa que converte números octais para decimais"); //imprime String no ecrã
        System.out.println("Introduzir um número octal (ex.2374):");    //imprime String no ecrã
        
        Scanner leitor=new Scanner(System.in); //Variavel global do tipo Scanner
        String octal=leitor.next(); //Lê o valor e guarda-o
        
        int potencia=0; //declaração de uma variavel global do tipo int
        int decimal=0; //declaração de uma variavel global do tipo int
        
        for(int i=octal.length()-1;i>=0;i--){   //função for; variavel local i do tipo inteiro.
                                                // valor definido de -1 e valor minimo de 0;
                                                //incrementa o valor
            decimal+=Math.pow(8,potencia)*Character.getNumericValue(octal.charAt(i));   //damos o resultado á pontencia para o programa saber que é para converter para octal.
            potencia++; //incrementa
        }
        System.out.println("O número decimal correspondente é: "+decimal); //imprime no ecrã e conecta com a variavel
        
    }
    
}
