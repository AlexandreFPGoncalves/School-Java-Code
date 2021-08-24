package PrimeiroAno.TrabalhoPesquisa;

public class PesquisaCase {
    public static void main(String[] args) {
        int roll = 3;
        switch (roll) {
            case 1 : 
                    System.out.println("Ola sou o David"); //caso a variavel roll tenha o valor de 1 este comando vai ser imprimido.
                    break;
            case 2 :
                    System.out.println("Ola sou o Pedro"); //caso a variavel roll tenha o valor de 2 este comando vai ser imprimido.
                    break;
            case 3 :
                    System.out.println("Ola sou o Alex"); //caso a variavel roll tenha o valor de 3 este comando vai ser imprimido.
                    break;
            case 4 :
                    System.out.println("Ola sou a Raquel"); //caso a variavel roll tenha o valor de 4 este comando vai ser imprimido.
                    break;
            default :
                    System.out.println("sem usuario."); //caso a variavel roll tenha um valor diferente de 1,2 ou 3 este comando vai ser imprimido
                    break;
                    //Dependendo do valor da variavel roll o valor imprimido no ecrã muda.
        }
    }
}
