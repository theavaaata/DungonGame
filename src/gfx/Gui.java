package gfx;


import javax.swing.*;
import java.util.Objects;
import Loader.Loader;

public class Gui     {
    public static void gui(){
        JLabel j;
        Icon i;
        i = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("grass.png")));
        j = new JLabel(i);
        j.setBounds(0,0,100,100);


        Variables.window = new JFrame("Dungeon");
        Variables.window.setSize(Variables.width, Variables.height);
        Variables.window.setLocationRelativeTo(null);
        Variables.window.requestFocus();
        Variables.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.window.setResizable(false);






        Variables.draw.setBounds(0,0,Variables.width,Variables.height);
        Variables.draw.setVisible(true);
        Variables.window.add(Variables.draw);
        Variables.window.add(j);
        Variables.window.setVisible(true);
    }
    public static void loader(){
        Loader.loader();
    }
}

