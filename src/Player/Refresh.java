package Player;

import GFX.Variables;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

import static GFX.Variables.size;
import static GFX.Variables.window;
import static Player.player.*;




public class Refresh {
    public static boolean up = false;
    public static boolean down = false;
    public static boolean right = false;
    public static boolean left = false;
    static Timer move;
    public static void refresh(){
        player1.setBounds(x,y,playerwidth,playerheight);
    }
    public static void move(){
        if(up){
            y-= speed;
        }
        if(down){
            y+= speed;
        }
        if(right){
            x+= speed;
        }
        if(left){
            x-= speed;
        }
    }
}
