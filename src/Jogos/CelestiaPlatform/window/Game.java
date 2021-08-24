package Jogos.CelestiaPlatform.window;

import Jogos.CelestiaPlatform.framework.KeyInput;
import Jogos.CelestiaPlatform.framework.ObjectId;
import static Jogos.CelestiaPlatform.framework.ObjectId.Block;
import static Jogos.CelestiaPlatform.framework.ObjectId.Fundo;
import static Jogos.CelestiaPlatform.framework.ObjectId.Player;
import Jogos.CelestiaPlatform.framework.Texture;
import Jogos.CelestiaPlatform.objects.Block;
import Jogos.CelestiaPlatform.objects.Fundo;
import Jogos.CelestiaPlatform.objects.Player;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Game extends Canvas implements Runnable{

    private boolean running = false;
    private Thread thread;
    
    //Dimensões do jogo
    public static int WIDTH,HEIGHT;
    
    private BufferedImage level = null;
    
    //Object
    Handler handler;
    Camara cam;
    static Texture tex;
    
    Random rand = new Random();
    
    private void init(){
        
        WIDTH = getWidth();
        HEIGHT = getHeight();
        
        tex = new Texture();
        
        BufferedImageLoader loader = new BufferedImageLoader();
        level = loader.loadImage("/level.png"); //abre a imagem level.png
        
        handler = new Handler();
       
        cam = new Camara(0,0);
        
        LoadImageLevel(level);
        
        //handler.addObject(new Player(100,100,handler, ObjectId.Player));
        
        //handler.createLevel();
        
        this.addKeyListener(new KeyInput(handler));
        

 }
    
     
    public synchronized void start(){
        if(running)
            return;
        
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run(){
        init();
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;    //FPS
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        while(running){
            
	long now = System.nanoTime();
	delta += (now - lastTime) / ns;
	lastTime = now;
	while(delta >= 1){
            tick();
            updates++;
            delta--;
	} 
        render();
	frames++;
			
	if(System.currentTimeMillis() - timer > 1000){
		timer += 1000;
		System.out.println("FPS: " + frames + " TICKS: " + updates);
		frames = 0;
		updates = 0;
            }
        }
    }
    private void tick(){
        handler.tick();
        for(int i = 0; i < handler.object.size(); i++){
            if(handler.object.get(i).getId() == ObjectId.Player){
                cam.tick(handler.object.get(i));
            }
        
        
    }}
    private void render(){
        //BufferStrategy vai se igualar a nulo;
        BufferStrategy bs = this.getBufferStrategy();
        //this esta a referir se a canvas do extend que demos a clsse;
        if(bs == null){ //como o bs é nulo podemos dar setup a variavel.
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        Graphics2D g2d = (Graphics2D) g;
                
                
        ///Inicio do Local de desenho para o jogo....///
        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(), getHeight());
        
        g2d.translate(cam.getX(), cam.getY());//inicio da camara 

        handler.render(g);
        g2d.translate(-cam.getX(), -cam.getY());//final da camara   

        ///Fim do Local de desenho para o jogo....///
        g.dispose();
        bs.show();
    }
    
    private void LoadImageLevel(BufferedImage image){
        int w = image.getWidth(); //x512
        int h = image.getHeight(); //x512
        
        System.out.println("width, height: " + w + " "+ h);
        
        for(int xx = 0; xx < h; xx++){
            for(int yy= 0; yy < w; yy++){
                //codigo vai buscar o valor do RGB e sabe em que pixel estamos
                int pixel = image.getRGB(xx,yy);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                
                //blocos
                if(red == 255 && green == 255 && blue == 255) handler.addObject(new Block(xx*32,yy*32,0,ObjectId.Block));
                if(red == 50 && green == 255 && blue ==35) handler.addObject(new Block(xx*32,yy*32,1,ObjectId.Block));
                if(red == 66 && green == 41 && blue ==41) handler.addObject(new Block(xx*32,yy*32,2,ObjectId.Block));
                
                //fundos
                if(red == 150 && green == 255 && blue ==140) handler.addObject(new Fundo(xx*32,yy*32,1,ObjectId.Fundo));
                //player
                if(red == 0&& green == 0&& blue == 255) handler.addObject(new Player(xx*32,yy*32,handler, ObjectId.Player));
                
            }
        }
    }
    
    public static Texture getInstance(){
        return tex;
    }
    
    public static void main(String args[]) 
    {
        new Window(800,600,"Celestia Platform Prototype", new Game());
    }
}
