package SegundoAno.MateriaNova.InterfaceGrafica;


import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class interfacegrafica {
    
    public static void main(String[] args) {
        //Cria uma referencia "produtos" do "tipo" Object;
        // -tabela de 2 dimensões ("parecido" com vetor 2D)
        
        
        Object[][] produtos = {
            {new Integer(102030), "Bife à Portugues", "Bife & Co."},
            {new Integer(203040), "Francesinha Especial", "Colestrol & Co."},
            {new Integer(304050), "Asinhas de Frango Picantes", "Frango, Sempre Abrir & Co."}
        };
        
        //Vetor do tipo String
        
        String[] titulos = {"Código","Produto","Fornecedor"};
        JFrame janela = new JFrame();
        janela.setTitle("JTable - CONTROL DE MENUS E FORNECEDORES ....");
        janela.setSize(750,150);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //ver tabelo resumo de construtores deste componente!!!
        
        JTable tabela = new JTable(produtos, titulos);
        JScrollPane areaRolamento = new JScrollPane(tabela);
        //método relativo à dimensão do "rolamento"
        tabela.setPreferredScrollableViewportSize(new Dimension(325,80));
        janela.add(areaRolamento);
        janela.setVisible(true);
    }
    
    
    
}
