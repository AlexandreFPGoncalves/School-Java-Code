package SegundoAno.Revisões.RevisõesBasicas;

public class IncrementoDecremento {
    public static void main(String[] args) {
        int numero = 1;
        System.out.println(numero);
        
        int numero1 = 1;
        numero1++; 
        //igual a >> numero1 = numero1 + 1
        //o sinal ++ aparece a seguir, logo incrementa Na proxima linha
        
        System.out.println(numero1);
        //#############################################################
        int numero2 = 3;
        numero2--; 
        //igual a >> numero2 = numero 2-1
        //o sinal -- aparece a seguir logo incrementa na proxima linha
        
        System.out.println(numero2);
        //#############################################################
        int numero3 = 1;
        System.out.println(++numero3);
        //o sinal ++ aparece antes da variavel logo
        //aumenta na propria linha de execução
    }
    
}
