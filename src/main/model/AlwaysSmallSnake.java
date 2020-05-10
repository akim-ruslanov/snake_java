package model;

public class AlwaysSmallSnake extends DaddySnake {
    Snake ogSnake;

    public AlwaysSmallSnake() {
        super(0,6);
        direction.setDirection(270);
    }


    //MODIFIES: this
    //moves the head of the snake in the direction it is facing
    @Override
    public void moveStraightBody() {
        positionHead.move(direction);
    }


//    public void setOGSnake(Snake snake) {
//        if (!this.ogSnake.equals(snake)) {
//            this.ogSnake = snake;
//            snake.setSmallSnakes(this);
//        }
//    }

//    public Snake getOGSnake() {
//        return ogSnake;
//    }
}
