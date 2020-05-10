package model;

public class Status {
    int status;

    public Status(int status) {
        this.status = status;
    }

    // EFFECTS: Changes status
    // MODIFIES: this
    public void setStatus(int status) {
        this.status = status;
    }

    // EFFECTS: Tells whether or not the status is available
    public boolean available() {
        return status == 0;
    }

//    public String toString() {
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

    public int getStatusValue() {
        return status;
    }

}
