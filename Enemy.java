package src;

import java.awt.Color;
import java.util.Random;


public class Enemy extends Entidad{//Agente Enemigo
    Random des = new Random();//randomizador
    public Enemy(int x, int y, Color clr,int[][] mtx) {
        super(x, y, clr,mtx);
    }
    public void move(){
        //se decide aleatoriamente el eje en el cual se movera el agente tras cada movimiento del usuario
        boolean horver = des.nextBoolean();//true = horizontal / false = vertical
        int masmen = des.nextInt(-1, 2);//posibles valores: -1, 0 y +1
        if(horver){
            if((this.getMtx()[(this.getX()+(masmen*40))/40][(this.getY())/40] != 0) && (this.getMtx()[(this.getX()+(masmen*40))/40][(this.getY())/40] != 3)){
                this.setX(this.getX()+(masmen*40));
            }
        }else{
            if((this.getMtx()[(this.getX())/40][(this.getY()+(masmen*40))/40] != 0) && (this.getMtx()[(this.getX())/40][(this.getY()+(masmen*40))/40] != 3)){
                this.setY(this.getY()+(masmen*40));
            }
        }
        
    }
    
    
}
