package Core;


import Loader.Loader;

import static GFX.Variables.window;
import static Loader.Worlds.define;

public class Refresh {
    public static void refresh(){
        Loader.clear();
        Loader.fenceclear();
        define();
        Welten.Welten.zaunluecke();
        Loader.fence();
        Loader.position();
        window.repaint();
    }
}
