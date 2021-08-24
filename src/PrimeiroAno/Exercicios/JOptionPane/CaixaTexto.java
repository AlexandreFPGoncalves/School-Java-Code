package PrimeiroAno.Exercicios.JOptionPane; //package

import javax.swing.JDialog;     //import Jdialog
import javax.swing.JOptionPane; //import do JOptionPane

public class CaixaTexto {   //class CaixaTexto
    
    public static void main(String[] args){
        JDialog.setDefaultLookAndFeelDecorated(true);
        String nome; //variavel nome do tipo string
        nome = JOptionPane.showInputDialog("Qual é o teu nome: ");  //criação do painel para colocar o input
        JOptionPane.showMessageDialog(null,nome+"...Otimo nome ;3"); //painel onde aparece uma mensagem
    }
}
