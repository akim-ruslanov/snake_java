package model;

import exceptions.CannibalismException;
import exceptions.OutOfBoundsExcecption;
import ui.Moving;

import java.util.ArrayList;

public class Snake extends DaddySnake implements Moving {
    private ArrayList<Position> positionsBody = new ArrayList<>(initialLength); // hold the positions of the body
    private Position tail;

    public Snake() {
        super(0,2);
        for (int i = initialLength - 1; i >= 0; i--) {
            positionsBody.add(new Position(0,i, 2));
        }
    }

    //EFFECTS: Increases the size of snake
    //MODIFIES: SnakeLength
    public void grow() {
        positionsBody.add(tail);
    }




    // EFFECTS: Return the position of snake parts in ArrayList
    ArrayList<Position> getSnakeBodyCoordinates() {
        return positionsBody;
    }

    //EFFECTS: Shows whether or not snake is still alive
    public boolean getAlive() {
        return alive;
    }

    //EFFECTS: Moves snake to the right???
    //MODIFIES: this
//    public void moveRight() throws OutOfBoundsExcecption {
//        direction.turnRight();
//        moveStraightBody();
//    }
//
//    //EFFECTS: Moves snake to the left???
//    //MODIFIES: this
//    public void moveLeft() throws OutOfBoundsExcecption {
//        direction.turnLeft();
//        moveStraightBody();
//    }

    //EFFECTS: Move the head by replacing the leading parts with the lagging parts
    //MODIFIES: this
    @Override
    public void moveStraightBody() throws OutOfBoundsExcecption, CannibalismException {
        Position newBody = new Position(positionHead.getRow(),positionHead.getCol(),2);
        positionsBody.add(0,newBody);
        Position oldTailPosition = positionsBody.remove(positionsBody.size() - 1);
        int tailRow = oldTailPosition.getRow();
        int tailCol = oldTailPosition.getCol();
        tail = new Position(tailRow, tailCol, 2);
        moveStraightHead();
        for (Position i : positionsBody) {
            if (positionHead.equals(i)) {
                throw new CannibalismException();
            }
        }
    }

    public void kill() {
        alive = false;
    }

//    public Position getHeadCoordinates() {
//        return positionHead;
//    }

    public int getHeadCol() {
        return positionHead.getCol();
    }

    public int getHeadRow() {
        return positionHead.getRow();
    }


    public ArrayList<Position> getPositionsBody() {
        return positionsBody;
    }





}
