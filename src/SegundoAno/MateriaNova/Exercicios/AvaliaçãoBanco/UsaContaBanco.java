package SegundoAno.MateriaNova.Exercicios.AvaliaçãoBanco;   //package
import java.util.Scanner;



public class UsaContaBanco { //classe
    
    public static void main(String[] args) {    //metodo main
        //Declaração do meu primeiro cliente(objeto) utilizando o construtor de 3 parametros.
        ContaBanco cliente1 = new ContaBanco("Alex",620,"Porto");
        
        
        System.out.println(); //linha de espaço
        System.out.println("Que operação gostaria de fazer: ");
        System.out.println();
        System.out.println("1. Verificar Saldo");
        System.out.println("2. Sacar Dinheiro");
        System.out.println("3. Depositar Dinheiro");

        //declaração de um Scanner
        Scanner opcoes = new Scanner(System.in);  //declaração de um scanner chamado opcoes
        int opcao1 = opcoes.nextInt();  //o proximo inteiro do scanner opcoes vai ser guardado na variavel opcao1
        
        switch(opcao1){ //switch que vai depender do valor da variavel opcao1
            
            case 1 : //caso opcao1 = 1.
                cliente1.exibeSaldo();  //invocação do metodo para exibir o saldo
                break;
            case 2 ://caso opcao1 = 2.
                System.out.println("Quanto Dinheiro gostaria de Sacar? ");  //sout padrao
                Scanner saque = new Scanner(System.in); //declaração de um scanner chamado saque
                double totalsaque = saque.nextDouble(); //declaração de uma variavel do tipo double
                //e o valor do scanner vai ser guardado nela
                
                double dinheirosacado = cliente1.saca(totalsaque);//declaração de uma variavel do tipo double
                //invocação da função "saca"
                System.out.println("O seu Saque foi de: " + totalsaque);//sout padrão com o valor do saque
                System.out.println("O seu saldo agora é de: " + dinheirosacado);//sout padrão com o balanço depois do sauqe
                break;
            case 3 : //caso opcao1 = 3.
                System.out.println("Quanto Dinheiro gostaria de Depositar? ");  //sout padrao
                Scanner dep = new Scanner(System.in); //declaração de um scanner chamado dep
                double totaldep = dep.nextDouble(); //declaração de uma variavel do tipo double
                //e o valor do scanner vai ser guardado nela
                
                double dinheirodepositado = cliente1.deposita(totaldep);//declaração de uma variavel do tipo double
                //invocação da função "saca"
                System.out.println("O seu Deposito foi de: " + totaldep);//sout padrão com o valor do saque
                System.out.println("O seu saldo agora é de: " + dinheirodepositado);//sout padrão com o balanço depois do sauqe
                break;
            default : //caso opcao1 = nao represente nenhum dos valores
                System.out.println("Isso não é uma opção basica por favor reinicie o sistema...");  //sout padrão.
                break;
        }
        
        
        System.out.println(); //linha em espaço
        System.out.println("Cliente2..."); //sout padrao
        System.out.println();
        //Declaração do meu Segundo cliente(objeto) utilizando o construtor de 3 parametros.
        ContaBanco cliente2 = new ContaBanco("Mariana",1500,"Porto");
        
        
        System.out.println(); //linha de espaço
        System.out.println("Que operação gostaria de fazer: "); //sout padrão
        System.out.println();   //sout linha de espaço
        System.out.println("1. Verificar Saldo");   //sout padrão
        System.out.println("2. Sacar Dinheiro");    //sout padrão
        System.out.println("3. Depositar Dinheiro");    //sout padrão

        //declaração de um Scanner
        Scanner opcoes2 = new Scanner(System.in);  //declaração de um scanner chamado opcoes2
        int opcao2 = opcoes.nextInt();  //o proximo inteiro do scanner opcoes vai ser guardado na variavel opcao2
        
        switch(opcao2){ //switch que vai depender do valor da variavel opcao2
            
            case 1 : //caso opcao2 = 1.
                cliente2.exibeSaldo(); //invocação do metodo para exibir o saldo
                break;
            case 2 ://caso opcao2 = 2.
                System.out.println("Quanto Dinheiro gostaria de Sacar? ");  //sout padrao
                Scanner saque = new Scanner(System.in); //declaração de um scanner chamado saque
                double totalsaque = saque.nextDouble(); //declaração de uma variavel do tipo double
                //e o valor do scanner vai ser guardado nela
                
                double dinheirosacado = cliente2.saca(totalsaque);//declaração de uma variavel do tipo double
                //invocação da função "saca"
                System.out.println("O seu Saque foi de: " + totalsaque);//sout padrão com o valor do saque
                System.out.println("O seu saldo agora é de: " + dinheirosacado);//sout padrão com o balanço depois do sauqe
                break;
            case 3 : //caso opcao2 = 3.
                System.out.println("Quanto Dinheiro gostaria de Depositar? ");  //sout padrao
                Scanner dep = new Scanner(System.in); //declaração de um scanner chamado dep
                double totaldep = dep.nextDouble(); //declaração de uma variavel do tipo double
                //e o valor do scanner vai ser guardado nela
                
                double dinheirodepositado = cliente2.deposita(totaldep);//declaração de uma variavel do tipo double
                //invocação da função "saca"
                System.out.println("O seu Deposito foi de: " + totaldep);//sout padrão com o valor do saque
                System.out.println("O seu saldo agora é de: " + dinheirodepositado);//sout padrão com o balanço depois do sauqe
                break;
            default : //caso opcao2 = nao represente nenhum dos valores
                System.out.println("Isso não é uma opção basica por favor reinicie o sistema...");  //sout padrão.
                break;
        }
    }
    
}
