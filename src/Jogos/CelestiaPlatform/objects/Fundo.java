package Jogos.CelestiaPlatform.objects;

import Jogos.CelestiaPlatform.framework.GameObject;
import Jogos.CelestiaPlatform.framework.ObjectId;
import Jogos.CelestiaPlatform.framework.Texture;
import Jogos.CelestiaPlatform.window.Game;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Fundo extends GameObject{
    
    Texture tex = Game.getInstance();
    private int type;
    
    public Fundo(float x, float y,int type, ObjectId id){
        super(x, y, id);
        this.type = type;
    }
    
    @Override
    public void tick(LinkedList<GameObject> object) { 
       
    }

    @Override
    public void render(Graphics g) {
        if(type == 0) //grass fundo block
            g.drawImage(tex.fundo[0],(int)x,(int)y,null);
        if(type == 1) //dirt fundo block
            g.drawImage(tex.fundo[1],(int)x,(int)y,null);
        if(type == 2) //rock fundo block
            g.drawImage(tex.fundo[2],(int)x,(int)y,null);
    }
    @Override
    public Rectangle getBounds() {
        return new Rectangle((int) x,(int) y,32 ,32);
    }

}