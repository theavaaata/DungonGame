package Loader;

import javax.swing.*;

import static GFX.Variables.size;
import static GFX.Variables.window;
import static Loader.Loader.*;


public class Worlds {
    static int[][] world1 =   {{1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1},
                                {1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1},
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
    static int[][] zaunh;
    static int[][] zaunl;
    static int[][] zaunr;
    public static void w1(){
        for(int x = 0; x<16; x++){
            for(int y = 0; y<9; y++){
                if(world1[y][x] == 1){
                    tiles[y][x] = new JLabel(graphics[1]);
                }
                if(world1[y][x] == 2){{}
                    tiles[y][x] = new JLabel(graphics[2]);
                }
            }
        }
        for(int x = 0;x < 26;x++){
            zaun[x + 4] = new JLabel(graphics[10]);
        }
        for(int x = 0;x < 5;x++){
            zaun[x + 30] = new JLabel(graphics[13]);
        }
        for(int x = 0;x < 5;x++){
            zaun[x + 35] = new JLabel(graphics[16]);
        }

        zaunh = new int[][]{{1,2,3,4,5,6,9,10,11,12,13,14,1,2,3,4,5,6,7,8,9,10,11,12,13,14},
                            {0,0,0,0,0,0,0,0,0,0,0,0,8,8,8,8,8,8,8,8,8,8,8,8,8,8}};
        zaunl = new int[][]{{0,0,0,0,0},
                            {1,2,3,4,7}};
        zaunr = new int[][]{{15,15,15,15,15},
                            {1,2,3,4,7}};
        position();
    }
    public static void w2(){
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
        //position();
    }
}
