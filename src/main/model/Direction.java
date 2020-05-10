package model;

public class Direction {
    int direction;
    // 0 means up
    // 90 means right
    // 180 means down
    // 270 means left
    // anything higher brings back to 0

    public Direction(int direction) {
        this.direction = direction;
    }

    //EFFECTS: Resets the direction to 0 if it exceeds 270
    //MODIFIES: this
    public void checkForReset() {
        if (direction > 270) {
            direction = 0;
        }
    }

//    //EFFECTS: Checks if direction is a multiple of 90; if not, resets it to the closest multiple of 90
//    //MODIFIES: this
//    public void checkDirection() {
//        if ((this.direction % 90) != 0) {
//            int mult = this.direction / 90;
//            this.direction = mult * 90;
//        }
//    }

    //EFFECTS: Turns direction to right by adding 90
    //MODIFIES: this
    public void turnRight() {
        direction += 90;
        this.checkForReset();
    }

    //EFFECTS: Turns direction to left by subtracting 90
    //MODIFIES: this
    public void turnLeft() {
        direction -= 90;
        this.checkForReset();
    }

    //EFFECTS: Changes the direction based on the parameter
    //MODIFIES: this
    public void setDirection(int direction) {
        this.direction = direction;
    }

    //EFFECTS: Returns current direction
    public int getDirection() {
        return direction;
    }

    //EFFECTS: returns the direction in the form of a string
    public String getDirectionString() {
        if (direction == 0) {
            return "UP";
        } else if (direction == 90) {
            return "RIGHT";
        } else if (direction == 180) {
            return "DOWN";
        } else {
            return "LEFT";
        }
    }
}
