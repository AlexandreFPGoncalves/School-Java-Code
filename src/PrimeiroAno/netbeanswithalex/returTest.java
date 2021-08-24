package PrimeiroAno.netbeanswithalex;

public class returTest {
    // ### Fora do main
    
    public static int soma() { //RETORNAR UM INTEIRO
        return 1+1;
    }
    // fora do main ###
    
    public static void main(String[] args) {
        System.out.println("Declarar a variável 'res_soma' e recebendo a função soma");
        
        int res_soma=soma(); //Atribuir a variavel res_soma o resultado da função soma()
        
        System.out.println(res_soma);
        
        System.out.println("Imprimir diretamente o resultado do return: " + soma());
        
        System.out.println("Usando numa soma: 2 + soma() = " + (2+soma()));
        
        System.out.println("Usando num produto: 3 * soma() = " + (3*soma()));
        
    }
    
}
