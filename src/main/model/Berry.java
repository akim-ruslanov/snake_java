package model;

import ui.Board;

import java.util.Random;

//Class that represents berry (food) which snake eats to grow
public class Berry {
    private Position position;

    public Berry() {
        Random random = new Random();
        int row = random.nextInt(Board.BOARD_DIMENSION - 1);
        int col = random.nextInt(Board.BOARD_DIMENSION - 1);
        position = new Position(row, col, 3);
    }

    public int getBerryCol() {
        return position.getCol();
    }

    public int getBerryRow() {
        return position.getRow();
    }


    public Position getPosition() {
        return position;
    }
}
