package Core;


import GFX.Variables;

import static Core.Refresh.refresh;

public class Main {
    
    public static void main(String[] args) {
        Variables.variables();
        GFX.gfx.main();
        Player.player.main();
        KeyListener.keylistener();
        Loop.tick();
        Welten.Welten.zaunluecke();
        refresh();
    }
}