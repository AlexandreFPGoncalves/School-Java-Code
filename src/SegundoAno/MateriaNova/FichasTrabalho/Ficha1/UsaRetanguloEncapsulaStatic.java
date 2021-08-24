package SegundoAno.MateriaNova.FichasTrabalho.Ficha1;

public class UsaRetanguloEncapsulaStatic {
    
    public static void main(String[] args) {
        //Vamos criar uma instancia da classe regangulo com
        //os valores padrão
        
        RetanguloEscapsulaStatic a = new RetanguloEscapsulaStatic();
        
        //agora vamos informar a largura e a altura
        RetanguloEscapsulaStatic b = new RetanguloEscapsulaStatic(10,5);
        
        //os dois retangulos terão a cor verde
        RetanguloEscapsulaStatic.setCor("verde");
        
        
        //mostrar os resultados do primeiro retangulo
        System.out.println("Primeiro Retângulo");
        System.out.println("Largura: " + a.getLargura());
        System.out.println("Altura: " + a.getAltura());
        System.out.println("Cor: "+ RetanguloEscapsulaStatic.getColor());
        System.out.println("Área: "+a.getArea() + " metros quadrados");
        System.out.println("Perímetro: " + a.getPerimetro()+ " metros");
        
        System.out.println();
        
        //mostrar os resultados do segundo retângulo
        System.out.println("Segundo Retângulo");
        System.out.println("Largura: " + b.getLargura());
        System.out.println("Altura: " + b.getAltura());
        System.out.println("Cor: "+ RetanguloEscapsulaStatic.getColor());
        System.out.println("Área: "+b.getArea()+ " metros quadrados");
        System.out.println("Perímetro: " + b.getPerimetro()+ " metros");
    }
    
}
