package gfx;


import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import Loader.Loader;

public class Gui     {
    public static void gui(){
        JLabel j;
        ImageIcon i;
        i = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("Player.png")));
        i.setImage(i.getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        j = new JLabel(i);



        Variables.window = new JFrame("Dungeon");
        Variables.window.setSize(Variables.width, Variables.height);
        Variables.window.setLocationRelativeTo(null);
        Variables.window.requestFocus();
        Variables.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.window.setResizable(false);



        j.setBounds(0,0,Variables.size,Variables.size);


        Variables.draw.setBounds(0,0,Variables.width,Variables.height);
        Variables.draw.setVisible(true);
        Variables.window.add(Variables.draw);
        Variables.window.add(j);
        Variables.window.setLayout(null);
        Variables.window.setVisible(true);
    }
    public static void loader(){
        Loader.loader();
    }
}

