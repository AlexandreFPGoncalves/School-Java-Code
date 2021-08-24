package PrimeiroAno.Exercicios.materia_Arrys;

public class Vetor_Arry {
    
    public static void main(String[] args) {
                //tipo de dados[] nome do array = new tipo de dados [numero de posições]
        
        String[] nomes = new String[3]; //Criação e Inicialização do Array
                                        //(3 posições - 0, 1 e 2)
        nomes [0] = "Tone das Cruzes "; // tipo dos dados têm que ser do tipo do Array
        nomes [1] = "Zé Trolha";
        nomes [2] = "Um Dois Três de Oliveira 4";
        
        //ciclo for com 3 posições
        
        for (int i = 0; i < 3; i++) {   //nomes.length
            System.out.println(nomes[i]);
            
        }
        
        
        //########################################
        //Outra forma de Inicializar Arrays
        //Indico com mais uma posição
        //########################################
        
        
        System.out.println("\n\noutro exemplo - outra forma de inicializar vetores!\n");
        String[] nomes2 ={"Tone das Cruzes","Zé Trolha", "Oliveira 4","Ze-Tone"};
        
        //ciclo for com 4 posições
        
        for(int i = 0; i <4; i++) {     //nome. length
             System.out.println(nomes2[i]);
        }
    }
    
}
