package gfx;

import javax.swing.*;

public class Variables {
    public static Draw draw = new Draw();
    static JFrame window;
    public static int world = 1;
    static int width;
    static int height;
    public static void variables(){
        //Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        width = 1080;
        height = 720;
        Gui.gui();
    }
}
