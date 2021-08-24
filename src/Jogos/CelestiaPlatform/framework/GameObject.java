package Jogos.CelestiaPlatform.framework;

//***Inicio dos imports
    import java.awt.Graphics;
    import java.awt.Rectangle;
    import java.util.LinkedList;
//***Fim dos imports

public abstract class GameObject {
    
//***Inicio das variaveis
    protected float x,y;
    protected ObjectId id;
    protected float velX = 0, velY =0;
    protected boolean falling = true;
    protected boolean jumping = false;
//***Fim das variaveis
    
//**Inicio dos construtores
    public GameObject(float x, float y, ObjectId id){ 
        this.x = x;
        this.y = y;
        this.id = id;
    }
//**Fim dos construtores

//***Inicio das Funções   
    
//***Inicio das funções de colisão    
    public abstract void tick(LinkedList<GameObject> object);
//***Fim das funções de colisão  
    
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    
//***Inicio das funções de velocidade
    public float getVelX(){
        return velX;
    }
    public float getVelY(){
        return velY;
    }
    public void setVelX(float velX){
        this.velX = velX;
    }
    public void setVelY(float velY){
        this.velY = velY;
    }
    //gravidade
    public boolean isFailling(){
        return falling;
    }
    public void setFalling(boolean falling){
        this.falling = falling;
    }
    
    public boolean isJumping(){
        return jumping;
    }
    public void setJumping(boolean jumping){
        this.jumping = jumping;
    }
    
    
//***Fim das funções de velocidade
    
//***Inicio das funções que vai buscar o ID do objeto 
    public ObjectId getId(){
        return id;
    }
//***Fim das funções que vai buscar o ID do objeto  
    
//***Fim das Funções    
}
