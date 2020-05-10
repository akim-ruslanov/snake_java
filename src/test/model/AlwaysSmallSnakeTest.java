package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlwaysSmallSnakeTest {
    AlwaysSmallSnake smallS;
    @BeforeEach
    void runBefore() {
        smallS = new AlwaysSmallSnake();
    }


    @Test
    void moveStraightBodyTest() {
        smallS.moveStraightBody();
        assertEquals(smallS.getHeadCol(),5);
        assertEquals(smallS.getHeadRow(),0);
    }


}
