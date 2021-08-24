package PrimeiroAno.Exercicios.objetos.classepc;    //package
/*
    a-)Criar uma classe Computador com 6 atributos(marca, processador, ram, 
    quantidade de ram, marca da placa gráfica e quantidade de memória da placa gráfica
    b-)Criar 3 objetos do tipo computador(com nome que desejar!!)
    c-)Imprimir todos os atributos com sequencia logica para cada objeto da casse computador.
    d-)implementar 3 metodos sem retorno com SOU'S ESPECIFICOS E OBTER O OUTPUT.
    (...ligaComputador...desligaComputador...hibernaComputador)
*/
public class UsaComputador {    //classe principal
    public static void main(String[] args) {    //main
      //Computador nº1
        
        Computador pc1 = new Computador();  //declação de um objeto (pc1) do tipo Computador.
            pc1.marca="Omen";                       //declaração do atributo marca para a variavel pc1 do tipo Computador.
            pc1.processador="Intel coreI5 7400";    //declaração do atributo processador para a variavel pc1 do tipo Computador.
            pc1.ram="HyperX";                       //declaração do atributo ram para a variavel pc1 do tipo Computador.
            pc1.quantgbram=8;                       //declaração do atributo quantgbram para a variavel pc1 do tipo Computador.
            pc1.grafica="GTX 1050TI";               //declaração do atributo grafica para a variavel pc1 do tipo Computador.
            pc1.quantgbgrafica=4;                   //declaração do atributo quantgbgrafica para a variavel pc1 do tipo Computador.
            pc1.ligaComputador();                   //invocar o metodo ligaComputador
            
        System.out.println("O Computador da marca " + pc1.marca + " tem um processador " +
                            pc1.processador + " com " + pc1.quantgbram + " gb de RAM da " + pc1.ram +
                            " tem uma gráfica da " + pc1.grafica + "Com " + pc1.quantgbgrafica + "GB dedicados" );
                            //String e conquenação das variaveis com os valores ja atribuidos.
        pc1.desligaComputador();    //invocar o metodo desligaComputador
        System.out.println();       //sout para imprimir uma linha em branco
        
      //Computador nº2
        Computador pc2 = new Computador();  //declação de um objeto (pc2) do tipo Computador.
            pc2.marca="Lenovo";                     //declaração do atributo marca para a variavel pc1 do tipo Computador.
            pc2.processador="Intel coreI7 8500";    //declaração do atributo processador para a variavel pc1 do tipo Computador.
            pc2.ram="Corsair";                      //declaração do atributo ram para a variavel pc1 do tipo Computador.
            pc2.quantgbram=16;                      //declaração do atributo quantgbram para a variavel pc1 do tipo Computador.
            pc2.grafica="GTX 1080TI";               //declaração do atributo grafica para a variavel pc1 do tipo Computador.
            pc2.quantgbgrafica=8;                   //declaração do atributo quantgbgrafica para a variavel pc1 do tipo Computador.
        pc2.ligaComputador();                       //invocar o metodo ligaComputador
        
        System.out.println("O Computador da marca " + pc2.marca + " tem um processador " +
                            pc2.processador + " com " + pc2.quantgbram + " gb de RAM da " + pc2.ram +
                            " tem uma gráfica da " + pc2.grafica + "Com " + pc2.quantgbgrafica + "GB dedicados" );
                            //String e conquenação das variaveis com os valores ja atribuidos.
        pc1.desligaComputador();    //invocar o metodo ligaComputador
        System.out.println();       //sout para imprimir uma linha em branco
        
      //Computador nº3
        Computador pc3 = new Computador();  //declação de um objeto (pc3) do tipo Computador.
            pc3.marca="Asus";                       //declaração do atributo marca para a variavel pc1 do tipo Computador.
            pc3.processador="AMD Radeon™ RX 580X";  //declaração do atributo processador para a variavel pc1 do tipo Computador.
            pc3.ram="Skillet";                      //declaração do atributo ram para a variavel pc1 do tipo Computador.
            pc3.quantgbram=32;                      //declaração do atributo quantgbram para a variavel pc1 do tipo Computador.
            pc3.grafica="AMD Radeon™ RX 580X";      //declaração do atributo grafica para a variavel pc1 do tipo Computador.
            pc3.quantgbgrafica=8;                   //declaração do atributo quantgbgrafica para a variavel pc1 do tipo Computador.
            pc3.ligaComputador();                   //invocar o metodo ligaComputador
            
        System.out.println("O Computador da marca " + pc3.marca + " tem um processador " +
                            pc3.processador + " com " + pc3.quantgbram + " gb de RAM da " + pc3.ram +
                            " tem uma gráfica da " + pc3.grafica + "Com " + pc3.quantgbgrafica + "GB dedicados" );
                            //String e conquenação das variaveis com os valores ja atribuidos.
        pc1.hibernaComputador();    //invocar o metodo ligaComputador
        System.out.println();       //sout para imprimir uma linha em branco
    }
    
}
