package Welten;

import static GFX.Variables.*;
import static GFX.Variables.size;
import static Loader.Worlds.World;
import static Player.player.border;


public class Welten {
    static int luecke = 0;
    static int lueckenpos = 0;
    public static void zaunluecke(){
        border[0][2] = size / 2;
        for(int x = 15;x != 0;x--){
            if(World[0][x] == 2){
                luecke++;
                lueckenpos = x;
            }
        }
        border[0][0] = lueckenpos * size;
        border[0][1] = luecke * size;
        luecke = 0;
        lueckenpos = 0;
        border[1][2] = height - size;
        for(int x = 15;x != 0;x--){
            if(World[8][x] == 2){
                luecke++;
                lueckenpos = x;
            }
        }
        border[1][0] = lueckenpos * size;
        border[1][1] = luecke * size;
        luecke = 0;
        lueckenpos = 0;
        border[2][2] = size / 2;
        for(int x = 8;x != 0;x--){
            if(World[x][0] == 2){
                luecke++;
                lueckenpos = x;
            }
        }
        border[2][0] = lueckenpos * size;
        border[2][1] = luecke * size;
        luecke = 0;
        lueckenpos = 0;
        border[3][2] = width - size / 2;
        for(int x = 8;x != 0;x--){
            if(World[x][15] == 2){
                luecke++;
                lueckenpos = x;
            }
        }
        border[3][0] = lueckenpos * size;
        border[3][1] = luecke * size;
        luecke = 0;
        lueckenpos = 0;

    }
    public static void welten(){
        zaunluecke();
        switch (world){
            case 1 -> Welt1.main();
            case 2 -> Welt2.main();
        }
    }

}
