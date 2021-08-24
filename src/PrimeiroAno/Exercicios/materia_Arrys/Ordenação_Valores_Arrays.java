package PrimeiroAno.Exercicios.materia_Arrys;

//Autor Alexandre Gonçalves

//Topicos deste codigo:

public class Ordenação_Valores_Arrays {
    //Ler um conjunto de números. Exibir em ordem numérica crescente.
    // Avaliação 6 - Comentar o código.
    
    public static void main(String[] args) { //inicio do main
        
        int[] num = new int[5]; //declaração de um vetor do tipo inteiro com 5 posições
        
        System.out.println("Sorteio de Números..."); //preenche os elementos de um vetor com números aleatórios de 10 a 30.
        
        for(int i = 0; i < 5; i++){ //Ciclo for, começando na posição 0 até a posição ser <5, repetindo-se em paços de 1
        num[i] = (int)(Math.random()*21)+10;   //colocar valores random nas varias posições da Array, valor gerado automaticamente.
        }
        
        //A partir deste ponto, o algoritmo irá colocar os números em ordem crescente.
        
       int aux; //declaração de uma variavel do tipo inteiro com a função de auxiliar.
       boolean trocou = true;   //declaração de uma variavel do tipo boolean para server de chave para o meu ciclo while.
       
       
       while(trocou){  //ciclo while, enquanto while for verdadeiro(1) o ciclo vai continuar.
           trocou = false;  //Chave para parar o ciclo while assim que o ciclo for chegar a ultima posição.
                            //Declaramos já que é falso pois na linha 38, dizemos que é verdade dentro do ciclo, assim continuando o ciclo while.
           
           for(int i = 0;i <4; i++){    //Ciclo for, começando na posição 0 até a posição ser <5, repetindo-se em paços de 1
               if(num[i]    >       num[i+1]){  //Se o numero gerado na posição atual for maior que o numero da posição atual+1
                   
                   aux      =       num[i]; //O valor da posição atual vai ser guardado na variavel aux
                   num[i]   =       num[i+1];   //O valor da posição atual+1 vai ser guardado na posição atual
                   num[i+1] =       aux;    //o valor que foi guardado na variavel aux vai passar para a posição atual+1
                   
                   trocou = true;   //declaramos que a variavel trocou é 1, logo o ciclo vai se voltar a repetir na linha 27
                                    //até o ciclo for que começa na linha 32 chegar a ultima posição e o valor da linha 28 ser o final
                                    //e fechar assim o ciclo while.
               }
           }
       }
       
       //Exibição do resultado da ordenação:
                System.out.println("Vetor odenado:");   //String a ser imprimida
                for(int i=0; i < 5; i++){   //Ciclo for, começando na posição 0 até a posição ser <5, repetindo-se em paços de 1
                    System.out.println(num[i]); //imprimir os valores de cada uma das posições da Array.
        }
    }
}
