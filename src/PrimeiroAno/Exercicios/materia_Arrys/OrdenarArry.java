package PrimeiroAno.Exercicios.materia_Arrys;

import java.util.Arrays;

public class OrdenarArry {
    public static void main(String[] args) {    //main
        
        String[] nomes = new String[]{"João","Gustavo","Maria","Alexandre","Filipe"}; //Declaração do meu array do tipo String,e declaração indices.
        
        System.out.println("Nomes não ordenados");  //String a ser imprimida
        for(String nome : nomes) //Este ciclo for le todos os valores da Array e coloca-os numa variavel para esta ser imprimida depois.
           System.out.println(nome);    //Imprimir a variavel "nome" 
        System.out.println();   //linha em branco para separar
        
        Arrays.sort(nomes); // Método (ação...) de ordenação ! (Ordena de forma alfabetica)
        
        System.out.println("Nomes ordenados");  //String a ser imprimida
        for(String nome : nomes) //Este ciclo for le todos os valores da Array e coloca-os numa variavel para esta ser imprimida depois.
           System.out.println(nome);    //Imprimir a variavel "nome"
        System.out.println();   //linha em branco para separar
        
        int[] numeros = new int[]{20,2,8,19,100,5,1,6,13};  //Declaração do meu array do tipo Int,e declaração indices.
        
        System.out.println("Numeros não ordenados");    //String a ser imprimida
        for(int numero : numeros) //Este ciclo for le todos os valores da Array e coloca-os numa variavel para esta ser imprimida depois.
           System.out.println(numero);  //Imprimir a variavel "numero"
        System.out.println();   //linha em branco para separar
        
        Arrays.sort(numeros); // Método (ação...) de ordenação ! (Ordena de forma Crescente)
        
        System.out.println("Numeros ordenados");    //String a ser imprimida
        for(int numero : numeros) //Este ciclo for le todos os valores da Array e coloca-os numa variavel para esta ser imprimida depois.
           System.out.println(numero);  //Imprimir a variavel "numero"
        System.out.println();   //linha em branco para separar
        
                
                
    }
}
