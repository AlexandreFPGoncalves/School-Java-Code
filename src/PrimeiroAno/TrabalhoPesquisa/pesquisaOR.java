package PrimeiroAno.TrabalhoPesquisa;

public class pesquisaOR {
    public static void main(String[] args) {
        
            boolean desconto = true;
            boolean cartão=false;
            if (desconto==true || cartão==true) { //aqui o || esta a dar intenção que apenas um dos requesitos deve ser verdadeiro.
                System.out.println("tem direito a desconto"); //caso se cumpra um dos requesitos este comando é imprimido.
            } else {
                System.out.println("Não pode descontar"); //senão este sera o comando imprimido.
            }
    }
    
}
