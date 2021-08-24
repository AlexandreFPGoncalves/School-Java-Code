package SegundoAno.Revisões.RevisõesObjetos.ConstrutoresExemplo;

public class UsaPessoa {
    public static void main(String[] args) {
        
        
        Pessoa pessoa1 = new Pessoa();
        System.out.println("o Meu nome é " + pessoa1.nome);
        System.out.println("E tenho " + pessoa1.idade+" Anos de idade");
        
        System.out.println();
        
        Pessoa pessoa2 = new Pessoa("Alex",18);
        System.out.println("o Meu nome é " + pessoa2.nome);
        System.out.println("E tenho " + pessoa2.idade+" Anos de idade");
    }
    
}
