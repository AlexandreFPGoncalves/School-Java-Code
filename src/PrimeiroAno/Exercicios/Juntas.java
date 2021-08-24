package PrimeiroAno.Exercicios;



public class Juntas {
    String juntanome (String n1, String n2) {
        String junta = (n1 + n2);
        return (junta);
    }

    String juntanome (String n1, String n2, String n3) {
        String junta = (n1 + n2 + n3);
        return (junta);
    }

    String juntanome (String n1, String n2, String n3, String n4) {
        String junta = (n1 + n2 + n3 + n4);
        return (junta);
    }

    
    
    
    public static void main(String[] args) {

        Juntas nomes = new Juntas () ;
        String nomes1 = nomes.juntanome("Joao", "Jose");
        System.out.println(nomes1);

        String nomes2 = nomes.juntanome("Joao", "Manel", "Jose");
        System.out.println(nomes2);

        String nomes3 = nomes.juntanome("Joana", "Jose", "Maria", "Antonia");
        System.out.println(nomes3);

    }

}

