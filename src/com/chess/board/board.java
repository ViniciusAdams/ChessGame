package com.chess.board;

import com.chess.square.SquareColor;

public class board {
Square [][] boardSquares =  new Square [8] [8];
public Board (){
    for (int i =0; i< boardSquares.length;i++){
        int column = 0;
        //8:21 OF THE FIRST VIDEO
         SquareColor currentColor = (i % 2 == 0) ? SquareColor.LIGHT : SquareColor.DARK ;
   for (File file : File.values()){
     Square newSquare = new Square (currentColor,n)
   }
    }
}
}
