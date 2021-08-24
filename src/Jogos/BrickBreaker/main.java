package Jogos.BrickBreaker;

import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        JFrame painelJogo = new JFrame();
        Gameplay gamePlay = new Gameplay();
        painelJogo.setBounds(10, 10, 700, 600);
        painelJogo.setTitle("BrickBreaker");
        painelJogo.setResizable(false);
        painelJogo.setVisible(true);
        painelJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        painelJogo.add(gamePlay);
    }  
}
