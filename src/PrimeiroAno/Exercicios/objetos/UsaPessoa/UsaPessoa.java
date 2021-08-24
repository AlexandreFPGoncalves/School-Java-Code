package PrimeiroAno.Exercicios.objetos.UsaPessoa;
//Exercicio para avaliação;
//a-) Criar 4 atributos (nome, idade, cidade e último nome)
//b-) Criar 3 objetos do tipo Pessoa
//c-) Imprimir todos os atributos com sequência lógica

public class UsaPessoa {    //Classe principal
    public static void main(String[] args) {
        
        //1ºPessoa
        Pessoa pessoa1 = new Pessoa(); //declação de um objeto (alex) do tipo Pessoa.
        
        pessoa1.nome="Alex ";       //declaração do atributo nome para a variavel alex do tipo Pessoa.
        pessoa1.idade=18;          //declaração do atributo idade para a variavel alex do tipo Pessoa.
        pessoa1.cidade="Porto ";    //declaração do atributo cidade para a variavel alex do tipo Pessoa.
        pessoa1.unome="Gonçalves "; //declaração do atributo unome para a variavel alex do tipo Pessoa.
        //System.out.println(pessoa1.nome="Alex");         //se quiser imprimir e declarar valores ao mesmo tempo.
        //System.out.println(pessoa1.idade=18);            //se quiser imprimir e declarar valores ao mesmo tempo.
        //System.out.println(pessoa1.cidade="Porto");      //se quiser imprimir e declarar valores ao mesmo tempo.
        //System.out.println(pessoa1.unome="Gonçalves");   //se quiser imprimir e declarar valores ao mesmo tempo.
        System.out.println("O meu nome é " +pessoa1.nome + pessoa1.unome + "tenho " + pessoa1.idade + "anos e moro na cidade " + pessoa1.cidade);
        //String e conquenação das variaveis com os valores ja atribuidos.
        
        //2ºPessoa
        Pessoa pessoa2 = new Pessoa();  //declação de um objeto (rui) do tipo Pessoa.
        pessoa2.nome="Rui ";       //declaração do atributo nome para a variavel alex do tipo Pessoa.
        pessoa2.idade=23;           //declaração do atributo idade para a variavel alex do tipo Pessoa.
        pessoa2.cidade="Lisboa ";    //declaração do atributo cidade para a variavel alex do tipo Pessoa.
        pessoa2.unome="Vitoria ";    //declaração do atributo unome para a variavel alex do tipo Pessoa.
        System.out.println("O meu nome é " +pessoa2.nome + pessoa2.unome + "tenho " + pessoa2.idade + "anos e moro na cidade " + pessoa2.cidade);
        //String e conquenação das variaveis com os valores ja atribuidos.
        
        //3ºPessoa
        Pessoa pessoa3 = new Pessoa();  //declação de um objeto (mariana) do tipo Pessoa.
        pessoa3.nome="Mariana ";       //declaração do atributo nome para a variavel alex do tipo Pessoa.
        pessoa3.idade=16;       //declaração do atributo idade para a variavel alex do tipo Pessoa.
        pessoa3.cidade="Porto "; //declaração do atributo cidade para a variavel alex do tipo Pessoa.
        pessoa3.unome="Sousa ";  //declaração do atributo unome para a variavel alex do tipo Pessoa.

        System.out.println("O meu nome é " +pessoa3.nome + pessoa3.unome + "tenho " + pessoa3.idade + "anos e moro na cidade " + pessoa3.cidade);
        //String e conquenação das variaveis com os valores ja atribuidos.
    

    }

}
