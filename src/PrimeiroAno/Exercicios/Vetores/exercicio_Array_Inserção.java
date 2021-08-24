package PrimeiroAno.Exercicios.Vetores;
//@Autor Alexandre Gonçalves

/*Exercicio para avaliação : (20Valores)
    1- Pesquisar código sob o tema:
        Inserção e Remoção de elementos de um array simples -
            -- Á Cabeça e no fim, Á Cauda --- 2 Algoritmos, pelo menos--

                a)  Encontrar exemplos Simples(5 valores)
                b)  Utilizar o NetBeans para executar o código. (4 valores)
                c)  Comentar o código na totalidade ( 8 valores)
                d) elaborar um pequeno relatório no WORD (3 valores)
                    (com capa, indice e desenvolvimento)
*/
import java.util.Arrays;  //Import para utilizar mais tarde.

public class exercicio_Array_Inserção { 
    
    static String[] addElement(String[] a, String e){    //inicio da minha função addElement.
        a = Arrays.copyOf(a, a.length +1); 
        a[a.length -1] = e;
         
        return a;   //retorna o valor a
    }
public static void main(String[] args) { //começo do meu main
    
        String[] frutas = {"Morangos","Melão","Pessego","Maça","Banana"};  //Declaração do meu array do tipo String,e declaração dos seus valores>.
        //tipo da array, nome da array              //valores da array
       
        System.out.println("Depois original: "+Arrays.toString(frutas)); //imprimir a String com a Array sem nenhuma alteração
                                                //passar a Array para uma string (array frutas)
                                                
        System.out.println(); //String a ser imprimida para dar espaço              
        
        frutas = addElement(frutas, "Cereja");  //String a ser adicionada a Array
                    //invoquei a função addElement e adicionei a minha Array frutas a string "Cerejas"
        frutas = addElement(frutas, "Perâ");    //String a ser adicionada a Array   
                    //invoquei a função addElement e adicionei a minha Array frutas a string "Perâ"
        frutas = addElement(frutas, "Kiwi");    //String a ser adicionada a Array
                    //invoquei a função addElement e adicionei a minha Array frutas a string "Kiwi"
                    
        System.out.println("Depois original: "+Arrays.toString(frutas));//imprimir a String com a Array com alterações
                                                //passar a Array para uma string (array frutas)

    }

     }

