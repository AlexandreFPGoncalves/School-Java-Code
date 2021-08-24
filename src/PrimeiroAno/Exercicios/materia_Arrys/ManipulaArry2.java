package PrimeiroAno.Exercicios.materia_Arrys;

public class ManipulaArry2 {
    
    public static void main(String[] args) {
    int [] arrayInt = new int [10];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;
        arrayInt[5] = 6;
        arrayInt[6] = 7;
        arrayInt[7] = 8;
        arrayInt[8] = 9;
        arrayInt[9] = 10;

        int soma = arrayInt[0]+arrayInt[1]+arrayInt[2];

        System.out.println("A soma dos 3 primeiros elementos é: " + soma);

        int soma2 = 0;// contador
        for(int i=0; i<10; i=i+2) {
            // atualização do contador
            soma2 = soma2 + arrayInt[i];// soma2 += arrayInt[i];

        }

        System.out.println("A soma de todos os elementos é: " + soma2);

    }
}