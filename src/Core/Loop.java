package Core;


import GFX.Variables;

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
                Player.Refresh.move();
                Player.Refresh.refresh();
                Player.player.collision();
                Variables.draw.repaint();
            }
        },0,20);
    }
}
