package SegundoAno.MateriaNova.FichasTrabalho.TestePratico;

public class retangulo {
    //atributos privados
    private double largura;
    private double altura;
    
    //construtor por default com os valores settados a 1.
    public retangulo(){
        this.altura = 1;
        this.largura = 1;}
    //construtor com 2 parametros que o utilizador pode escolher.
    public retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;}
    
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
    
    //este metodo retorna a área do retangulo (em metros quadrados)
    public double getArea(){
        return (this.largura * this.altura);}
    
    //este metodo retorna o perimetro do retangulo (em metros)
    
    public double getPerimetro(){
    return ((2*this.largura) +(2*this.altura));}
    
}
