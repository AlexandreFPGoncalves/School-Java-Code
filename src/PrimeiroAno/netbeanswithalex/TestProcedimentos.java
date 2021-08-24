//@Autor Alexandre Gonçalves nº100256.
package PrimeiroAno.netbeanswithalex;   //Package.
import java.util.Scanner;   //import do scanner.

public class TestProcedimentos {    //Class.
    
    public static void menu(){  //criação do meu procedimento menu.
        System.out.println("\t REGISTO de cliente");
        System.out.println("0. Fim");
        System.out.println("1. Inclui");
        System.out.println("2. Altera");
        System.out.println("3. Exclui");
        System.out.println("4. Consulta");
        System.out.println("Opcao: ");
    }   //varias linhas de codigo com prints para o procedimento "menu".
    public static void inclui(){    //criação do procedimento inclui.
        System.out.println(" Entrou no PROCEDIMENTO Inclui.");  //sout a ser imprimido quando este procedimento é escolhido.
    }
    
    public static void altera(){    //criação do procedimento altera.
        System.out.println(" Entrou no PROCEDIMENTO Altera.");  //sout a ser imprimido quando este procedimento é escolhido.
    }
    
    public static void exclui(){    //criação do procedimento exclui.
        System.out.println(" Entrou no PROCEDIMENTO Exclui.");  //sout a ser imprimido quando este procedimento é escolhido.
    }
    
    public static void consulta(){  //criação do procedimento consulta.
        System.out.println(" Entrou no PROCEDIMENTO Consulta"); //sout a ser imprimido quando este procedimento é escolhido.
    }
    
    public static void main(String[] args) {    //Inicio da main.
        int opcao;  //declaração da variavel opcao.
        Scanner entrada = new Scanner(System.in);   //criação de um scanner.
        
        do{ //começo de um case.
            menu(); //iniciar o procedimento menu.
            opcao = entrada.nextInt();  //pedir ao utilizar para dar um valor do tipo Int que vai ser guardado na variavel opcao.
            
            switch(opcao){  //o case vai procurar o valor da variavel opcao.
                case 1: // se o valor for 1 este vai começar o procedimento inclui.
                    inclui();   //inicio do procedimento inclui.
                    break;  
                
                    
                case 2: // se o valor for 1 este vai começar o procedimento altera.
                    altera();   //inicio do procedimento altera.
                    break;
                    
                case 3: // se o valor for 1 este vai começar o procedimento exclui.
                    exclui();   //inicio do procedimento exclui.
                    break;
                    
                case 4: // se o valor for 1 este vai começar o procedimento consulta.
                    consulta(); //inicio do procedimento consulta.
                    break;
                
                default:    //se nenhum dos valores for 1,2,3 ou 4 o case vai imprimir uma string.
                    System.out.println("Opção inválida.");  //string imprimida quase os valores sejam invalidos
            
            } 
            
        }   while(opcao !=0);
    } 
}   // fim da class
