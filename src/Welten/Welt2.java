package Welten;


import Core.Refresh;
import GFX.Variables;

public class Welt2 {
    public static void main(){
        if(Player.player.y >= Variables.height){
            Variables.world = 1;
            Player.player.y = 0;
            Refresh.refresh();
            Welten.zaunluecke();
        }
    }
}
