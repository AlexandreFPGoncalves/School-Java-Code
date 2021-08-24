package PrimeiroAno.Exercicios.JOptionPane; //package

import javax.swing.JOptionPane; //import do JOptionPane;
import javax.swing.JDialog;     //import do Jdialog;
import java.util.Random;        //import do Random;
import java.util.Scanner;       //import do Scanner;

public class JogoAdivinhaNumero {   //class 
    public static void dica(int palpite, int numero, int tentativas){   //metodo para dar dicas
        if(palpite > numero){   //se o palpite for maior que o numero:
            System.out.println("O teu palpite é maior que o número sorteado!"); //imprimir string na consola
        }else{  //senão
            if(palpite < numero){   //se o palpite for menor que o numero:
                System.out.println("O teu palpite é menor que o número sorteado!"); //imprimir string na consola
            }else{  //senão
                System.out.println("Parabéns Acertaste! O número era: " + numero);  //imprimir string + numero no ecrã
            }}}
    
    public static void main(String[] args) {    //main
        int palpite = 0,sorteado,tentativas = 0;    //declaração das variaveis
        
        Scanner entrada = new Scanner(System.in);   //inicialização do scanner
        
        //geração dos numeros aleatorios
        Random geradorDeAleatorios = new Random();  //gerar um numero aleatorio
        sorteado = geradorDeAleatorios.nextInt(10)+1; //numero aleatorio entre 0-9 +1 que fica 1-10 fica guardado na variavel sorteado
        System.out.println("Número entre 1 e 10 sorteado!");    //imprimir string na consola
        
        do{ //fazer
            System.out.println("\n\n\n\n----------------\n");   //linhas de espaço
            System.out.println("Número de tentativas: " + tentativas);  //imprimir na consola + variavel tentativas
            System.out.println(sorteado);   //mostra o numero sorteado (utilizado para testes no codigo)
            System.out.println("Qual é o teu palpite: "); //imprimir string na consola
            palpite = entrada.nextInt();  //guardar o proximo inteiro introduzido no scanner entrada na variavel palpite
            
            tentativas ++; //incrementar a variavel tentativas em 1
            
            dica(palpite,sorteado,tentativas);  //chamar o metodo dica e colocar os parametros para o metodo funcionar
        }while(palpite != sorteado);  //enquanto o palpite for diferente do numero sorteado
    }

}
