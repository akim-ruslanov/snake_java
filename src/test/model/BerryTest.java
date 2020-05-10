package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Board;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BerryTest {
    Berry berry;
    @BeforeEach
    void RunBefore() {
        berry = new Berry();
    }

    @Test
    void testConstructor() {
        for (int i = 0; i < 99 ; i++) {
            berry = new Berry();
            assertTrue(berry.getBerryCol() < Board.BOARD_DIMENSION);
            assertTrue(berry.getBerryRow() < Board.BOARD_DIMENSION);
        }
    }
}
