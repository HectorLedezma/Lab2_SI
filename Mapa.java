package src;

import java.awt.Color;
import java.awt.Graphics;

//import java.util.Random;

public class Mapa {
    
    private int fila = 0;
    private int colu = 0;
    //tamaño de cada bloque en pixeles
    private final int ancho = 40;
    private final int alto =  40;
    //tamaño del mapa en bloques
    private final int Nfil = 17;
    private final int Ncol = 27;
    
    private int[][] mtx;
    private int nivel;
    
    public Mapa(){
        
    }
    
    public Mapa(int[][] mtx,int nivel){
        this.mtx = mtx;
        this.nivel = nivel;
    }
    
    //private final Random dado = new Random();
    
    
    public void paint(Graphics grafico){//dibujado del mapa
        int[][] map = mtx;
        for(fila = 0; fila< Ncol;fila++){
            for(colu = 0; colu < Nfil;colu++){
                if(map[fila][colu] == 0){
                    grafico.setColor(Color.DARK_GRAY);
                    grafico.fillRect(fila*40, colu*40, ancho, alto);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(fila*40, colu*40, ancho, alto);
                }else{
                    grafico.setColor(new Color(nivel*5, 180, 0));
                    grafico.fillRect(fila*40, colu*40, ancho, alto);
                    if(map[fila][colu] == 2){
                        grafico.setColor(Color.LIGHT_GRAY);
                        grafico.fillRect(fila*40, colu*40, ancho, alto);
                        grafico.setColor(Color.BLACK);
                        grafico.drawRect(fila*40, colu*40, ancho, alto);
                    }
                    if(map[fila][colu] == 3){
                        grafico.setColor(new Color(134,36,0));
                        grafico.fillRect(fila*40, colu*40, ancho, alto);
                    }
                }
            }
        }
    }
}
