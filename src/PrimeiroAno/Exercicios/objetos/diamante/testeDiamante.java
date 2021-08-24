package PrimeiroAno.Exercicios.objetos.diamante;

import java.util.Scanner; //import do scanner

public class testeDiamante {    //class
    
    public static void main(String[] args) {
        int numero, espacos, asteriscos; // declaração de variaveis do tipo int
        Scanner entrada = new Scanner(System.in); //declaração do meu scanner
        
        System.out.print("Insira um número impar: "); //imprimir uma string no ecrã
        numero = entrada.nextInt(); //guarda o valor do scanner na variavel numero
        
        if(numero%2 !=0){   //% verifica se o numero é impar
            //imprime parte de cima do diamante
            asteriscos = 1; //set a variavel
            espacos = (numero-1)/2; //espaços vai ser o numero subtraido um e dividio por 2;
            for(int linha = 1; espacos > 0; linha ++){ //ciclo for começando em 1 até chegar a 0 de um incremento de 1;
                
                //espaços
                for(int count = 1; count <=espacos; count++){   //ciclo for começando em 1 até chegar a um numero menor que os espacos de um incremento de 1;
                    System.out.print(" ");  //print para dar espaçamento
                }
                //asteriscos
                for(int count = 1; count <=asteriscos; count++){    //ciclo for começando em 1 até chegar a um numero menor ou igual que os asteriscos de um incremento de 1;
                    System.out.print("*");   //print para os asteriscos
                }
                
                    espacos--; //decremento de 1
                    asteriscos += 2;    //acrescenta 2 ao valor original da variavel
                    System.out.println(); //imprimir linha de espaço
            }
                //imprimindo a parte de baixo do diamante
                for(int linha=1;asteriscos>0;linha++){ //ciclo for começando em 1 até chegar a um numero maior que os asteriscos de um incremento de 1;
                    //espaços
                    for(int count = 1; count <= espacos; count++){ //ciclo for começando em 1 até chegar a um numero menor ou igual que os espaços de um incremento de 1;
                        System.out.print(" ");  //print para dar espaçamento
                    }
                    //asteriscos
                    for(int count = 1 ; count <= asteriscos; count ++){ //ciclo for começando em 1 até chegar a um numero menor ou igual que os asteriscos de um incremento de 1;
                        System.out.print("*");  //print para os asteriscos
                    }
                    espacos ++; //incremento de 1
                    asteriscos -=2; //retira 2 ao valor original da variavel
                    System.out.println();   //imprimir linha de espaço
                    }
            }else{  //se não for corresponder ao if da linha 14 correr codigo :
            System.out.println("Não é impar!"); //print
        }
    }
        
}
    

