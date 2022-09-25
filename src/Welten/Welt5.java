package Welten;

import Core.Refresh;
import GFX.Variables;
import Player.player;

import static GFX.Variables.height;
import static GFX.Variables.width;

public class Welt5 {
    public static void main(){
        if(Player.player.y < -Player.player.playerheight){
            Variables.world = 2;
            Player.player.y = height;
            Refresh.refresh();
        }
        if(Player.player.x > width){
            Variables.world = 6;
            Player.player.x = 0;
            Refresh.refresh();
        }
        if(Player.player.x < -player.playerheight){
            Variables.world = 4;
            Player.player.x = width;
            Refresh.refresh();
        }
    }
}
