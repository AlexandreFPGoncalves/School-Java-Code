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
import java.util.Arrays;    //Import para utilizar mais tarde

public class exercicio_Array_Remoção {
    
  public static void main(String[] args) { //começo do meu main
 
   String[] frutas = {"Morangos","Melão","Pessego","Maça","Banana",};   //Declaração do meu array do tipo String,e declaração valores.
    //tipo da array, nome da array               //valores da array
   
   System.out.println("Array Original : " +Arrays.toString(frutas));    //imprimir a String com a Array sem nenhuma alteração        
                                            //passar a Array para uma string (array frutas).
                                            
    // Remover o primeiro elemento (index->0, Vetor->Morangos) da Array
   int removeIndex =0;  //variavel removeIndex com o valor de 0, o valor da variavel corresponde ao valor a ser removido da Array
    //tipo da variavel, dados da variavel.
   
   for(int i = removeIndex; i < frutas.length -1; i++){ //Para a posição escolhida na variavel removeIndex remove esse valor 
        frutas[i] = frutas[i + 1];
      }
   
// Alterando o tamanho da array, depois de remover o primeiro index, o ultimo e o penultimo elemento da array vão se repetir 2 vezes.

    System.out.println("Depois de remover o primeiro elemento da array: "+Arrays.toString(frutas)); //imprimir a Array com as alterações
                                                                         //passar a Array para uma string (array frutas).                                                      
    }
 }    