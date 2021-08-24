package PrimeiroAno.Exercicios.objetos.Classes;

public class Classes {
public static void main(String[] args) {//CLASSE PRINCIPAL
      Pessoas eu = new Pessoas ();// criar objeto eu do tipo Pessoa
      System.out.println(eu.nome);// aceder ao atributo 

      eu.nome="Mudei de nome!! no main!!";//alterar atributo
      eu.nome="Filipe";
      System.out.println(eu.nome);// alterado
      eu.dormir();

      Pessoas outraPessoa= new Pessoas();//novo objeto "outraPessoa"
      System.out.println(outraPessoa.nome);//aceder ao atributo default
                                           // da Classe Pessoa...
                                           
     }
}
