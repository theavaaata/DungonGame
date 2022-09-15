package gfx;

import javax.swing.*;

public class Variables {
    //Zeichenklassen
    public static Draw draw = new Draw();
    //Hauptfenster
    public static JFrame window;
    //welcher Weltabschnitt gerade aktiv ist
    public static int world = 1;
    //Fenster breite
    static int width;
    //Fenster Höhe
    static int height;
    //tiles größe
    public static int size;
    public static void variables(){
        //Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        width = 1280;
        height = width / 16 * 9 + 28;
        size = width / 16;
        Gui.gui();
    }
}
