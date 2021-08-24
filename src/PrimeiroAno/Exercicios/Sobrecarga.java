package PrimeiroAno.Exercicios;

public class Sobrecarga {
    int somar(int n1, int n2) {
        int somaDeDois = (n1+n2);
        return (somaDeDois);
    }

    //sobcarga do método »» diferente assinatura
    // mesmo nome, mas diferentes parâmetros 
        int somar(int n1, int n2, int n3){
        int somarDeTres = (n1+n2+n3);
        return (somarDeTres);

    }
        public static void main(String[] args) {// INICIO PROGRAMAR PRINCIPAL 

        Sobrecarga objeto = new Sobrecarga();// DECLARA OBJETO DE TIPO SOBRECARGA 
        int soma = objeto.somar(50,20);// 2 parámetros
        System.out.println(soma);

        int soma2 = objeto.somar(50,20,20);// 3 parámetros
        System.out.println(soma2);
        }
}


