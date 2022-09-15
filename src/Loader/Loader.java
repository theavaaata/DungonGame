package Loader;

import gfx.Gui;
import gfx.Variables;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Loader {
    /*die einzelnen Grafiken
    1 = grass
    2 = weg
    */
    static ImageIcon[] graphics = new ImageIcon[100];
    //die eingefügten Grapfiken
    static JLabel[][] tiles = new JLabel[16][9];
    /*World design


     */
    static int[][] design1 =   {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,2,1,1,1,1,1,1,2,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,2,2,2,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};

    public static void load(){
        graphics[1] = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("grass.png")));
        graphics[1].setImage(graphics[1].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));

        graphics[2] = new ImageIcon(Objects.requireNonNull(Gui.class.getResource("weg.png")));
        graphics[2].setImage(graphics[2].getImage().getScaledInstance(Variables.size,Variables.size, Image.SCALE_DEFAULT));


        loader();
    }
    public static void loader(){
        switch (Variables.world){
            case 1:
                for(int x = 0; x<16; x++){
                    for(int y = 0; y<9; y++){
                        if(design1[y][x] == 1){
                            tiles[y][x] = new JLabel(graphics[1]);
                        }
                        if(design1[y][x] == 2){
                            tiles[y][x] = new JLabel(graphics[2]);
                        }
                    }

                }
                break;
        }

    }
    public static void position(){
        for(int x = 0; x<16; x++){
            for(int y = 0; y<9; y++){
                tiles[y][x].setBounds(Variables.size*x,Variables.size*y,Variables.size,Variables.size);
                Variables.window.add(tiles[y][x]);
            }
        }
    }
}
