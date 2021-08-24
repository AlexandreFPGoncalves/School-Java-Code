package SegundoAno.Revisões.RevisõesObjetos.Pessoa;

public class UsaPessoa {
    public static void main(String[] args) {
        
        //criação do objeto "Pessoa1" do tipo Pessoa
        Pessoa pessoa1 = new Pessoa();
        //alteração do atributo nome do tipo String
        pessoa1.nome="Alex";
        //alteração do atributo idade do tipo int
        pessoa1.idade=18;
        //alteração do atributo cidade do tipo String
        pessoa1.cidade="Porto";
        //alteração do atributo ultimonome do tipo String
        pessoa1.ultimonome="Gonçalves";
        
        //imprimir os atributos do objeto pessoa1
        System.out.println("O "+ pessoa1.nome+" "+ pessoa1.ultimonome+" tem "+ 
        pessoa1.idade+" e é da cidade do "+pessoa1.cidade);
        
        
        //criação do objeto "Pessoa2" do tipo Pessoa
        Pessoa pessoa2 = new Pessoa();
        //alteração do atributo nome do tipo String
        pessoa2.nome="Mariana";
        //alteração do atributo idade do tipo int
        pessoa2.idade=17;
        //alteração do atributo cidade do tipo String
        pessoa2.cidade="Porto";
        //alteração do atributo ultimonome do tipo String
        pessoa2.ultimonome="Sousa";
        
        //imprimir os atributos do objeto pessoa1
        System.out.println("O "+ pessoa2.nome+" "+ pessoa2.ultimonome+" tem "+ 
        pessoa2.idade+" e é da cidade do "+pessoa2.cidade);
        
        //criação do objeto "Pessoa3" do tipo Pessoa
        Pessoa pessoa3 = new Pessoa();
        //alteração do atributo nome do tipo String
        pessoa3.nome="Miguel";
        //alteração do atributo idade do tipo int
        pessoa3.idade=19;
        //alteração do atributo cidade do tipo String
        pessoa3.cidade="Porto";
        //alteração do atributo ultimonome do tipo String
        pessoa3.ultimonome="Gonçalves";
        
        //imprimir os atributos do objeto pessoa1
        System.out.println("O "+ pessoa3.nome+" "+ pessoa3.ultimonome+" tem "+ 
        pessoa3.idade+" e é da cidade do "+pessoa3.cidade);
    }
    
}
