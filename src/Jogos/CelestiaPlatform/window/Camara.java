package Jogos.CelestiaPlatform.window;

import Jogos.CelestiaPlatform.framework.GameObject;

public class Camara {
    
    private float x,y;
            
    public Camara(float x, float y){
        this.x = x;
        this.y = y;   
    }
    
    public void tick(GameObject player){
        x = -player.getX() + Game.WIDTH/2;
        
    }
    
    
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
}
