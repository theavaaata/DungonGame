package Player;

import GFX.Variables;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

import static GFX.Variables.size;
import static Loader.Worlds.World;
import static Player.Refresh.up;

public class player {
    static int playerwidth = size;
    static int playerheight = size;
    static int speed = 10;
    public static int[][] border = new int[4][3];
    public static int x = Variables.width / 2 - size / 2;
    public static int y = Variables.height / 2 - size / 2;

    public static ImageIcon[] Player = new ImageIcon[10];
    public static JLabel player1 = new JLabel();
    public static void main(){
        Player[1] = new ImageIcon(Objects.requireNonNull(player.class.getResource("PLayer.png")));
        Player[1].setImage(Player[1].getImage().getScaledInstance(playerwidth, playerheight, Image.SCALE_DEFAULT));
        Player[2] = new ImageIcon(Objects.requireNonNull(player.class.getResource("player2.png")));
        Player[2].setImage(Player[1].getImage().getScaledInstance(playerwidth, playerheight, Image.SCALE_DEFAULT));


        player1 = new JLabel(Player[1]);
        player1.setBounds(x,y, playerwidth, playerheight);
        GFX.Variables.window.add(player1);
        Refresh.move();
    }
    public static void collision(){
        if(((border[0][0] >= x)||(border[0][0] + border[0][1] <= x + playerwidth))&&(border[0][2] >= y)){
            y+= speed;
        }
        if(((border[1][0] >= x)||(border[1][0] + border[1][1] <= x + playerwidth))&&(border[1][2] <= y + playerheight)){
            y-= speed;
        }
        if(((border[2][0] >= y)||(border[2][0] + border[2][1] <= y + playerheight))&&(border[2][2] >= x)){
            x+= speed;
        }
        if(((border[3][0] >= y)||(border[3][0] + border[3][1] <= y + playerheight))&&(border[3][2] <= x + playerwidth)){
            x-= speed;
        }
    }
}
