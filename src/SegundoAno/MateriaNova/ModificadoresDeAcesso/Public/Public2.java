package SegundoAno.MateriaNova.ModificadoresDeAcesso.Public;

public class Public2 {
    
    public static void main(String[] args) {
        
        Public privado = new Public();
        
        
        //Nao temos acesso a atributos privados
        //em outra classe
        
        System.out.println(privado.data);
        privado.mensagem();
    }
    
}
