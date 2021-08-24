package PrimeiroAno.Exercicios.materia_Arrys;

public class ManipulaArry {
public static void main(String[] args) {
    
        int [] arrayInt = new int [10]; 
        
        arrayInt [0] = 10;
        arrayInt [1] = 20;
        arrayInt [2] = 30;
        arrayInt [3] = 12;
        arrayInt [4] = 89;
        arrayInt [5] = 55;
        arrayInt [6] = 10;
        arrayInt [7] = 1;
        arrayInt [8] = 9;
        arrayInt [9] = 78;
        
        
        int soma = arrayInt[0] +arrayInt [1]+ arrayInt [2];
        System.out.println("A soma dos 3 primeiros elementos é: " +soma);
        
        int soma2 =0;   //contador
        
        for (int i=0; i <10; i++){
            //atualização do contador
            soma2 = soma2 +arrayInt [i];//soma2 += arrayInt [i];
        }
        System.out.println("A soma de todos os elementos é: " +soma2);
    }
}
