package ui;

import exceptions.CannibalismException;
import exceptions.OutOfBoundsExcecption;

public interface Moving {
    //EFFECTS: Move the whole head of the snake by one point in the direction facing
    void moveStraightHead() throws OutOfBoundsExcecption;

    //EFFECTS: Move the body by moving the lagging parts to the leading parts
    void moveStraightBody() throws OutOfBoundsExcecption, CannibalismException;

    //EFFECTS: Turn the head of the snake by 90 deg

    void moveRight() throws OutOfBoundsExcecption;

    void moveLeft() throws OutOfBoundsExcecption;

    int getHeadCol();

    int getHeadRow();
}
