package PrimeiroAno.Exercicios.objetos.retorno;

public class Pessoa {
    
    void mostrarNome(String nome){
        System.out.println("O meu nome é: " + nome);
    }
    
    //Calcular idade Atual
    //Método com Parametros e Retorno
    //retorna Inteiro ( e não VOID)
    
    int calcularIdade(int ano_nascimento, int ano_atual){
        int resultado; //declaração da variável
        resultado = (ano_atual-ano_nascimento); //atribuição do valor
        return(resultado);
    }
  
}
