package ui;

//import model.Board;
import model.Position;
import model.Snake;

import java.util.ArrayList;
//the class will be in charge of executing display methods for model classes

public class Display {
    //EFFECTS: displays the array of snake's body position in the form [row, column]
    public void display(Snake snake) {
        int rowCount = snake.getPositionsBody().size();
        for (Position i : snake.getPositionsBody()) {
            System.out.print("[");
            System.out.print(i.getRow());
            System.out.print(",");
            System.out.print(i.getCol());
            System.out.print("]");
        }
    }

    //EFFECTS: Prints out BoardDimnesion x BoardDimension board with "O" representing an open space
    //REQUIRES: board has to be a non an empty array list;

//    public void display(Board board) {
//        int br = 1;
//        for (Position i : board.getBoard()) {
//            if (br % Board.BOARD_DIMENSION == 0) {
//                System.out.println(i.getStatus().printStatus());
//            } else {
//                System.out.print(i.getStatus().printStatus());
//            }
//            br++;
//        }
//    }


//    public void displayOccupiedCells(Board board) {
//        ArrayList<Position> occupiedCells = board.getBoardMap().get(true);
//        for (Position i : occupiedCells) {
//            System.out.println("[" + i.getRow() + "," + i.getCol() + "]");
//        }
//    }
}
