package SegundoAno.Revisões.RevisõesBasicas;

public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 7; //variavel a ser analisada
        String NomedoDia;
        
        switch(diaDaSemana){
        case 1: NomedoDia = "Domingo";
            break;
        case 2: NomedoDia = "Segunda";
            break;
        case 3: NomedoDia = "Terça";
            break;
        case 4: NomedoDia = "Quarta";
            break;
        case 5: NomedoDia = "Quinta";
            break;
        case 6: NomedoDia = "Sexta";
            break;
        case 7: NomedoDia = "Sabado";
            break;
        default: NomedoDia = "Dia inválido";
            break;
    }
        System.out.println(NomedoDia);
    }
    //exercicio fazer a varaivel diaDaSemana
    //verificar funcionamento do switch ... case
    
}
