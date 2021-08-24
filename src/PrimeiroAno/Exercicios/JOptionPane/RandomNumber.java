package PrimeiroAno.Exercicios.JOptionPane;

import javax.swing.JOptionPane; //import do JOptionPane;
import javax.swing.JDialog;     //import do Jdialog;
import java.util.Random;        //import do Random;

public class RandomNumber {
    
    public static void dica(int palpite, int numero, int tentativas){   //metodo para dar dicas
        if(palpite > numero){   //se o palpite for maior que o numero:
            JOptionPane.showMessageDialog(null,"O teu palpite é maior que o número sorteado!");        //imprimir string na consola
        }else{  //senão
            if(palpite < numero){   //se o palpite for menor que o numero:
                JOptionPane.showMessageDialog(null,"O teu palpite é menor que o número sorteado!");    //imprimir string na consola
            }else{  //senão
                JOptionPane.showMessageDialog(null,"Parabéns Acertaste! O número era: " + numero);     //imprimir string + numero no ecrã
            }}}
    
    public static void main(String[] args) {
            int tentativas=0,valor;
        
        JDialog.setDefaultLookAndFeelDecorated(true);   //altera o visual da caixa de texto
        
            //Inicialização do painel de sim ou nao na variavel resposta.
          int resposta = JOptionPane.showConfirmDialog(null, "Queres começar o jogo?", "Confirmação",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          
          int rndnr = (int) Math.ceil(Math.random()*10);
        switch (resposta) { //inicio de um switch   
            
            //NÃO
            case JOptionPane.NO_OPTION: //Se a opção Nao for escolhida 
                //Fazer:
                System.out.println("Botão do não foi clicado"); //imprimir na consola
                break;
                
            //SIM
            case JOptionPane.YES_OPTION://Se a opção Sim for escolhida          
                System.out.println("Botão de sim foi clicado"); //imprimir na consola
                
                //geração dos numeros aleatorios
                Random geradorDeAleatorios = new Random();  //gerar um numero aleatorio
                int sorteado = geradorDeAleatorios.nextInt(10)+1; //numero aleatorio entre 0-9 +1 que fica 1-10 fica guardado na variavel sorteado
                System.out.println("Número entre 1 e 10 sorteado!");    //imprimir string na consola
               
                //criação de um painel com opções
                do{
                Object[] selectionValues = { "1", "2", "3","4","5","6","7","8","9","10"}; //opções validas
                String initialSelection = "1";  //Opção que aparece primeiro
                Object selection = JOptionPane.showInputDialog(null, "Em que Numero estou a pensar?", //Dialog que aparece no painel
                "Jogo dos numeros", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection); //Criação do painel em si com as opções acima referidas
                System.out.println("A oção selecionada foi: " +selection);    //Imprimir a opção escolhida na consola
                tentativas++;
                
                valor = Integer.parseInt((String) selection);
                dica(valor,sorteado,tentativas);
                }while(valor != sorteado);
                
                 break;

            //FECHADO
            case JOptionPane.CLOSED_OPTION: //Se o painel for fechado
                System.out.println("Painel foi fechado");   //imprimir na consola
                break;
            default:
                break;
        }
        

        }
    }

            