package SegundoAno.MateriaNova.Encapsulamento;

public class Encapsulamento {
    
    //atributos private e publicos
    String nome;    //atributo public
    private String endereço;    //atributo privado
    private long contabanco;    //atributo privado
    
    //construtor utilizando apenas os atributos publicos.
    //visto que n vou ter acesso aos mesmos na minha classe main
    Encapsulamento(String nome){//utilização de um parametro
        this.nome = nome;}//o valor dado ao construtor vai ser guardado no atributo nome
    
    //metodo COM RETORNO do tipo STING
    //para pegar(get) o endereço
    public String getEndereco(){ //metodos sao sempre publicos
        return endereço;} //devolve o endereço
    
    //metodo com RETORNO do tipo LONG
    //para pegar(get) a contabanco
    public Long getContaBanco(){//metodos sao sempre publicos
        return contabanco;}//devolve a contabanco
    
    //metodo sem retorno do tipo String
    //para atribuir(set) o endereço
    public void setEndereço(String endereço){//metodos sao sempre public
        this.endereço = endereço;}//atribui o valor dado ao atributo endereço

    //metodo sem retorno do tipo Long
    //para atribuit(set) o endereço
    public void setContaBanco(long contabanco){//metodos sao sempre public
        this.contabanco = contabanco;}//atribui o valor dado ao atributo contabanco
 
    
    
    public static void main(String[] args) {//classe main
        
        //declaração do meu objeto chamado usuario1
        //utilizando o construtor com 1 parametro dou set ao usuario.nome
        Encapsulamento usuario1 = new Encapsulamento("Alex"); 
        
        //utilizando o metodo set dou Dados aos atributos endereço e contabanco
        usuario1.setEndereço("Rua nova das rodas velhas nº100");
        usuario1.setContaBanco(482929220);
        
        
        System.out.println("Usuario1: "); //sout padrão
        System.out.println(); //linha de espaço
        System.out.println("Nome: " + usuario1.nome); //tenho acesso direto ao atributo
        System.out.println("Endereço: " + usuario1.getEndereco()); //n tenho acesso direto ao atributo pois este é privado
        System.out.println("ContaBancaria: " + usuario1.getContaBanco());//n tenho acesso direto ao atributo pois este é privado
        
    }
    
}
