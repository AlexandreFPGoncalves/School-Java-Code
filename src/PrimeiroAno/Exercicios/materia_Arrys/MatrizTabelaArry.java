package PrimeiroAno.Exercicios.materia_Arrys;

public class MatrizTabelaArry {
    
public static void main(String[] args) {//main
        //tipo_de_dados [][] nomeDoArray = new tipo_de_dados [número de Linhas] [número de colunas]
        //Array/Vetor do tipo String com o nome 'nomes'
        
        String [] [] nomes = new String [2] [3];//Tabela com 2 linhas e 3 colunas
                                                // Inicia no índice zero
                                                
         nomes [0] [0] = "Tone";//Primeiro vetor
         nomes [0] [1] = "Manel";//Segundo vetor
         nomes [0] [2] = "Maria";//Terceiro vetor
         nomes [1] [0] = "Manelito";//Quarta vetor
         nomes [1] [1] = "Zé-Tonio";//Quinto vetor
         nomes [1] [2] = "MarioLinda";//Sexto vetor
         
         //Impressão dos dados
         System.out.println(nomes [0] [0]);//Imprime no ecrã o primeiro vetor
         System.out.println(nomes [0] [1]);//Imprime no ecrã o segundo vetor
         System.out.println(nomes [0] [2]);//Imprime no ecrã o terceiro vetor
         System.out.println(nomes [1] [0]);//Imprime no ecrã o quarto vetor
         System.out.println(nomes [1] [1]);//Imprime no ecrã o quinto vetor
         System.out.println(nomes [1] [2]);//Imprime no ecrã o sexto vetor
         
      //###########################################################################
      //Outra maneira de Inicializar uma matriz...
      
        System.out.println("Outra maneira de Inicializar uma matriz...");
        
          String [][] nomes2 = {
               {"TONE","MANEL","MARIA"},
               {"MANELITO","ZE-TOINO","MARIOLINDA"}, 
              };
         // impressão dos dados tipo String
         System.out.println(nomes2 [0][0]);
         System.out.println(nomes2 [0][1]);
         System.out.println(nomes2 [0][2]);
         System.out.println(nomes2 [1][0]);
         System.out.println(nomes2 [1][1]);
         System.out.println(nomes2 [1][2]);
        
         
         System.out.println("-----------------------------|");
         System.out.println("| "+nomes [0] [0] + " | " +nomes [0] [1]+ " | "+ nomes [0] [2]+ " |" );
         System.out.println("-----------------------------|");
         System.out.println("|"+ nomes [1] [0]+ "|"+nomes [1] [1] + "|"+nomes [1] [2]+ "|" );
        
    }
        
    }