package SegundoAno.Revisões.RevisõesObjetos.Sorteio;

import java.util.Random;

public class Sorteio {
    
    
    public static void main(String[] args) {
        
        //Sorteio Dos Numeros
        Random numerosorteado = new Random();
        int numerosorteado_numerovencedor = numerosorteado.nextInt(50);
        int numerosorteado_participante1 = numerosorteado.nextInt(50);
        
        System.out.println(numerosorteado_participante1);
        System.out.println(numerosorteado_numerovencedor);
        
        //participantes
        Participantes participante1 = new Participantes();
        participante1.nome = "Filipe";
        participante1.unome = "Rodrigues";
        participante1.idade = 24;
        participante1.morada = "Rua Das Flores nº250";
        participante1.contacto = 929870040;
        participante1.numero = numerosorteado_participante1;

        if(participante1.numero == numerosorteado_numerovencedor){
            System.out.println("Temos um Vendedor!!!");
            System.out.println(participante1.nome+" "+participante1.unome+" com "+participante1.idade+
                    " anos de idade " + "mora na " + participante1.morada);
            
        }
        
        
        
        
    }
    
}
