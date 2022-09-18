package Loader;

import GFX.Variables;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

import static GFX.Variables.*;
import static Loader.Worlds.*;

public class Loader {
    /*die einzelnen Grafiken
    1 = grass
    2 = weg
   10 = zaun
   11 = zaun unten links
   12 = zaun oben links
   13 = Zaun Mitte Links
   14 = Zaun unten Rechts
   15 = Zaun oben Rechts
   16 = Zaun Mitte Rechts
    */
    static ImageIcon[] graphics = new ImageIcon[100];
    //die eingefügten Grapfiken
    public static JLabel[][] tiles = new JLabel[9][16];
    /*World design


     */
    static JLabel[] zaun = new JLabel[47];



    public static void load(){
        graphics[1] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("grass.png")));
        graphics[1].setImage(graphics[1].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        graphics[2] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("weg.png")));
        graphics[2].setImage(graphics[2].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));




        graphics[10] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("horizontal.png")));
        graphics[10].setImage(graphics[10].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        graphics[11] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("ul.png")));
        graphics[11].setImage(graphics[11].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        graphics[12] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("ol.png")));
        graphics[12].setImage(graphics[12].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        graphics[13] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("vertikalL.png")));
        graphics[13].setImage(graphics[13].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        graphics[14] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("ur.png")));
        graphics[14].setImage(graphics[14].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        graphics[15] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("or.png")));
        graphics[15].setImage(graphics[15].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        graphics[16] = new ImageIcon(Objects.requireNonNull(Loader.class.getResource("vertikalR.png")));
        graphics[16].setImage(graphics[16].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));



        zaun[0] = new JLabel(graphics[12]);
        zaun[1] = new JLabel(graphics[15]);
        zaun[2] = new JLabel(graphics[11]);
        zaun[3] = new JLabel(graphics[14]);

        zaun[0].setBounds(0,-2,Variables.size,Variables.size);
        zaun[1].setBounds(width - Variables.size,0,Variables.size - 2,Variables.size);
        zaun[2].setBounds(0,height - Variables.size - Variables.size / 4 - 8,Variables.size,Variables.size);
        zaun[3].setBounds(width -Variables.size,height - Variables.size - Variables.size / 4 - 8,Variables.size,Variables.size);

        window.add(zaun[0]);
        window.add(zaun[1]);
        window.add(zaun[2]);
        window.add(zaun[3]);


        Worlds.w1();
        fence();
        position();
    }
    public static void fence(){
        for(int x = 0;x < 12;x++){
            zaun[x + 4].setBounds(size * zaunh[0][x],size * zaunh[1][x] - size / 2,size,size);
            window.add(zaun[x + 4]);
        }
        for(int x = 12;x < 26;x++){
            zaun[x + 4].setBounds(size * zaunh[0][x],size * zaunh[1][x],size,size);
            window.add(zaun[x + 4]);
        }
        for(int x = 0;x < 5;x++){
            zaun[x + 30].setBounds(size * zaunl[0][x] - 6,size * zaunl[1][x],size,size);
            window.add(zaun[x + 30]);
        }
        for(int x = 0;x < 5;x++){
            zaun[x + 35].setBounds(size * zaunr[0][x],size * zaunr[1][x],size,size);
            window.add(zaun[x + 35]);
        }
    }

    public static void position() {
        for (int x = 0; x < 16; x++) {
            for (int y = 0; y < 9; y++) {
                tiles[y][x].setBounds(Variables.size * x, Variables.size * y, Variables.size, Variables.size);
                window.add(tiles[y][x]);
            }
        }

        window.repaint();
    }
    public static void clear(){
        for(int x = 0; x<16; x++){
            for(int y = 0; y<9; y++){
                window.remove(tiles[y][x]);
            }
        }
    }
}
