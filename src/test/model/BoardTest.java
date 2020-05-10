package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
//    Board b;
//    @BeforeEach
//    public void runBefore() {
//        b = new Board();
//    }
//
//    @Test
//    public void testConstructorForBoard() {
//        int row = 0;
//        int col = 0;
//        for (Position i : b.getBoard()) {
//            assertTrue(i.equals(new Position(row, col, 0)));
//            if (col < Board.BOARD_DIMENSION - 1) {
//                col++;
//            } else {
//                col = 0;
//                row++;
//            }
//        }
//    }
//
//    @Test
//    void testConstructorForBoardMap() {
//        ArrayList<Position> freeCells = b.getBoardMap().get(false);
//        int row = 0;
//        int col = 0;
//        for (Position i : freeCells) {
//            assertTrue(i.equals(new Position(row, col, 0)));
//            if (col < Board.BOARD_DIMENSION - 1) {
//                col++;
//            } else {
//                col = 0;
//                row++;
//            }
//        }
//        ArrayList<Position> occupiedCells = b.getBoardMap().get(true);
//        assertEquals(occupiedCells.size(), 0);
//    }
//
//
//    @Test
//    void availableCellTestNoException() {
//        Snake snake = new Snake();
//        b.addSnake(snake);
//        assertFalse(b.available(0,0));
//        assertTrue(b.available(0,Board.BOARD_DIMENSION -1));
//    }
//
//    @Test
//    void addSnakeTest() {
//        Snake snake = new Snake();
//        ArrayList<Position> freeCells =  b.getBoardMap().get(false);
//        ArrayList<Position> occupiedCells = b.getBoardMap().get(true);
//        assertEquals(freeCells,b.getBoard());
//        assertEquals(occupiedCells.size(),0);
//        assertTrue(b.available(0,0));
//        b.addSnake(snake);
//        assertFalse(b.available(0,0));
//        assertFalse(b.available(0,1));
//        assertFalse(b.available(0,2));
//        assertFalse(freeCells.contains(snake.getHeadPosition()));
//        assertFalse(freeCells.contains(snake.getPositionsBody().get(0)));
//        assertFalse(freeCells.contains(snake.getPositionsBody().get(1)));
//        assertTrue(occupiedCells.contains(snake.getHeadPosition()));
//        assertTrue(occupiedCells.contains(snake.getPositionsBody().get(0)));
//        assertTrue(occupiedCells.contains(snake.getPositionsBody().get(1)));
//    }
//
//    @Test
//    void addAlwaysSmallSnakeHeadTest() {
//        AlwaysSmallSnake alwaysSmallSnake = new AlwaysSmallSnake();
//        ArrayList<Position> freeCells = b.getBoardMap().get(false);
//        ArrayList<Position> occupiedCells = b.getBoardMap().get(true);
//        assertEquals(freeCells,b.getBoard());
//        assertEquals(occupiedCells.size(), 0);
//        assertTrue(b.available(0,6));
//        b.addSnakeHead(alwaysSmallSnake);
//        assertFalse(b.available(0,6));
//        assertFalse(freeCells.contains(alwaysSmallSnake.getHeadPosition()));
//        assertTrue(occupiedCells.contains(alwaysSmallSnake.getHeadPosition()));
//    }
//
//    @Test
//    public void calculatePositionInArrayTest() {
//        assertEquals(b.calculatePositionInArray(0,0),0);
//        assertEquals(b.calculatePositionInArray(4,4),Board.BOARD_DIMENSION *4 + 4);
//    }
//
//    @Test
//    public void calculatePositionInArrayPositionArgument() {
//        assertEquals(b.calculatePositionInArray(new Position(0,0,0)),0);
//        assertEquals(b.calculatePositionInArray(new Position(4,4,0)),Board.BOARD_DIMENSION *4 + 4);
//    }

}
