package Core;

import java.util.Timer;
import java.util.TimerTask;

import static GFX.Variables.window;

public class Loop {
    //Main Game Loop
    public static void tick(){

        Timer tick = new Timer();
        tick.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                window.repaint();

                //Refresh.refresh();
                //Variables.draw.repaint();
            }
        },0,20);
    }
}
