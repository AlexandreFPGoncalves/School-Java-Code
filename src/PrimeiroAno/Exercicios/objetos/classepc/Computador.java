package PrimeiroAno.Exercicios.objetos.classepc;    //package
/*
    a-)Criar uma classe Computador com 6 atributos(marca, processador, ram, 
    quantidade de ram, marca da placa gráfica e quantidade de memória da placa gráfica
    b-)Criar 3 objetos do tipo computador(com nome que desejar!!)
    c-)Imprimir todos os atributos com sequencia logica para cada objeto da casse computador.
    d-)implementar 3 metodos sem retorno com SOU'S ESPECIFICOS E OBTER O OUTPUT.
    (...ligaComputador...desligaComputador...hibernaComputador)
*/
public class Computador {   //Class secundaria
    
    String marca;       //declaração da variavel marca do tipo string.
    String processador; //declaração da variavel processador do tipo string.
    String ram;         //declaração da variavel ram do tipo string.
    int quantgbram;     //declaração da variavel quantgbram do tipo int.
    String grafica;     //declaração da variavel grafica do tipo string.
    int quantgbgrafica; //declaração da variavel quantgbgrafica do tipo int.
    
void ligaComputador(){  //criação do void.
           System.out.println("O Computador esta a ligar...");  //string a ser imprimida no void
       }
void desligaComputador(){   //criação do void.
           System.out.println("O Computador esta a desligar...");   //string a ser imprimida no void
       }
void hibernaComputador(){   //criação do void.
           System.out.println("O Computador esta a entrar em modo de hibernação...");   //string a ser imprimida no void
       }

}
