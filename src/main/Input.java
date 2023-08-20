package main;

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


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

}
