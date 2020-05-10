package ui;
import exceptions.CannibalismException;
import model.AlwaysSmallSnake;
//import model.Board;
import model.Snake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class SaveLoadTest {
//    Board b;
//    @BeforeEach
//    public void runBefore() {
//        b = new Board();
//    }
//
//    //Testing saving completely empty board
//    @Test
//    public void saveEmptyBoardTest() throws IOException {
//        b.save();
//        List<String> lines = Files.readAllLines(Paths.get("./data/SaveData.txt"));
//        int i = 0;
//        for (String line : lines) {
//            ArrayList<String> partsOfLine = b.splitOnSpace(line);
//            int posX = Integer.parseInt(partsOfLine.get(0));
//            int posY = Integer.parseInt(partsOfLine.get(1));
//            int stat = Integer.parseInt(partsOfLine.get(2));
//            assertEquals(posX, b.getBoard().get(i).getCol());
//            assertEquals(posY, b.getBoard().get(i).getRow());
//            assertEquals(stat, b.getBoard().get(i).getStatus());
//            i++;
//        }
//    }
//
//    //Testing saving board with a snake
//    @Test
//    public void saveBoardWithSnakeTest() throws IOException {
//        Snake s = new Snake();
//        b.addSnake(s);
//        b.save();
//        List<String> lines = Files.readAllLines(Paths.get("./data/SaveData.txt"));
//        int i = 0;
//        for (String line : lines) {
//            ArrayList<String> partsOfLine = b.splitOnSpace(line);
//            int posX = Integer.parseInt(partsOfLine.get(0));
//            int posY = Integer.parseInt(partsOfLine.get(1));
//            int stat = Integer.parseInt(partsOfLine.get(2));
//            assertEquals(posX, b.getBoard().get(i).getCol());
//            assertEquals(posY, b.getBoard().get(i).getRow());
//            assertEquals(stat, b.getBoard().get(i).getStatus());
//            i++;
//        }
//    }
//
//    //Testing loading an empty board
//    @Test
//    public void loadEmptyBoardTest() throws IOException{
//        Board tempBoard = new Board();
//        b.save();
//        b.load();
//        for (int i = 0; i<b.getBoard().size()-1; i++) {
//            assertEquals(b.getBoard().get(i).getCol(),tempBoard.getBoard().get(i).getCol());
//            assertEquals(b.getBoard().get(i).getRow(),tempBoard.getBoard().get(i).getRow());
//            assertEquals(b.getBoard().get(i).getStatus(),tempBoard.getBoard().get(i).getStatus());
//        }
//    }
//
//    //Testing loading board with snake inside
//    @Test
//    public void loadBoardWithSnakeTest() throws IOException {
//        Board tempBoard = new Board();
//        Snake s = new Snake();
//        tempBoard.addSnake(s);
//        b.addSnake(s);
//        b.save();
//        b.load();
//        for (int i = 0; i<b.getBoard().size()-1; i++) {
//            assertEquals(b.getBoard().get(i).getCol(),tempBoard.getBoard().get(i).getCol());
//            assertEquals(b.getBoard().get(i).getRow(),tempBoard.getBoard().get(i).getRow());
//            assertEquals(b.getBoard().get(i).getStatus(),tempBoard.getBoard().get(i).getStatus());
//        }
//    }

}
