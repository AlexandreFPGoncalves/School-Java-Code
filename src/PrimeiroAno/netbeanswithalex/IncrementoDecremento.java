package PrimeiroAno.netbeanswithalex;
/**
* @author Alexandre Gonçalves 
*/
public class IncrementoDecremento {
    //método principal
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) { //psvm tab
            int numero=1;
            System.out.println(numero);
            
            int numero1=1;
            numero1++; //igual a >> numero1  = numero1 + 1
                       // o sinal ++ aparece a seguir, logo incrementa
                       // NA PROXIMA LINHA DE EXECUCAO (linha15)
            System.out.println(numero1); //sout tab
    //#################################################################
            int numero2=3;
            numero2--; //igual a >> numero2 = numero2 - 1
                       // o sinal -- aparece a seguir, logo incrementa
                       // NA PROXIMA LINHA DE EXECUCAO (linha 21)
            System.out.println(numero2);
    //#################################################################
            int numero3=1;
                       // o sinal ++ aparece ANTES DA VARIAVEL, logo incrementa
                       // NA PROPRIA LINHA DE EXECUCAO (linha 28)
            System.out.println(++numero3);
    
            System.out.println(++numero3); //so na linha 28 é que a variavel foi updated
            
            /** n++ atualiza na proxima linha.
                ++n atualiza apenas na proxima linha.
                O valor é o mesmo porém muda o tempo de execução.
            */
    }

}
    
