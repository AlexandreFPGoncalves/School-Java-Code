package SegundoAno.MateriaNova.Exercicios.Garrafao;


public class UsaGarrafao {
    
   
    
    public static void main(String[] args) {
        
        Garrafao garrafao1 = new Garrafao("plastico",7);
        
        System.out.println("Garrafão de " + garrafao1.material + " com " + garrafao1.capacidade +" litros de capacidade");
        System.out.println();
        
        
        //invocar o metodo encher
        garrafao1.encher();
        System.out.println();
        
        //invocar o metodo esvaziar
        garrafao1.esvaziar();
        System.out.println();
        
        //invocar o metodo partir
        garrafao1.partir();
        System.out.println();
        
        
        
        
    }
    
}
