package Jogos.CelestiaPlatform.window;

import Jogos.CelestiaPlatform.framework.GameObject;
import Jogos.CelestiaPlatform.framework.ObjectId;
import Jogos.CelestiaPlatform.objects.Block;
import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
    
    public LinkedList<GameObject> object = new LinkedList();
    
    private GameObject tempObject;
    
    public void tick(){
        for(int i= 0; i< object.size(); i++){
            
            tempObject = object.get(i);
            tempObject.tick(object);
        }
    }
    public void render(Graphics g){
                for(int i= 0; i< object.size(); i++){
            
            tempObject = object.get(i);
            tempObject.render(g);
        }      
    }
    ///...Inicio do local para adicionar objectos
    public void addObject(GameObject object){
        this.object.add(object);
    }
    ///...Fim do local para adicionar objectos
    
    ///...Inicio do metodo para remover objectos
    public void removeObject(GameObject object){
        this.object.remove(object);
    }
    ///...Inicio do local para remover objectos
    
    public void createLevel(){
        //criação dos blocos no lvl
        
//        for(int yy =0; yy< Game.HEIGHT+32; yy+=32){
//            addObject(new Block(0,yy,ObjectId.Block));
//            
//	for(int xx = 0; xx < Game.WIDTH*2; xx += 32)
//            addObject(new Block(xx,Game.HEIGHT-32,ObjectId.Block));
//		
//	for(int xx = 200; xx < 600; xx += 32)
//            addObject(new Block(xx, 400, ObjectId.Block));
//    }
    }
}
