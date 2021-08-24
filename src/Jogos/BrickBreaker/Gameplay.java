package Jogos.BrickBreaker; //package

//***Importes
import java.awt.Graphics;   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.Timer;
//***fim dos Importes

public class Gameplay extends JPanel implements KeyListener, ActionListener{ 
//criação do metodo Gameplay que extende os comandos Keylistener e actionlistener para o painel
    
    //***Declaração das variaveis
    //settings
    private boolean play = false;   // variavel que começa o jogo, false logo o jogo não começou;
    private int score = 0;          //variavel que da o valor ao score do jogo, este começa no 0;
    private int totalBricks = 21;   //variavel que tem setted o valor total de Bricks para partir no caso 21;
    private Timer timer;            //variavel timer do tipo Timer que cria um TIMERR XD;
    private int delay = 3;          //delay no speed da bola;
    //jogador
    private int playerX = 300;      //Variavel que cria a posição do player X;
    //bola
    private int ballposX = 120; //posição X inicial da bola;
    private int ballposY = 350; //posição Y inicial da bola;
    private int ballXdir = -1;  //direção X para onde a bola se vai mexer;
    private int ballYdir = -2;  //direção Y para onde a bola se vai mexer;
    //***Fim da Declaração das variaveis
    
    private GeradorDeMapas map; //acesso ao metodo GeradorDeMapas e chamo-lhe map.
    
    public Gameplay(){  //criação de um metodo Gameplay.
        map = new GeradorDeMapas(3,7);          //este cria 3 colunas e 7 linhas de Bricks para o jogo;
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }
    
    public void paint(Graphics g){
        
        //background
        g.setColor(Color.black);
        g.fillRect(1,1,692,592);
        
        //desenhar o mapa
        map.draw((Graphics2D)g);
        
        
        //bordas
        g.setColor(Color.red);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);
        
        //desenhar o score
        
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD,25));
        g.drawString(""+score,30,30);
        
        //barra
        g.setColor(Color.green);
        g.fillRect(playerX, 550,100,8);
        
        //Bola
        g.setColor(Color.red);
        g.fillOval(ballposX, ballposY,20,20);
        
        //fim de jogo
        if(totalBricks <=0){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD,30));
            g.drawString("Ganhas-te! O teu Score é: "+score,180,300);
            
            g.setFont(new Font("serif", Font.BOLD,20));
            g.drawString("Clica no Enter para recomeçar o jogo",173,350);  
        }

        if(ballposY > 570){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD,30));
            g.drawString("Game Over, Score: "+score,190,300);
            
            g.setFont(new Font("serif", Font.BOLD,20));
            g.drawString("Clica no Enter para recomeçar o jogo",173,350);
            
        }
        
        g.dispose();
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT){
            if(playerX >=600){
                playerX = 600;
            } else {
                moveRight();}}
        
        if(ke.getKeyCode() == KeyEvent.VK_LEFT){
            if(playerX <10){
                playerX = 10;
            } else {
                moveLeft();}}
        if(ke.getKeyCode() == KeyEvent.VK_ENTER){
            if(!play){
                play = true;
                ballposX = 120;
                ballposY = 350;
                ballXdir = -1;
                ballYdir = -2;
                playerX = 310;
                score = 0;
                totalBricks = 21;
                map = new GeradorDeMapas(3,7); 
                
                repaint();
            }
        }
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {}
    @Override
    public void keyReleased(KeyEvent ke) {}
    @Override
    public void actionPerformed(ActionEvent ae) {
        timer.start();
        if(play){
            if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100,8))){
                ballYdir = -ballYdir;              
            }
            A:    for(int i=0; i<map.map.length; i++){
                for(int j=0; j<map.map[0].length; j++){
                    if(map.map[i][j] > 0){
                        int brickX = j*map.brickWidth + 80;
                        int brickY = i*map.brickHeight + 50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;
                        
                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballposX, ballposY,20,20);
                        Rectangle brickRect = rect;
                        
                        if(ballRect.intersects(brickRect)){
                            map.setBrickValue(0,i,j);
                            totalBricks--;
                            score += 5;
                            
                            if(ballposX+19 <=brickRect.x || ballposX+1 >=brickRect.x +brickRect.width){
                                ballXdir = -ballXdir;
                            }else{
                                ballYdir = -ballYdir;
                            }
                            break A;
                        }
                    }
                }
            }
            
            ballposX += ballXdir;
            ballposY += ballYdir;
            if(ballposX < 0){
                ballXdir = -ballXdir;
            }
            if(ballposY < 0){
                ballYdir = -ballYdir;
            }
            if(ballposX > 670){
                ballXdir = -ballXdir;
            }
        }
        repaint();
    }
    
    //metodo moveRight
    public void moveRight(){
        play = true;
        playerX+=50;     
    }
    //metodo moveLeft
    public void moveLeft(){
        play = true;
        playerX-=50;     
    }
     
}
