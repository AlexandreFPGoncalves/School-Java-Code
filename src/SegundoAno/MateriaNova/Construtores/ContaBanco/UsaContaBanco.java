package SegundoAno.MateriaNova.Construtores.ContaBanco;

public class UsaContaBanco {
    public static void main(String[] args) {
        
        
        //Construtor para dados pessoais
        //construtor de 4 parametros
        ContaBanco pessoa = new ContaBanco("Alex","Filipe","Avenida João de Deus nº133",231341515);
        System.out.println();
        System.out.println("Nome: " +pessoa.nome+" "+pessoa.unome);
        System.out.println("Morada: " +pessoa.morada);
        System.out.println("CC: " +pessoa.cc);
    
        //Construtor para informação sobre a idade
        //construtor de 3 parametros
        ContaBanco idadepessoa = new ContaBanco(18,true,"04-04-2001");
        System.out.println("Idade: "+ idadepessoa.idade);
        System.out.println("Data de Nascimento: " + idadepessoa.datanascimento);
        
        System.out.println();
        System.out.println("Informação Bancaria:");
        System.out.println();
        
        if(idadepessoa.maioridade == true){
            System.out.println("Tipo de Conta: Adulto");
        }else{System.out.println("Tipo de Conta: Jovem");}
        
        ContaBanco saldopessoa = new ContaBanco(954,false);
        System.out.println("Saldo Bancario: " + saldopessoa.saldo);
        
        if(saldopessoa.saldonegativo == true){
            System.out.println("Deves Dinheiro ao Banco num Total de: " + saldopessoa.saldo);
        }else{System.out.println("Não Deves Dinheiro Nenhum ao Banco.");}
        
        
        
    }
}
