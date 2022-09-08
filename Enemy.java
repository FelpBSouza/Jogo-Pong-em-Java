import java.awt.Color;
import java.awt.Graphics;


public class Enemy {

    public double x,y;
    public int width,height;


    public Enemy(int x,int y){
        this.x = x;
        this.y = y;
        this.height =10;
        this.width = 40;

    }
    public void tick(){
        x+= (Game.ball.x - x - 6)*0.08;//aonde a bola esta o inimigo vai estar

    }
    
    public void render(Graphics g){

        g.setColor(Color.red);
        g.fillRect((int)x,(int)y,width,height);

    }
}
