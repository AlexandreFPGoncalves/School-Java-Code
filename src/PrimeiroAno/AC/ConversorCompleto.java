package PrimeiroAno.AC;

import java.util.Scanner;

public class ConversorCompleto {
    
    public static void Sistema(){   //Inicio do procedimento
        System.out.println("\t Bem-Vindo ao Conversor Completo! Por Favor escolha uma das seguinet opções: ");  //imprime a string no ecrã
        System.out.println("1. Binário para decimal");  //imprime a string da opção 1 no ecrã
        System.out.println("2. Octal para decimal");   //imprime a string da opção 2 no ecrã
        System.out.println("3. Hexadecimal para decimal");  //imprime a string da opção 3 no ecrã
        System.out.println("4. Sair");  //imprime a string da opção 4 no ecrã
    }
    
    public static void Binario(){
        System.out.println("Programa Conversor de números binários em decimals"); //imprime a string no ecrã
        System.out.println("Coloque um número bínario(ex.10010):"); //Imprime a string no ecrã
        
        Scanner leitor = new Scanner (System.in); //Variável global do tipo scanner
        String binario = leitor.next(); //le o valor e guarda-o
        
        int potencia=0; //Variavel global do tipo int.
        int decimal=0; //Variavel global do tipo int.
        
        for(int i=binario.length()-1;i>0;i--){  //inicio do ciclo for
                                                //dizemos que a nossa variável global do tipo inteiro é binária e damos-lhe o valor de -1
                                                //Damos-lhe o limite de ser maior ou igual que 0
                                                //incrementamos
            decimal+=Math.pow(2,potencia)*Character.getNumericValue(binario.charAt(i));
            potencia++; //Incrementa para n ficar sempre no zero
             }
        System.out.println("O número decimal correspondente é: "+decimal); //imprime no ecrã a string e conecta com a variavel.
        }
    
    
        
        
    public static void octal(){
    System.out.println("Programa conversor de números Octais para decimais"); //imprime String no ecrã
        System.out.println("Por Favor introduza um número em Octal como por exemplo: 2374");    //imprime String no ecrã
        
        Scanner leitor=new Scanner(System.in); //Variavel global do tipo Scanner
        String octal=leitor.next(); //Lê o valor e guarda-o
        
        int potencia=0; //declaração de uma variavel global do tipo int
        int decimal=0; //declaração de uma variavel global do tipo int
        
        for(int i=octal.length()-1;i>=0;i--){   //função for; variavel local i do tipo inteiro.
                                                // valor definido de -1 e valor minimo de 0;
                                                //incrementa o valor
            decimal+=Math.pow(8,potencia)*Character.getNumericValue(octal.charAt(i));   //damos o resultado á pontencia para o programa saber que é para converter para octal.
            potencia++; //incrementa
        }
        System.out.println("O número decimal correspondente é: "+decimal); //imprime no ecrã e conecta com a variavel
    
    }
    
    public static void hexadecimal(){
        System.out.println("Programa conversor de números Hexadecimais para decimais"); //imprime a string no ecrã
        System.out.println("Por Favor introduza um número em Hexadecimal como por exemplo: A9");    //imprime a string no ecrã
        
        Scanner leitor=new Scanner(System.in);  //Declaração da variavel global do tipo scanner
        String hexadecimal = leitor.next(); //Lê o valor e guarda-o
        
        int  potencia = 0; //declaração da variavel global do tipo inteiro
        int decimal = 0; //Declaração da variavel global do tipo inteiro
        
        for(int i=hexadecimal.length()-1;i>=0;i--){   //função for; variavel local i do tipo inteiro.
                                                // valor definido de -1 e valor minimo de 0;
                                                //incrementa o valor
            decimal+=Math.pow(16,potencia)*Character.getNumericValue(hexadecimal.charAt(i));   //damos o resultado á pontencia para o programa saber que é para converter para octal.
            potencia++; //incrementa
            
            System.out.println("O número decimal correspondente é: "+decimal); //imprime no ecrã e conecta com a variavel
    }
 } 
    
    public static void sair (){//Declaração do procedimento sair
    System.out.println("O Conversor vai voltar ao menu principal");//se o utilizador escolher a opção irá imprimir esta string
}
    
    
   public static void main(String[] args) {//main
        int opcao;//Declaro a variável global do tipo inteiro
        Scanner entrada = new Scanner (System.in);//vairável global do tipo scanner
        
do{//Função do ("fazer")
            Sistema();//Invoca o procedimento
            opcao= entrada.nextInt();//Lê o valor da variável    
            
            switch(opcao){//Função switch...case
                case 1://caso 1 
                    Binario();//se for escolhido irá invocar este procedimento
                  break;
                  
                case 2://caso 2 
                    octal();//se for escolhido irá invocar este procedimento
                   break;
                
                case 3://caso 3 
                    hexadecimal();//se for escolhido irá invocar este procedimento
                   break;
                case 4://caso 4
                    sair();//se for escolhido irá invocar este procedimento
                   break;
                default://caso default
                    System.out.println("Opção inválida");//se a opção for diferente de todas as outras irá imprimir esta string 
            }

    }while (opcao != 0);//a variável opção não pode ser 0
                       //sinal aritmético !(negação)

  }
}


