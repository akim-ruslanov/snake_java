package model;
//Instead of using nested arrays, position will be used as array elements


public class Position {
    private int posCol;
    private int posRow;
    private Status status;
//    private int status;
    // status = 0 means available cell
    // status = 1 means cell is occupied by a head
    // status = 2 means cell is occupied by a snake body
    // status = 3 means cell is occupied by a berry
    // status = 4 means cell is closed

    public Position(int posRow, int posCol, int status) {
        this.posCol = posCol;
        this.posRow = posRow;
        this.status = new Status(status);
    }

    //EFFECTS: returns the column position
    public int getCol() {
        return this.posCol;
    }

    //EFFECTS: Return the row position
    public int getRow() {
        return this.posRow;
    }

    //EFFECTS: Return status
    public Status getStatus() {
        return this.status;
    }

    @Override
    public int hashCode() {
        int row = posRow;
        int col = posCol;
        String pos = row + " " + col;
        return pos.hashCode();
    }

    //EFFECTS: Compares positions based on the column and row values
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Position other = (Position) obj;
        return (this.getCol() == other.getCol() && this.getRow() == other.getRow());
    }

//    public String printStatus() {
//        if (this.status == 0) {
//            return "O"; //Open cell
//        }
//        if (this.status == 1) {
//            return "H"; //Occupied by the snake head
//        }
//        if (this.status == 2) {
//            return "S"; //Occupied by the snake body
//        }
//        if (this.status == 3) {
//            return "B"; //Occupied by a berry
//        } else {
//            return "X"; //The cell is closed
//        }
//    }

    //EFFECTS: Changes the x position based on the parameter input
    //MODIFIES: this
//    public void changeX(int x) {
//        this.posCol = x;
//    }
//
//    //EFFECTS: Changes the y position based on the parameter input
//    //MODIFIES: this
//    public void changeY(int y) {
//        this.posRow = y;
//    }

    //EFFECTS: Increases col or row based on the direction
    // URGENT: NEED TO MAKE A FUNCTION FOR POSSIBLE MOVE
    public void move(Direction direction) {
        if (direction.getDirection() == 0) {
            posRow -= 1;
        }
        if (direction.getDirection() == 90) {
            posCol += 1;
        }
        if (direction.getDirection() == 180) {
            posRow += 1;
        }
        if ((direction.getDirection() == 270) || (direction.getDirection() == -90)) {
            posCol -= 1;
        }
    }


//    Status is now a separate class
    // EFFECTS: Changes status
    // MODIFIES: this
    public void setStatus(int status) {
        this.status.setStatus(status);
    }

    // EFFECTS: Tells whether or not the status is available
    public boolean available() {
        return status.getStatusValue() == 0;
    }



}
