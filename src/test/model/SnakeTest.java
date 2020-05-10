package model;
import exceptions.CannibalismException;
import exceptions.OutOfBoundsExcecption;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Board;
import ui.Moving;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class SnakeTest {
    Snake s;
    Moving m;
    @BeforeEach
    void runBefore() {
        s = new Snake();
        m = new Snake();
    }
    @Test
    void AliveTest(){
        assertTrue(s.getAlive());
        s.kill();
        assertFalse(s.getAlive());
    }

    @Test
    //
    void moveStraightHeadStillInBounds() {
        try {
            m.moveStraightHead();
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
            assert(false);
        }
        assertEquals(m.getHeadCol(), 3);
        assertEquals(m.getHeadRow(), 0);
    }
    @Test
    void turnRightMoveStraightStillInBounds(){
        try {
            m.moveRight();
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {

        }
        assertEquals(m.getHeadCol(),2);
        assertEquals(m.getHeadRow(), 1);
    }

    @Test
    void turnLeftMoveStraightOutOfBounds() {
        try {
            assert(false);
            s.moveLeft();

        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
        }

    }

    @Test
    void turnRightRight() {
        try {
            m.moveRight();
            m.moveRight();
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
            assert(false);
        }
        assertEquals(m.getHeadCol(),1);
        assertEquals(m.getHeadRow(),1);
    }

    @Test
    void hitTheOppositeWallOutOfBounds() {
        int tillWall = Board.BOARD_DIMENSION - s.getHeadCol() - 1;
        while (tillWall > 0) {
            try {
                s.moveStraightBody();
            } catch (OutOfBoundsExcecption out) {
                assert(false);
            } catch (CannibalismException e) {
                e.printStackTrace();
            }
            tillWall--; }
        try {
            s.moveStraightHead();
            assert(false);
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
        }
    }

    @Test
    void turnRightHitTheOppositeWalOutOfBounds() {
        try {
            s.moveRight();
        } catch (OutOfBoundsExcecption out) {
            assert(false);
        }
        int tillWall = Board.BOARD_DIMENSION - s.getHeadRow() - 1;
        while (tillWall > 0) {
            try {
                s.moveStraightHead();
            } catch (OutOfBoundsExcecption out) {
                assert(false);
            }
            tillWall--;}
        try {
            s.moveStraightHead();
            assert(false);
        } catch (OutOfBoundsExcecption out) {
        }
    }

    @Test
    void reachTheWallTurnLeftOutOfBouds() {
        int tillWall = Board.BOARD_DIMENSION - s.getHeadCol() - 1;
        while (tillWall > 0) {
            try {
                s.moveStraightHead();
            } catch (OutOfBoundsExcecption out) {
                assert(false);
            }
            tillWall--; }
        try {
            s.moveLeft();
            assert(false);
        } catch (OutOfBoundsExcecption out) {

        }
    }

    @Test
    void turnRightturnLeftNoExceptionsTest() {
        try {
            s.moveRight();
            s.moveLeft();
            s.moveLeft();
            s.moveLeft();
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
            assert(false);
        }
    }





}
