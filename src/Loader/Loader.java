package Loader;

import GFX.Gui;
import GFX.Variables;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

import static GFX.Variables.window;

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

    static int[][] world1 =   {{1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    static int[][] world2 =   {{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};

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


        fence();
        loader();
    }
    public static void fence(){
        for(int x = 1;x < 15;x++){
            zaun[x] = new JLabel(graphics[10]);
            zaun[x + 16] = new JLabel(graphics[10]);
            zaun[x].setBounds(Variables.size * x, -Variables.size / 2, Variables.size, Variables.size);
            zaun[x + 16].setBounds(Variables.size * x, Variables.height - Variables.size - Variables.size / 4, Variables.size, Variables.size);
            window.add(zaun[x]);
            window.add(zaun[x + 16]);
        }
        for(int x = 1;x < 8;x++){
            zaun[x + 32] = new JLabel(graphics[13]);
            zaun[x + 39] = new JLabel(graphics[16]);
            zaun[x + 32].setBounds( -Variables.size / 2,Variables.size * x, Variables.size, Variables.size);
            zaun[x + 39].setBounds(Variables.width - Variables.size + Variables.size / 16 * 7,Variables.size * x, Variables.size, Variables.size);
            window.add(zaun[x + 32]);
            window.add(zaun[x + 39]);
        }
    }
    public static void loader(){
        System.out.println(Variables.world);
        switch (Variables.world){
            case 1:
                for(int x = 0; x<16; x++){
                    for(int y = 0; y<9; y++){
                        if(world1[y][x] == 1){
                            tiles[y][x] = new JLabel(graphics[1]);
                        }
                        if(world1[y][x] == 2){{}
                            tiles[y][x] = new JLabel(graphics[2]);
                        }
                        if(world1[y][x] == 10){
                            tiles[y][x] = new JLabel(graphics[10]);
                        }
                    }

                }
                break;
            case 2:
                for(int x = 0; x<16; x++){
                    for(int y = 0; y<9; y++){
                        if(world2[y][x] == 1){
                            tiles[y][x] = new JLabel(graphics[1]);
                        }
                        if(world2[y][x] == 2){
                            tiles[y][x] = new JLabel(graphics[2]);
                        }
                    }

                }
                System.out.println("geht");
                break;
        }
        position();

    }
    public static void position() {
        for (int x = 0; x < 16; x++) {
            for (int y = 0; y < 9; y++) {
                tiles[y][x].setBounds(Variables.size * x, Variables.size * y, Variables.size, Variables.size);
                window.add(tiles[y][x]);
            }
        }
        System.out.println("gsdfdsf");
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
