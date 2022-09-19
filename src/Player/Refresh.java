package Player;

import java.util.Timer;
import java.util.TimerTask;

import static GFX.Variables.size;
import static Player.player.*;




public class Refresh {
    public static boolean up = false;
    public static boolean down = false;
    public static boolean right = false;
    public static boolean left = false;
    static Timer move;
    public static void refresh(){
        player1.setBounds(x,y,size,size);
    }
    public static void move(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(up){
                    y--;
                }
                if(down){
                    y++;
                }
                if(right){
                    x++;
                }
                if(left){
                    x--;
                }
            }
        },0,2);
    }
}
