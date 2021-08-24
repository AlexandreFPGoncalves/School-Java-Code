package PrimeiroAno.netbeanswithalex;
// Alexandre Gonçalves

public class ComparacaoBoolean {
    public static void main(String[] args) {
        
        //variavel tipo boolean, apenas retorna true ou false
        boolean resultado = true; //... ou false
        System.out.println(resultado);
        
        //O sinal == compara o conteudo de um lado com o outro
        // Não confundir com o sinal de " = " de ATRIBUIÇÂO
        // O sinal != representa DIFERENTE
        boolean comparacao = 10==10;
        System.out.println(comparacao); //comparacao da linha 14
        
        boolean comparacaoFalsa = 10==20;
        System.out.println(comparacaoFalsa); //comparcao da linha 17
        
        boolean comparacaoDiferente = 10!=20;
        System.out.println(comparacaoDiferente); //comparcao da linha 20
        System.out.println("\n");
       
        //Exercício: Fazer 4 exemplos, com os 4 restantes operadores ( >, <, >=, <=)
        //Utilizar valores de variaveis à sua escolha!!
        
        System.out.println("Exercício: \n");
        
        boolean ex1 = 20<10; // Sinal < 
        System.out.println(ex1);
        boolean ex2 = 4175159>1490148158; // Sinal >
        System.out.println(ex2);
        boolean ex3 = 20<=20; // <=
        System.out.println(ex3);
        boolean ex4 = 9090>=9010; // >=
        System.out.println(ex4);
    }
}
