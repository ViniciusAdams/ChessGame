package main;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(1000, 1000));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board board = new Board(); // Create an instance of the Board panel
        frame.add(board); // Add the Board panel to the JFrame

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
