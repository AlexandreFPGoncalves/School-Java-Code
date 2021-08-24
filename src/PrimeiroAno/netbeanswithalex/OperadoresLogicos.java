package PrimeiroAno.netbeanswithalex;
// Alexandre Gonçalves
public class OperadoresLogicos {
    public static void main(String[] args) {
        // and - ou - negação
            // && || !
            
            byte idade = 18;
            boolean temCartaConducao=true;
            if (idade>=18 && temCartaConducao==true) {
                System.out.println("Pode Conduzir !");
            } else {
                System.out.println("Não pode conduzir !");
            }
            // Exercício: Alterar operadores e valores de variaveis
            // E verificar o correto funcionamento.
            
            System.out.println("\n\n outro exemplo... Operador || 'ou' \n");
            byte idade1 =15;
            boolean temCartaConducao1=false;
            if (idade1>=18 || temCartaConducao1==true) {
                System.out.println("Pode Conduzir !");
            } else {
                System.out.println("Não pode conduzir !");
            }
            
            System.out.println("\n\n outro exemplo... Negação '|' \n");
            //negar o true ou negar o false
            if (!true) {
                System.out.println("Pode conduzir !");               
            } else {
                System.out.println("Não pode conduzir !");
            }
    }
    
}
