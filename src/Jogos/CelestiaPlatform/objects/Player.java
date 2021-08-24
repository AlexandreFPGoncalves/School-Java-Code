package Jogos.CelestiaPlatform.objects;

import Jogos.CelestiaPlatform.framework.GameObject;
import Jogos.CelestiaPlatform.framework.ObjectId;
import Jogos.CelestiaPlatform.framework.Texture;
import Jogos.CelestiaPlatform.window.Game;
import Jogos.CelestiaPlatform.window.Handler;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Player extends GameObject{
    //tamanho do Jogador
    private int width = 48, height = 96;
    //gravidade
    private float gravity =0.5f;
    private final float MAX_SPEED = 125;
    
    private Handler handler;
    Texture tex = Game.getInstance();
    
    public Player(float x, float y, Handler handler, ObjectId id) {
        super(x, y, id);
        this.handler = handler;
    }

    @Override
    public void tick(LinkedList<GameObject> object) {
        x += velX;
        y += velY;
        
        if(falling || jumping){
            velY +=gravity;
            
            //limitar a velocidade
            if(velY > MAX_SPEED) //se a velocidade for maior que MAX_SPEED(10)
                velY = MAX_SPEED; // velocidade = 10
        }
        Collision(object);
    }
    
    private void Collision(LinkedList<GameObject> object){
        for(int i= 0; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            
            
            if(tempObject.getId() == ObjectId.Block){
                //Colisão superior
                if(getBoundsTop().intersects(tempObject.getBounds())){
                    y = tempObject.getY() + 32;
                    velY = 0;
                }
                       
                //Colisão inferior.
                if(getBounds().intersects(tempObject.getBounds())){
                    y = tempObject.getY() - height;
                    velY = 0;
                    falling = false;
                    jumping = false;
                }else{
                    falling = true;
                }
                
                if(tempObject.getId() == ObjectId.Block){
                //Colisão Direita
                if(getBoundsRight().intersects(tempObject.getBounds())){
                    x = tempObject.getX() - width;
                }
                if(tempObject.getId() == ObjectId.Block){
                //Colisão Esquerda
                if(getBoundsLeft().intersects(tempObject.getBounds())){
                    x = tempObject.getX() + 35;                
                }
                }    
            }
        }
    }}

    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.drawImage(tex.player[0], (int )x, (int)y,48,96, null);
        
        
        //Bordas para ver os limites
//        Graphics2D g2d =(Graphics2D) g;
//        g.setColor(Color.red);
//        g2d.draw(getBounds());
//        g2d.draw(getBoundsRight());
//        g2d.draw(getBoundsLeft());
//        g2d.draw(getBoundsTop());
    }


    public Rectangle getBounds() {
        return new Rectangle((int) ((int)x +(width/2)-((width/2)/2)), ((int)y+(height/2)), (int)width/2, (int)height/2);
    }
    public Rectangle getBoundsTop() {
        return new Rectangle((int) ((int)x +(width/2)-((width/2)/2)) ,(int) y, (int)width/2, (int)height/2);
    }
    public Rectangle getBoundsRight() {
        return new Rectangle((int) ((int)x+width-5), (int)y+5, (int)5, (int)height-10);
    }
    public Rectangle getBoundsLeft() {
        return new Rectangle((int)x, (int)y+5, (int)5, (int)height-10);
    }

    
    
}