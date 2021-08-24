package PrimeiroAno.netbeanswithalex;

//autor Alexandre Gonçalves
import java.util.Scanner;

public class ClasseScanner {
    
    public static void main(String[] args) {
    
        //Classe Scanner > ler dados do teclado
        Scanner entrada = new Scanner(System.in);
        Scanner entrada_altura = new Scanner(System.in);
        Scanner entrada_nome = new Scanner(System.in); 
        
        //variáveis
        int idade; //declara variável idade
        float altura; //declara variável altura
        String nome; //declara variável nome

        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt(); //Atibui valor á variável
        
        System.out.println("Digite sua altura: ");
        altura = entrada_altura.nextFloat(); //atribui valor à variável
        
        System.out.println("Digite o seu nome: ");
        nome = entrada_nome.nextLine(); //atribui valor à variável
        
        //imprimir
        System.out.println("A sua idade é " + idade + "\n");
        System.out.println("A sua altura é " + altura + "\n");
        System.out.println("O seu nome é " + nome + "\n");
    }
}
