package model;

import exceptions.OutOfBoundsExcecption;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Board;

import javax.swing.plaf.basic.BasicSplitPaneUI;

import static org.junit.jupiter.api.Assertions.*;

public class DaddySnakeTest {
    DaddySnake ds;
    @BeforeEach
    void runBefore() {
        ds = new AlwaysSmallSnake();
    }

    @Test
        //
    void moveStraightHead() {
        try {
            ds.moveStraightHead();
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
            assert(false);
        }
        assertEquals(ds.getHeadCol(), 5);
        assertEquals(ds.getHeadRow(), 0);
    }
    @Test
    void turnRightMoveStraightOutOfBound(){
        try {
            ds.moveRight();
            assert(false);
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {

        }
    }

    @Test
    void turnLeftMoveStraightStillInBounds() {
        try {
            ds.moveLeft();
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
            assert(false);
        }
        assertEquals(ds.getHeadRow(),1);
        assertEquals(ds.getHeadCol(), 6);
    }

    @Test
    void turnRightRightRightOutOfBounds() {
        try {
            ds.moveRight();
            ds.moveRight();
            ds.moveRight();
            assert(false);
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {

        }
    }

    @Test
    void turnLeftLeftOutOfBounds() {
        try {
            ds.moveLeft();
            ds.moveLeft();
            assert(false);
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {

        }
    }

    @Test
    void hitTheOppositeWallOutOfBounds() {
        int tillWall = ds.getHeadCol();
        while (tillWall > 0) {
            try {
                ds.moveStraightHead();
            } catch (OutOfBoundsExcecption out) {
                assert(false);
            }
            tillWall--; }
        try {
            ds.moveStraightHead();
            assert(false);
        } catch (OutOfBoundsExcecption outOfBoundsExcecption) {
        }
    }

    @Test
    void turnLeftHitTheOppositeWalOutOfBounds() {
        try {
            ds.moveLeft();
        } catch (OutOfBoundsExcecption out) {
            assert(false);
        }
        int tillWall = Board.BOARD_DIMENSION - ds.getHeadRow() - 1;
        while (tillWall > 0) {
            try {
                ds.moveStraightHead();
            } catch (OutOfBoundsExcecption out) {
                assert(false);
            }
            tillWall--;}
        try {
            ds.moveStraightHead();
            assert(false);
        } catch (OutOfBoundsExcecption out) {
        }
    }

    @Test
    void reachTheWallTurnRightOutOfBouds() {
        int tillWall = ds.getHeadCol();
        while (tillWall > 0) {
            try {
                ds.moveStraightHead();
            } catch (OutOfBoundsExcecption out) {
                assert(false);
            }
            tillWall--; }
        try {
            ds.moveRight();
            assert(false);
        } catch (OutOfBoundsExcecption out) {

        }
    }

    @Test
    void getHeadPositionTest() {
        assertEquals(ds.getHeadPosition(),new Position(0,6,1));
        assertFalse(ds.getHeadPosition().equals(new Position(0,5,0)));
        assertTrue(ds.getHeadPosition().equals(ds.getHeadPosition()));
        assertFalse(ds.getHeadPosition().equals(1));
        assertEquals(ds.getHeadPosition().hashCode(), 47174);
    }

    @Test
    void getDirectionTest() {
        assertEquals(ds.getDirection(), "LEFT");
    }

    @Test
    void getHeadPositionStatus() {
        assertEquals(ds.getHeadPosition().getStatus().getStatusValue(), 1);
        assertFalse(ds.getHeadPosition().getStatus().available());
        ds.getHeadPosition().setStatus(0);
        assertEquals(ds.getHeadPosition().getStatus().getStatusValue(), 0);
        assertTrue(ds.getHeadPosition().getStatus().available());
    }

    @Test
    void setDirectionTest() {
        ds.setDirection("RIGHT");
        assertEquals(ds.getDirection(), "RIGHT");
        ds.setDirection("LEFT");
        assertEquals(ds.getDirection(), "LEFT");
        ds.setDirection("DOWN");
        assertEquals(ds.getDirection(), "DOWN");
        ds.setDirection("UP");
        assertEquals(ds.getDirection(), "UP");
    }



}
