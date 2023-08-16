package pieces;
import main.Board;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
//importing
public class Piece {
    public int col, row;
    public int xPos, yPos;
//creating method for pieces

    public boolean isWhite;
    public String name;
    public int value;




    BufferedImage sheet;

    {
        try {
            // Load the image from the "red" folder inside the "res" folder
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("res/pieces.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int sheetScale = sheet.getWidth()/6;
    Image sprite;
    Board board;

    public Piece (Board board){
        this.board = board;


    }
    public void paint (Graphics2D gd2){
        gd2.drawImage(sprite,xPos,yPos,null);
    }
    }

