package SegundoAno.Revisões.RevisõesBasicas;

public class Variaveis {
    public static void main(String[] args) {
        //tipo de dados nome = conteudo
        //declaração e inicialização de variaveis
        
        String meuNome = "Alex Filipe";
        byte idade = 18;
        double altura = 1.78;
        char genero = 'M';
        boolean casado = false;
        
        //testar linhas seguintes!!!
        //alterar conteudo da variavel meuNome
        
        //meuNome = "Alexandre Filipe Paradela Gonçalves";
        
        System.out.println("O meu nome é " +meuNome+"e a minha idade é " + idade);
        System.out.println("Tenho " +altura+" metros de altura e sou do sexo " +genero);
        if (casado == true){
            System.out.println("e sou casado");       
        }else{
            System.out.println("e não sou casado");
        }
        
    }
    
}
