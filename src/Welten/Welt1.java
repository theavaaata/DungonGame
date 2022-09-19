package Welten;


import static GFX.Variables.size;
import static Player.player.border;

public class Welt1 {
    public static void border(){
        border[0][0] = 7 * size;
        border[0][1] = 160;
        border[0][2] = size / 2;
    }
}
