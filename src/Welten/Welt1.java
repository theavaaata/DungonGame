package Welten;

import Core.Refresh;
import GFX.Variables;

public class Welt1 {
    public static void main(){
        if(Player.player.y <= -Player.player.playerheight){
            Variables.world = 2;
            Player.player.y = 8 * Player.player.playerheight;
            Refresh.refresh();
            Welten.zaunluecke();
        }
    }
}
