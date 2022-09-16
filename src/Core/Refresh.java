package Core;

import GFX.Variables;

import static Loader.Loader.tiles;

public class Refresh {
    public static void refresh(){
        for(int x = 0; x<16; x++){
            for(int y = 0; y<9; y++){
                Variables.window.remove(tiles[y][x]);
            }
        }
        Player.player.player1.setBounds(0,0,Variables.size / 4 * 6,Variables.size / 8 * 4);
        GFX.Variables.window.add(Player.player.player1);
        for (int x = 0; x < 16; x++) {
            for (int y = 0; y < 9; y++) {
                tiles[y][x].setBounds(Variables.size * x, Variables.size * y, Variables.size, Variables.size);
                Variables.window.add(tiles[y][x]);
            }
        }
    }
}
