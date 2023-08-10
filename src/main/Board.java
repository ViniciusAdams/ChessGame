package main;
import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public int tileSize = 85;
    int cols = 8;
    int rows = 8;
//defining cols and rows as 8x8 as a chess game
    public Board() {
        this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize)); // Corrected the method call
        this.setBackground(Color.green);
//setting background to green and applying the dimensions
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                g2d.setColor((c + r) % 2 == 0 ? Color.white : Color.black);
                g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
            }
        }
    }


}




