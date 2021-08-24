package PrimeiroAno.netbeanswithalex;

public class DoWhile {
    
    public static void main(String[] args) {
        // Executa no minimo, UMA VEZ - independetemente da condição
        
        int numero = 1;
        
        do {
            System.out.println("EXECUTOU... INDEPENDENTEMENTE DO WHILE");
                System.out.println(numero);
                numero++; //incrementa um cada vez que " entra no " do...while
        } while (numero <0);
        
        // #############################################
        // outr exemplo...
        
        int numero2 = 1;
        do { 
            System.out.println("EXECUTOU... Exemplo 2");
                System.out.println(numero2);
                numero2++; //numero = numero + 1 >> incrementa um cada vez que entra no " do while "
        } while (numero2 <10); //condição de execução
        
        // #############################################
        // outro exemplo
        // No "While (...condição...) {}... a condição é testada primeiro
        // Só executa, enquanto for verdadeira
        
         int contador = 1;
            while (contador < 11) {
                System.out.println("Contador é: " + contador);
                contador++; }}}
