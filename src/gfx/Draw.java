package gfx;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class Draw extends JLabel {
    @Serial
    private static final long serialVersionUID = 1L;
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(0,0,10,10);

    }
}