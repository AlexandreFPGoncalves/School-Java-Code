package PrimeiroAno.Exercicios.objetos.retorno;//Package

public class Principal {    //classe principal
    public static void main(String[] args) {    //main
        
        Pessoa eu = new Pessoa(); //criar objeto 'eu' do tipo Pessoa
        Pessoa tu = new Pessoa(); //criar objeto 'eu' do tipo Pessoa
        
        eu.mostrarNome("Alex");     //Aceder ao Método mostrarNome
        tu.mostrarNome("Pedro");    //Aceder ao Método mostrarNome
        
        //Aceder ao método calcularIdade da classe Pessoa
        // guardar na variavel idade do mesmo tipo do metodo (int)
        
        int idade = eu.calcularIdade(2001, 2019);   //Chama método "calcularIdade com os 2 parâmetros
        int idade_tu = tu.calcularIdade(1970,2019);  //Chama método "calcularIdade com os 2 parâmetros
        
        System.out.println("E tenho " +idade+ " anos de idade");    //print com conecção a variavel idade
        System.out.println("E tenho " + idade_tu + " anos de idade");//print com coneção a variavelt idadetu
    }
    
}
