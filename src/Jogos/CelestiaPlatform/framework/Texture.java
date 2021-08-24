package Jogos.CelestiaPlatform.framework;

import Jogos.CelestiaPlatform.window.BufferedImageLoader;
import java.awt.image.BufferedImage;

public class Texture {
    
    public BufferedImage[] block = new BufferedImage[3];
    public BufferedImage[] player = new BufferedImage[1];
    public BufferedImage[] fundo = new BufferedImage[3];
    
    SpriteSheet ss;
    
    SpriteSheet bs,ps_D,ps_E,r,f;
    private BufferedImage block_sheet = null;
    private BufferedImage rock_sheet = null;
    private BufferedImage fundo_t_sheet = null;
    private BufferedImage player_sheet_D = null;
    private BufferedImage player_sheet_E = null;
  
    
    public Texture(){

        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            block_sheet = loader.loadImage("/block.png");
            fundo_t_sheet = loader.loadImage("block_escuros.png");
            rock_sheet = loader.loadImage("/rock.png");
            player_sheet_D = loader.loadImage("/Lucia_D.png");
            
            
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        bs = new SpriteSheet(block_sheet);
        r = new SpriteSheet(rock_sheet);
        f = new SpriteSheet(fundo_t_sheet);
        ps_D = new SpriteSheet(player_sheet_D);
        ps_E = new SpriteSheet(player_sheet_E);
        
        getTextures();
    }
    
    private void getTextures(){
        block[0] = bs.grabImage(1, 1, 32, 32); //grass block
        block[1] = bs.grabImage(2, 1, 32, 32); //dirt block
        
        block[2] = r.grabImage(1, 1, 32, 32);  //rock block
        
        fundo[0] = f.grabImage(2,1,32,32);  //fundo grass escuro
        fundo[1] = f.grabImage(3,1,32,32);  //fundo rock escuro
        
        player[0] = ps_D.grabImage(1, 1, 64, 64); //idle frame for player
    }
}
