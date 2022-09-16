package Core;


import GFX.Gui;
import GFX.Variables;
import Player.player;

import static GFX.Variables.window;

public class Main {
    
    public static void main(String[] args) {
        Variables.variables();
        Gui.gui();
        Player.player.main();
        GFX.gfx.main();
        KeyListener.keylistener();
    }
}