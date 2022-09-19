package Core;


import Loader.Loader;
import Loader.Worlds;

import static GFX.Variables.window;
import static GFX.Variables.world;
import static Loader.Worlds.define;

public class Refresh {
    public static void refresh(){
        Loader.clear();
        Loader.fenceclear();
        define();
        Loader.fence();
        Loader.position();
        window.repaint();
    }
}
