package PrimeiroAno.TrabalhoPesquisa;

public class pesquisa_while_dowhile {
    
    public static void main(String[] args) {
        //No caso do while a condição vai ser testada primeiro e só depois arranca para a execução.
        int count = 25; //Valor da minha varivavel
        while (count > 2){ //condição para executar o programa
            System.out.println("Count is " + count); 
            count--; //decrementa de 1 em 1
        }
           
        
        int count2 = 1; //Designação e atribuição de um valor a minha variavel
        
        do {System.out.println("Count2 is " + count2);  //vai executar pelo menos uma vez e vai imprimir " count2 is 1 "
            count2++;}          // depois vai incrementando de 1 em 1 até o valor ser igual ou menor que 20.
        while (count2 <= 20);
        
        }
    }
