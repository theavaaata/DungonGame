package Loader;

import GFX.Gui;
import GFX.Variables;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

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
    static int[][] world1 =   {{1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,10,10,10,1,1,1,1,1,1,1}};
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



        loader();
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
                Variables.window.add(tiles[y][x]);
            }
        }
        System.out.println("gsdfdsf");
    }
    public static void clear(){
        for(int x = 0; x<16; x++){
            for(int y = 0; y<9; y++){
                Variables.window.remove(tiles[y][x]);
            }
        }
    }
}
