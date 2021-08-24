package PrimeiroAno.AC;

import java.util.Scanner; //Import do Scanner

public class conversor2para10 {
    
    public static void main(String[] args) {    //inicio do main
        
        System.out.println("Programa Conversor de números binários em decimals"); //imprime a string no ecrã
        System.out.println("Coloque um número bínario(ex.10010):"); //Imprime a string no ecrã
        
        Scanner leitor = new Scanner (System.in); //Variável global do tipo scanner
        String binario = leitor.next(); //le o valor e guarda-o
        
        int potencia=0; //Variavel global do tipo int.
        int decimal=0; //Variavel global do tipo int.
        
        for(int i=binario.length()-1;i>0;i--){  //inicio do ciclo for
                                                //dizemos que a nossa variável global do tipo inteiro é binária e damos-lhe o valor de -1
                                                //Damos-lhe o limite de ser maior ou igual que 0
                                                //incrementamos
            decimal+=Math.pow(2,potencia)*Character.getNumericValue(binario.charAt(i));
            potencia++; //Incrementa para n ficar sempre no zero
             }
        System.out.println("O número decimal correspondente é: "+decimal); //imprime no ecrã a string e conecta com a variavel.
    }
    
}
