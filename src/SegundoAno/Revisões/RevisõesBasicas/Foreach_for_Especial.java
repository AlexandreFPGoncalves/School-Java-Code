package SegundoAno.Revisões.RevisõesBasicas;

public class Foreach_for_Especial {
    public static void main(String[] args) {
        
        //Set da Array sem limites (podemos colocar quantos dados quisermos)
        String[] nomes ={"Alexandre Filipe","Mariana Sousa","Filipe Gonçalves","May Sousa"};
        
        // criar uma variavel do mesmo tipo do Array 
        // para receber cada elemento do Array 
        for(String nome : nomes){// vai percorrer o Array e guardar na variavel "nome"
            System.out.println("o meu nome é "+nome);// imprime até ao fim do for - fim do vetor
            //faz um ciclo e imprime varias vezes os nomes
          
        }
        
        // #############outro exemplo...#############
        System.out.println("// outro exemplo....");
        
        int [] numero ={0,1,2};
        for(int n : numero) {   //vai percorrer o array e guardar na variavel "n"
            System.out.println(n);  //Imprime ate ao fim do for .-. fim do vetor
        } 
        
        // ######################################
            // outro exemplo...
        System.out.println("// outro exemplo....");
        int [] numeros_somar = {10,20,30,40}; //set da array sem limites
        int soma=0; //set do contador
        for(int guardar : numeros_somar){// vai percorrer o Array e guardar variavel "guardar"
            soma+=guardar; // soma = soma + guardar »» contador
            
            System.out.println("ELEMENTOS DO ARRAY »» "+guardar);// imprime até ao fim do for - fim do vetor
            
        }
        System.out.println("SOMA DOS VALORES DO ARRAY :"+ soma);
    }
    
}

