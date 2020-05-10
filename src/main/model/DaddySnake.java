package model;

import exceptions.CannibalismException;
import exceptions.OutOfBoundsExcecption;
import ui.Board;
import ui.Moving;

public abstract class DaddySnake implements Moving {
    protected int initialLength = 2;
    protected Position positionHead;
    protected boolean alive;
    protected Direction direction;

    public DaddySnake(int headPosRow, int headPosCol) {
        alive = true;
        direction = new Direction(90);
        positionHead = new Position(headPosRow,headPosCol,1);
    }


    public int getHeadCol() {
        return positionHead.getCol();
    }

    public int getHeadRow() {
        return positionHead.getRow();
    }




    //EFFECTS: Changes the direction of the snake to the left. Then moves the snake to the left. If
    //          the snake is out of bounds of the board, throw an OutOfBoundsException
    //MODIFIES: this
    public void moveLeft() throws OutOfBoundsExcecption {
        direction.turnLeft();
        try {
            moveStraightHead();
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
            throw new OutOfBoundsExcecption();
        }
    }

    //EFFECTS: Changes the direction of the snake ot the right . Then moves the snake to the right. If
    //         the snake is out of bounds of the board, throw an OutOfBoundsException
    //MODIFIES: this
    public void moveRight() throws OutOfBoundsExcecption {
        direction.turnRight();
        try {
            moveStraightHead();
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
            throw new OutOfBoundsExcecption();
        }
    }

    //MODIFIES: this
    //EFFECTS: Moves the head of the snake in the direction it is facing. If
    //          the snake is out of bounds of the board, throw an OutOfBoundsException
    public void moveStraightHead() throws OutOfBoundsExcecption {
        positionHead.move(direction);
        if (positionHead.getRow() < 0 || positionHead.getCol() < 0
                || positionHead.getCol() >= Board.BOARD_DIMENSION || positionHead.getRow() >= Board.BOARD_DIMENSION) {
            throw new OutOfBoundsExcecption();
        }
    }

    //MODIFIES: this
    //EFFECTS: set the direction of the snake based on the direction string
    public void setDirection(String direction) {
        if (direction.equals("RIGHT")) {
            this.direction.setDirection(90);
        } else if (direction.equals("LEFT")) {
            this.direction.setDirection(270);
        } else if (direction.equals("UP")) {
            this.direction.setDirection(0);
        } else if (direction.equals("DOWN")) {
            this.direction.setDirection(180);
        }
    }

    public String getDirection() {
        return direction.getDirectionString();
    }




    public Position getHeadPosition() {
        return positionHead;
    }



}
