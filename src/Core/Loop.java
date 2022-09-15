package Core;

import Loader.Loader;
import gfx.Gui;
import gfx.Variables;

import java.util.Timer;
import java.util.TimerTask;

public class Loop {
    //Main Game Loop
    public static void tick(){

        Timer tick = new Timer();
        tick.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                Variables.draw.repaint();
            }
        },0,20);
    }
}
