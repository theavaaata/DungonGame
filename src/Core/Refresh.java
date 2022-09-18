package Core;


import Loader.Loader;
import Loader.Worlds;

import static GFX.Variables.world;

public class Refresh {
    public static void refresh(){
        Loader.clear();
        switch (world) {
            case 1 -> Worlds.w1();
            case 2 -> Worlds.w2();
        }
        Loader.position();
        //Loader.loader();
    }
}
