package Core;


import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;


public class Loop {
    //Main Game Loop
    public static void tick(){

        Timer tick = new Timer();
        tick.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                Player.Refresh.refresh();
                //Variables.draw.repaint();
            }
        },0,20);
    }
}
