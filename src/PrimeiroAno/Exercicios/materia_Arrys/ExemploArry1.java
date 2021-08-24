package PrimeiroAno.Exercicios.materia_Arrys;

public class ExemploArry1 {
    
    public static void main(String[] args) {        //main  
   
        String [] Categorias = new String[3];       //Array do tipo String com o nome Categorias
                                                    //Array com 3 entradas  do tipo String
        Categorias[0] = " Animais com Riscos de vida Drásticos.";       //primeiro vetor que guarda uma string
        Categorias[1] = " Animais com Riscos de vida Graves.";      //segundo vetor que guarda uma string
        Categorias[2] = " Animais com Riscos de vida Pequenos.";//terceiro vetor que guarda uma string
        
        int Animais = 0;//Declaro a variável Animais do tipo inteiro com valor 0
        
        do{//Função do...while
            System.out.println("Tivemos "  +Animais+  Categorias[0]);//Imprime no ecrã
                                                                     //Conctanea a variável Animais 
                                                                     //com a string e o primeiro vetor
            ++Animais;//Incrementa
        }while (Animais <2);//Executa o número de vezes dependendo da condição(2)
        
        do{//Função do...While
            System.out.println("Tivemos "  +Animais+  Categorias[1]);//Imprime no ecrã
                                                                     //Conctanea a variável Animais
                                                                     //com a string e com o segundo vetor
            ++Animais;//Incrementa       
        }while (Animais <10);//Executa o número de vezes dependendo da condição(10)
        
        
        do{//função do...while
            System.out.println("Tivemos "  +Animais+  Categorias[2]);//Imprime no ecrã
                                                                     //Conctanea a variável Animais
                                                                     //com a string e com o segundo vetor
            ++Animais;//Incrementa 
        }while (Animais <13);//Executa o número de vezes dependendo da condição (13)
        
        
    }
}