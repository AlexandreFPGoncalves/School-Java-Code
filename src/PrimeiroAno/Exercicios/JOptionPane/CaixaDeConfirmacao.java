package PrimeiroAno.Exercicios.JOptionPane;

import javax.swing.JOptionPane; //import do JOptionPane
import javax.swing.JDialog;     //import do Jdialog;

public class CaixaDeConfirmacao {
    
    
    public static void main(String[] args) {
        
        
        JDialog.setDefaultLookAndFeelDecorated(true);   //altera o visual da caixa de texto
        
            //Inicialização do painel de sim ou nao na variavel resposta.
          int resposta = JOptionPane.showConfirmDialog(null, "Queres Continuar?", "Confirmar",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          
        switch (resposta) { //inicio de um switch
            case JOptionPane.NO_OPTION: //Se a opção Nao for escolhida 
                //Fazer:
                System.out.println("Botão do não foi clicado"); //imprimir na consola
                break;
            case JOptionPane.YES_OPTION://Se a opção Sim for escolhida
                //fazer:
                System.out.println("Botão de sim foi clicado"); //imprimir na consola
                
                //criação de um painel com opções
                Object[] selectionValues = { "Gmail", "Hotmail", "Houtlook","IOL","Sapo",}; //opções validas
                String initialSelection = "Gmail";  //Opção que aparece primeiro
                Object selection = JOptionPane.showInputDialog(null, "Que site de Email utilizas?", //Dialog que aparece no painel
                "Emails", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection); //Criação do painel em si com as opções acima referidas
                System.out.println("A oção selecionada foi: " +selection);    //Imprimir a opção escolhida na consola
                break;
            case JOptionPane.CLOSED_OPTION: //Se o painel for fechado
                System.out.println("Painel foi fechado");   //imprimir na consola
                break;
            default:
                break;
        }
        

        }
    }

            