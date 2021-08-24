package PrimeiroAno.Exercicios.objetos.Cachorro;

public class UsaCachorro {
    public static void main(String[] args) {
        
        Cachorro bobi = new Cachorro(); 
        Cachorro beubeu = new Cachorro();
        
        bobi.nome="Pedro";
        beubeu.nome="Josefina";
        
        bobi.raça="Pastor Alemão";
        beubeu.raça="Vira Lata";
        
        System.out.println("O cão bobi " + bobi.nome + " é um " + bobi.raça);
      
        
       bobi.latir();
       bobi.fazerXixiNaArvore();
       
       System.out.println();
       System.out.println("O cão beubeu " + beubeu.nome + " é um " + beubeu.raça);
       
        
       beubeu.latir();
       beubeu.fazerXixiNaArvore();
        
    }
    
}
