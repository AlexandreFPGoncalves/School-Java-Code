package SegundoAno.MateriaNova.FichasTrabalho.TestePratico;

public class testeGerenteComercial {
    
    public static void main(String[] args) {
        
        //criação do objeto a com os parametros definidos pelo utilizador.
        GerenteComercial a = new GerenteComercial("Alex",1000);
        
        
        System.out.println("Nome do Gerente: " + a.nome);
        System.out.println("Salario Base: " +a.salario);
        System.out.println("Com aumento no salario em 20%");
        //metodo aumentasalario20
        System.out.println("Salario aumentado em 20% : " + a.aumentaSalario20()); 
        System.out.println("Com aumento no salario em 40%");
        //metodo aumentasalario40
        System.out.println("Salario aumentado em 40% : " + a.aumentaSalario40());
    }
}
