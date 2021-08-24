package SegundoAno.MateriaNova.FichasTrabalho.TestePratico;

public class GerenteComercial {
    
    //atributos publicos.
    public String nome;
    public double salario;
    
    //construtor com 2 argumentos
    public GerenteComercial(String nome, int salario){
        this.nome = nome;
        this.salario = salario;}
    
    //metodo para aumentar o salario em 20%
    public double aumentaSalario20(){
        salario =salario+(this.salario*0.2);
        return salario;
    };
    //metodo para aumentar o salario em 40%
    public double aumentaSalario40(){
        salario=salario+(salario*0.40);
        return salario;};
}
