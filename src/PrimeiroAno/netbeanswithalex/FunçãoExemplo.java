package PrimeiroAno.netbeanswithalex;
import java.util.Scanner;
public class FunçãoExemplo {
    public static void main(String[] args) {
        int opcao;  
        do{
            opcao = MostraHistoria();   // a variavel opcao é igual a funcao MostrarHistoria que vai depois devolver um dado.
        } while (opcao !=2);    
    }
    public static int MostraHistoria() {    //Criação da funcão Mostrar Historia.
        Scanner entrada = new Scanner(System.in);  //scanner para o utilizador escolher a opção que deseja
        System.out.println("Este é um teste");      //Historia contada.
        System.out.println("Sobre uma bela história");
        System.out.println("De uma fera e uma Princessa");
        System.out.println("Com uma rosa maligna e danças belas de ver");
        System.out.println("Só na Disney channel\n");   //n quebra a linha
        
        System.out.println("1 - Ler historia outra vez");   //opcoes a returnar para o programa
        System.out.println("2 - Sair");
        return Integer.parseInt(entrada.nextLine());    //retorna as opções 1 ou 2 ao programa
    }
    
}
