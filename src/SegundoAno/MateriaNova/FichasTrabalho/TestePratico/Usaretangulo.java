package SegundoAno.MateriaNova.FichasTrabalho.TestePratico;

public class Usaretangulo {
    
    public static void main(String[] args) {
        
        //criação do meu objeto a utilizando o construtor por default
        retangulo a = new retangulo();
        //criação do meu objeto b utilizando o construtor com 2 parametros.
        retangulo b = new retangulo(10,5);

        //primeiro retangulo
        System.out.println("Primeiro retangulo");   
        //sout padrao
        System.out.println("Largura: " + a.getLargura());   
        //chamar o metodo get para ter acesso ao atributo
        System.out.println("Altura: "+a.getAltura());   
        //chamar o metodo get para ter acesso ao atributo
        System.out.println("Area: "+a.getArea()+" metros quadrados");   
        //chamar o metodo getArea para fazer o calculo da Area
        System.out.println("Perimetro: "+a.getPerimetro()+" metros");   
        //chamar o metodo getPerimetro para fazer o calculo do perimetro
        
        
        System.out.println(); //linha de espaço
        
        //primeiro retangulo
        System.out.println("Segundo retangulo");
        System.out.println("Largura: " + b.getLargura());   
        //chamar o metodo get para ter acesso ao atributo
        System.out.println("Altura: "+b.getAltura());  
        //chamar o metodo get para ter acesso ao atributo
        System.out.println("Area: "+b.getArea()+" metros quadrados");   
        //chamar o metodo getArea para fazer o calculo da Area
        System.out.println("Perimetro: "+b.getPerimetro()+" metros");  
        //chamar o metodo getPerimetro para fazer o calculo do perimetro
    }
    
    
    
}
