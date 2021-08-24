package SegundoAno.MateriaNova.FichasTrabalho.Ficha1;

public class RetanguloEscapsulaStatic {
    
    private double largura; //largura do retangulo
    private double altura; //altura do retangulo
    
    
    //O exercicio pede que todos os retangulos tenham a mesma cor.
    //Um recurso marcado com este modificador pertence à uma classe.
    //E nao as suas instancias. Isso quer dizer que podemos aceder a metodos ou 
    //variaveis estaticas sem a necessidade de criar uma copia da classe.
    
    
    //detalhes sobre o modificador "STATIC"
    
    private static String cor = "branco"; //cor do retangulo (PADRÃO)
    
    //construtor sem argumentos
    
    public RetanguloEscapsulaStatic(){
        this.largura = 1;
        this.altura = 1;
    }
    
    
    //Constutor que permite especificar a largura e a altura
    
    public RetanguloEscapsulaStatic(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    //obtem a altura
    
    public double getAltura(){
        return altura;}
    
    //define a altura
    
    public void setAltura(double altura){
        this.altura = altura;}
    
    //obtem a largura
    
    public double getLargura(){
        return largura;}
    
    //define a Largura
    
    public void setLargura(double largura){
        this.largura = largura;}
    
    //obtem a cor de TODOS os retangulos
    
    public static String getColor(){
        return cor;}
    
    //define a cor de todos os retangulos
    public static void setCor(String cor){
    RetanguloEscapsulaStatic.cor = cor;}
    
    //este metodo retorna a área do retangulo (em metros quadrados)
    public double getArea(){
        return (this.largura * this.altura);}
    
    //este metodo retorna o perimetro do retangulo (em metros)
    
    public double getPerimetro(){
    return ((2*this.largura) +(2*this.altura));}
}
