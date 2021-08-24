package PrimeiroAno.Exercicios.objetos.CriarVeiculo;    //package
//Exercicio para avaliação;
//a-) Criar 4 atributos (marca, cor, cilindrada e ano_de_compra)
//b-) Criar 4 objetos do tipo Veiculo
//c-) Imprimir todos os atributos com sequência lógica
public class UsaVeiculo {   //classe principal
        public static void main(String[] args) {    //main
        
        //1ºVeiculo
        Veiculo veiculo1 = new Veiculo(); //declação de um objeto (veiculo1) do tipo Veiculo.
        
        veiculo1.marca="Toyota";       //declaração do atributo marca para a variavel veiculo1 do tipo Veiculo.
        veiculo1.cor="Preto";          //declaração do atributo cor para a variavel veiculo1 do tipo Veiculo.
        veiculo1.cilindrada=400;       //declaração do atributo cilindrada para a variavel veiculo1 do tipo Veiculo.
        veiculo1.ano_de_compra=2015;   //declaração do atributo ano_de_compra para a variavel veiculo1 do tipo Veiculo.

        System.out.println("Veiculo da marca " + veiculo1.marca + " de cor " + veiculo1.cor + " com " + veiculo1.cilindrada + " comprado no ano " + veiculo1.ano_de_compra);
        //String e conquenação das variaveis com os valores ja atribuidos.
        
        //2ºVeiculo
        Veiculo veiculo2 = new Veiculo(); //declação de um objeto (veiculo2) do tipo Veiculo.
        
        veiculo2.marca="Ferrarri";     //declaração do atributo marca para a variavel veiculo1 do tipo Veiculo.
        veiculo2.cor="Branco perola";  //declaração do atributo cor para a variavel veiculo1 do tipo Veiculo.
        veiculo2.cilindrada=560;       //declaração do atributo cilindrada para a variavel veiculo1 do tipo Veiculo.
        veiculo2.ano_de_compra=1990;   //declaração do atributo ano_de_compra para a variavel veiculo1 do tipo Veiculo.

        System.out.println("Veiculo da marca " + veiculo2.marca + " de cor " + veiculo2.cor + " com " + veiculo2.cilindrada + " comprado no ano " + veiculo2.ano_de_compra);
        //String e conquenação das variaveis com os valores ja atribuidos.
        
        //3ºVeiculo
        Veiculo veiculo3 = new Veiculo(); //declação de um objeto (veiculo3) do tipo Veiculo.
        
        veiculo3.marca="Oppel";        //declaração do atributo marca para a variavel veiculo1 do tipo Veiculo.
        veiculo3.cor="Azul Marinho";   //declaração do atributo cor para a variavel veiculo1 do tipo Veiculo.
        veiculo3.cilindrada=450;       //declaração do atributo cilindrada para a variavel veiculo1 do tipo Veiculo.
        veiculo3.ano_de_compra=1999;   //declaração do atributo ano_de_compra para a variavel veiculo1 do tipo Veiculo.

        System.out.println("Veiculo da marca " + veiculo3.marca + " de cor " + veiculo3.cor + " com " + veiculo3.cilindrada + " comprado no ano " + veiculo3.ano_de_compra);
        //String e conquenação das variaveis com os valores ja atribuidos.
        
        //4ºVeiculo
        Veiculo veiculo4 = new Veiculo();//declação de um objeto (veiculo3) do tipo Veiculo.
        
        veiculo4.marca="Mercedes-Bens";  //declaração do atributo marca para a variavel veiculo1 do tipo Veiculo.
        veiculo4.cor="Branco";           //declaração do atributo cor para a variavel veiculo1 do tipo Veiculo.
        veiculo4.cilindrada=750;         //declaração do atributo cilindrada para a variavel veiculo1 do tipo Veiculo.
        veiculo4.ano_de_compra=192002;   //declaração do atributo ano_de_compra para a variavel veiculo1 do tipo Veiculo.

        System.out.println("Veiculo da marca " + veiculo4.marca + " de cor " + veiculo4.cor + " com " + veiculo4.cilindrada + " comprado no ano " + veiculo4.ano_de_compra);
        //String e conquenação das variaveis com os valores ja atribuidos.
    

    }

}
    

