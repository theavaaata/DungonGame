package GFX;


import javax.swing.*;

public class Gui {
    public static void gui() {
        Variables.window = new JFrame("Dungeon");
        Variables.window.setSize(Variables.width, Variables.height);
        Variables.window.setLocationRelativeTo(null);
        Variables.window.requestFocus();
        Variables.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.window.setResizable(false);


        Variables.draw.setBounds(0, 0, Variables.width, Variables.height);
        Variables.draw.setVisible(true);
        Variables.window.add(Variables.draw);
        Variables.window.setLayout(null);
        Variables.window.setVisible(true);
    }
}

