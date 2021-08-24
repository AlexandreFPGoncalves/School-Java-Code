package SegundoAno.MateriaNova.Construtores.Carro;

public class UsaCarro {
    public static void main(String[] args) {
        
        Carro display = new Carro();
        System.out.println();
        
        
        Carro carro = new Carro("Preto",650.00,"Toyota","AI90-120","5 Pessoas");
        System.out.println("Cor: " + carro.cor);
        System.out.println("Preço: " +carro.preco);
        System.out.println("Marca: " +carro.modelo);
        System.out.println("Matricula: " +carro.matricula);
        System.out.println("Capacidade: " +carro.capacidade);
        System.out.println();
        
        
        Carro disponivel = new Carro(true);
        if(disponivel.disponivel == true){
            System.out.println("O Carro esta disponivel para entrega");
        }else{
            System.out.println("O Carro Não se encontra disponivel para entrega");
        }
        

        
    }
    
}
