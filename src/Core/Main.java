package Core;

import Loader.Loader;

import java.security.KeyStore;


public class Main {
    
    public static void main(String[] args) {
        Loop.tick();
        gfx.Variables.variables();
        Loader.load();
        Loader.position();
    }
}