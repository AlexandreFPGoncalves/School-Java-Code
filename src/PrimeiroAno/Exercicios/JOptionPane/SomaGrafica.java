package PrimeiroAno.Exercicios.JOptionPane;

import javax.swing.JOptionPane; //import do JOptionPane
import javax.swing.JDialog;     //import do Jdialog;

public class SomaGrafica {
    public static void main(String[] args) {
        JDialog.setDefaultLookAndFeelDecorated(true);   //altera o visual da caixa de texto
        
        String valor,resultado; //declaração de variaveis do tipo String
        int num1,num2;          //declaração de varriaveis do tipo int
        
        //1º Valor
        valor = JOptionPane.showInputDialog("Digite o primeiro valor inteiro: ");  //criação do painel para colocar o input
        //conversão de tring para inteiro (parseInt)
        num1 = Integer.parseInt(valor.trim());
        //trim retira espaços
        
        //2º Valor
        valor = JOptionPane.showInputDialog("Digite o segundo valor inteiro: ");  //criação do painel para colocar o input
        //conversão de tring para inteiro (parseInt)
        num2 = Integer.parseInt(valor.trim());
        //trim retira espaços
        
        //resultado
        resultado = String.format("Resultado: %d", num1+num2);
        JOptionPane.showMessageDialog(null,resultado);
        
    }
    
}
