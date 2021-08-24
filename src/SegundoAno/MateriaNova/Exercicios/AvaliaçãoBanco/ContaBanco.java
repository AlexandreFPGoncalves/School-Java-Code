package SegundoAno.MateriaNova.Exercicios.AvaliaçãoBanco;  //package

public class ContaBanco {   //classe
    
    
    //atributos
    String nome_cliente;    //do tipo String
    double saldo;           //do tipo double
    String cidade;          //do tipo String
    
    //Declaração de um construtor de 3 parametros
    //Com declaração de 3 variaveis internas
    public ContaBanco(String nome, double saldo,String cidade){
        System.out.println("Dados Pessoais: "); //sout padrão
        System.out.println();   //linha de espaço
        //utilização do "this" para se referir aos meus atributos
        this.nome_cliente = nome;   //o valor da variavel nome vai ser guardado no atributo nome_cliente
        this.saldo = saldo;         //o valor da variavel saldo vai ser guardado no atributo saldo
        this.cidade = cidade;       //o valor da variavel cidade vai ser guardado no atributo cidade
        
        System.out.println("Nome: " + this.nome_cliente);   //imprimir atributo
        System.out.println("Cidade: " + this.cidade); //imprimir atributo
        System.out.println();   //linha de espaço
        System.out.println("Saldo Atual: "+ this.saldo); //imprimir atributo
    };
    
    
    
    //declaração de um metodo sem retorno (VOID)
    void exibeSaldo(){  //exibeSaldo
        System.out.println("O seu saldo atual é: " + this.saldo); //sout padrão que vai tmb concatenar com o atributo saldo de determinado objeto.
    };
    
    //Função de sacar dinheiro
    public double saca(double quantidadesacar){ //declaração da minha função com 1 parametro do tipo double
        double qntsacada;   //declaração de uma variavel interna do tipo double
        qntsacada = this.saldo - quantidadesacar; //a quantidade sacada vai ser igual ao saldo atual menos a quantidade escolhida.
        return qntsacada;   //retornar o restante do valor.
    }
    
    //Função de depositar dinheiro
    public double deposita(double quantidadedepositar){ //declaração da minha função com 1 parametro do tipo double
        double qntdepositada;   //declaração de uma variavel interna do tipo double
        qntdepositada = this.saldo + quantidadedepositar; //a quantidade depositada vai ser igual ao saldo atual mais a quantidade escolhida.
        return qntdepositada;   //retornar o valor depois do deposito.
    }
    
    
    
}
