package PrimeiroAno.Exercicios.objetos.RetornaString;

import java.util.Scanner;

/*
Exemplo do retorno com Strings
exercicio de avaliação... completar a classe UsaRetorno
Utilizar um ciclo "for" para exibir o output Abaixo
Metodo
*/
public class UsaReturn {
    public static void main(String[] args) {
        
        RetornaString msg = new RetornaString();
        System.out.println("Exibindo a mensagem uma vez: " + msg.mensagem());

        System.out.println("Exibindo a mensagem 3 vezes: Com Ciclo for");
                for(int i =0 ; i <= 2 ; i++){ //Ciclo for, começando no 0 até a posição ser <=4, repetindo-se.
            
                System.out.println(msg.mensagem()); //String a ser imprimida
                                                                //Adiciona 1 a variavel 1, ela vai parar até o ciclo for ser <=4.         
        }
    }
}
