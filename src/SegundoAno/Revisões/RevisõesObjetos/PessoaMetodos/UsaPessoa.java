package SegundoAno.Revisões.RevisõesObjetos.PessoaMetodos;

public class UsaPessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.nome = "Alex";
        pessoa1.unome = "Gonçalves";
        pessoa1.idade = 18;
        pessoa1.animalfav = "a Raposa";
        System.out.println("O meu nome é "+pessoa1.nome+" "+pessoa1.unome+" tenho " +
        pessoa1.idade+" anos de idade e o meu animal favorito é " + pessoa1.animalfav);
        System.out.println();
        
        
        Pessoa pessoa2 = new Pessoa();
        
        pessoa2.nome = "Pedro";
        pessoa2.unome = "Filipe";
        pessoa2.idade = 27;
        pessoa2.animalfav = "o Gato";
        System.out.println("O meu nome é "+pessoa2.nome+" "+pessoa2.unome+" tenho " +
        pessoa2.idade+" anos de idade e o meu animal favorito é " + pessoa2.animalfav);
        pessoa2.gato();
        System.out.println();
        
        
        Pessoa pessoa3 = new Pessoa();
        
        pessoa3.nome = "Nuno";
        pessoa3.unome = "Paradela";
        pessoa3.idade = 56;
        pessoa3.animalfav = "o Cão";
        System.out.println("O meu nome é "+pessoa3.nome+" "+pessoa3.unome+" tenho " +
        pessoa3.idade+" anos de idade e o meu animal favorito é " + pessoa3.animalfav);
        pessoa3.cao();
        System.out.println();
        
        
        Pessoa pessoa4 = new Pessoa();
        
        pessoa4.nome = "Nuno";
        pessoa4.unome = "Paradela";
        pessoa4.idade = 56;
        pessoa4.animalfav = "Nenhum";
        System.out.println("O meu nome é "+pessoa4.nome+" "+pessoa4.unome+" tenho " +
        pessoa4.idade+" anos de idade ");
        pessoa4.nenhum();
        System.out.println();
    }
    
}
