package Player;

import GFX.Variables;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class player {
    static ImageIcon[] Player = new ImageIcon[10];
    public static JLabel player1 = new JLabel();
    public static void main(){
        Player[1] = new ImageIcon(Objects.requireNonNull(player.class.getResource("player.png")));
        Player[1].setImage(Player[1].getImage().getScaledInstance(Variables.size / 4 * 6,Variables.size / 8 * 4, Image.SCALE_DEFAULT));


        player1 = new JLabel(Player[1]);
        player1.setBounds(600,500,Variables.size / 4 * 6,Variables.size / 8 * 4);
        GFX.Variables.window.add(player1);
    }
}
