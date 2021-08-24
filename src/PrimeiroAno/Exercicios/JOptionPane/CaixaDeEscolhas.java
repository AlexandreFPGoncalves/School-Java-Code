package PrimeiroAno.Exercicios.JOptionPane;

import javax.swing.JOptionPane;

public class CaixaDeEscolhas {
    public static void main(String[] args) {
        Object[] selectionValues = { "Gmail", "Hotmail", "Houtlook","IOL","Sapo",}; //opções validas
        String initialSelection = "Gmail";  //Opção que aparece primeiro
        Object selection = JOptionPane.showInputDialog(null, "Que site de Email utilizas?", //Dialog que aparece no painel
        "Emails", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection); //Criação do painel em si com as opções acima referidas
        System.out.println("A oção selecionada foi: " +selection);    //Imprimir a opção escolhida na consola
    }
    
}
