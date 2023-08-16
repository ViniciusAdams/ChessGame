package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Pawn extends Piece {
    public Pawn(Board board, int col, int row, boolean isWhite) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.isWhite = isWhite;
        this.name = "Knight";

        this.sprite = sheet.getSubimage(6 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale) .getScaledInstance(sheetScale, sheetScale, BufferedImage.SCALE_SMOOTH);

    }


}

