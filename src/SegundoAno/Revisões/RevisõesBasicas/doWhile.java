package SegundoAno.Revisões.RevisõesBasicas;

public class doWhile {
    
    public static void main(String[] args) {
        
        //executa no minimo, UMA VEZ - independente da condição
        
        //set da variavel numero do tipo inteiro
        int numero = 1; 
        
        do{
            System.out.println("Executou... independentemente do while");
            System.out.println(numero);
            numero++; //incrementa um cada vez que " entra no " "do...while"
        }while (numero <0); //condição
        
        // #############Outro Exemplo...#############
        
        //set da variavel numero2 do tipo inteiro
        int numero2 = 1;
        
        do{
            System.out.println("Executou... exemplo2");
            System.out.println(numero2);
            numero2++; //numero = numero+1 >> incrementa um cada vez que " entra no " " do...while"
        }while (numero2<10); //condição
        
        // #############Outro Exemplo...#############
        
        //No While (...condição...) {} a condição é testada primeiro
        // Só executa, enquanto for verdadeira
        
        
        //set de um contador
        int contador = 1;
        
        while(contador <11){
            System.out.println("Contador é: "+contador);
            contador++;
        }
    }
    
}
