package pieces;
import main.Board;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
//importing
public class Piece {
    public int col, rows;
    public int xPos, yPos;
//creating method for pieces

    public boolean isWhite;
    public String name;
    public int value;

    BufferedImage sheet;


    {
        try{
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("piece.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    Image sprite;
    Board board;

    public Piece (Board board){




        this.board = board;


    }
    }

