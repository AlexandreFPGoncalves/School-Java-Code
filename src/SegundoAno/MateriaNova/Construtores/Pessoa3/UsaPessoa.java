package SegundoAno.MateriaNova.Construtores.Pessoa3;

public class UsaPessoa { //classe Principal
    
    public static void main(String[] args) {    //main
        
        //passagem de parametros no construtor
        
        //utilização do construtor para atribuir valores aos atributos
        Pessoa3 pessoa = new Pessoa3("Alex",18,12340140,"Porto");
        
        //imprimir os atributos
        
        System.out.println("Nome: " +pessoa.nome);
        System.out.println("Idade: "+pessoa.idade);
        System.out.println("CC: "+pessoa.cartaoCidadao);
        System.out.println("Cidade: "+pessoa.cidade);
    }
    
}
