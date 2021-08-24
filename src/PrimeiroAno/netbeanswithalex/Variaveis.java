
package PrimeiroAno.netbeanswithalex;

/**
 *
 * @author Alexandre Gonçalves
 */
public class Variaveis {
    //Class Principal "main"
    public static void main(String[] args) {
        
        /** tipo de dados nome = conteudo
         * declaração e iniciliazação de variaveis
         */
        
        String meuNome = "Tone das Cruzes";
        byte idade = 46;
        double altura = 1.79;
        char genero = 'M';
        boolean casado = true;
        long qi =  167;
        long banco = 292901050;
        
        // testar linhas seguintes!!!!
        // aterar conteudo da variavem meuNome
        //meuNome = " Manel das Couves";
        
        //juntar / concatenar o conteudo de variveis tipo string
        // meuNome = meuNome + " Manuel das couves";
        
        meuNome = meuNome + " Manuel das Couves";
        
        System.out.println("O meu nome : " + meuNome+ "e a minha idade: " + idade);
        System.out.println("O meu nome : " + meuNome+ " e tenho: " +altura+ " de altura");
        System.out.println("O meu nome : " + meuNome+ " e sou do genero masculino " + genero);
        System.out.println("Acredito ser alguem bastante esperto visto que o meu QI é de " +qi);
        System.out.println("Se necessario fazer uma transferencia bancaria este é o meu NIB " +banco);
      
        if (casado) {
             System.out.println("O meu nome : " +meuNome+ " e eu sou casado");
        } else {
        System.out.println("vai passear");}
        //************************************************************************************
        System.out.println("O meu nome é " +meuNome+ 
                           " tenho" +idade+ " anos de idade, tenho também " 
                           +altura+ " metros de altura, sou do genero " 
                           +genero);
        
        
        
       
   
        
                
                
      
        
      
        
    }
    
}
