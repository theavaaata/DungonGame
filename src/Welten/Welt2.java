package Welten;


import Core.Refresh;
import GFX.Variables;
import Player.player;

import static GFX.Variables.width;

public class Welt2 {
    public static void main(){
        if(Player.player.y >= Variables.height){
            Variables.world = 5;
            Player.player.y = 0;
            Refresh.refresh();
        }
        if(Player.player.x > width){
            Variables.world = 3;
            Player.player.x = 0;
            Refresh.refresh();
        }
        if(Player.player.x < -player.playerheight){
            Variables.world = 1;
            Player.player.x = width;
            Refresh.refresh();
        }
    }
}
