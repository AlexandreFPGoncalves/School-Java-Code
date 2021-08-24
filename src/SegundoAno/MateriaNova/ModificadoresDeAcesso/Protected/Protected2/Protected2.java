package SegundoAno.MateriaNova.ModificadoresDeAcesso.Protected.Protected2;

import SegundoAno.MateriaNova.ModificadoresDeAcesso.Protected.Protected;

public class Protected2 {
    
    public static void main(String[] args) {
        
        Protected privado = new Protected();
        
        
        //Nao temos acesso a atributos protegidos
        //em outro package
        
        //System.out.println(privado.data);
        //privado.mensagem();
    }
}
