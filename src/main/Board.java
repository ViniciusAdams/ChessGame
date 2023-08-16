package main;
import pieces.Knight;
import pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {

    public int tileSize = 85;
    int cols = 8;
    int rows = 8;
//defining cols and rows as 8x8 as a chess game
    ArrayList <Piece> pieceList = new ArrayList<>();
    public Board() {
        this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize)); // Corrected the method call
        addPieces();
//setting background to green and applying the dimensions
    }
    public void addPieces (){
        pieceList.add (new Knight(this,1,0,false));
    }
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                g2d.setColor((c + r) % 2 == 0 ? new Color (227,198,181) : new Color (157 ,105,53));
                g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
            }
        for (Piece piece : pieceList){
            piece.paint(g2d);
        }
        }
    }


}




