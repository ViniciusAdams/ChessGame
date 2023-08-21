package main;

import pieces.Piece;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Input extends MouseAdapter {
Board board;

public Input (Board board){
    this.board = board;
}

    @Override
    public void mousePressed(MouseEvent e) {
        int col = e.getX() / board.tileSize;
        int row = e.getX() / board.tileSize;

        Piece pieceXY = board.getPiece(col, row);
        if (pieceXY != null) {
            board.selectedPiece = pieceXY;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    if (board.selectedPiece != null){
        board.selectedPiece.xPos = e.getX() - board.tileSize /2;
        board.selectedPiece.xPos = e.getY() - board.tileSize /2;

        board.repaint();
    }



    }


    @Override
    public void mouseDragged(MouseEvent e) {
    int col = e.getX() / board.tileSize;
    int row = e.getY() / board.tileSize;
    }

}
