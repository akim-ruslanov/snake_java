//package model;
//
//import ui.Loadable;
//import ui.Saveable;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.UnsupportedEncodingException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//
//public class Board implements Saveable, Loadable {
//    private static final String open = "O";
//    private final String closed = "X";
//    private final int defaultResolution = 32 * 32;
//    public static int BOARD_DIMENSION = 25;
//    private ArrayList<Position> board = new ArrayList<>(0); //holds coordinate values for the whole board
//    HashMap<Boolean, ArrayList<Position>> boardMap = new HashMap<>();
//
//    public Board() {
//        ArrayList<Position> freeBoardPosition = new ArrayList<>(); //Added for the hashmap
//        for (int row = 0; row < BOARD_DIMENSION; row++) {
//            for (int col = 0; col < BOARD_DIMENSION; col++) {
//                board.add(new Position(row, col, 0));
//                freeBoardPosition.add(new Position(row, col, 0));
//            }
//        }
//        boardMap.put(false, freeBoardPosition);
//        boardMap.put(true, new ArrayList<Position>());
//    }
//
//    //EFFECTS: Calculates position in the list based on the x and y
//    public int calculatePositionInArray(int row, int col) {
//        return (row * BOARD_DIMENSION + col);
//    }
//
//    public int calculatePositionInArray(Position pos) {
//        return (pos.getRow() * BOARD_DIMENSION + pos.getCol());
//    }
//
//    //EFFECTS: tells whether or not the cell is open
//    //REQUIRES: The cell coordinates have to be within the dimension of the array list
//    public boolean available(int row, int col) {
//        return board.get(calculatePositionInArray(row,col)).available();
//    }
//
//    // EFFECTS: Adds snake symbols to the board
//    // MODIFIES: modifies this
//    // REQUIRES: board has to be a non-empty array list
//    public void addSnake(Snake snake) {
//        addSnakeHead(snake);
//        addSnakeBody(snake);
//    }
//
//    //EFFECTS: adds snake to the board array list; moves the position from the free bucket in hash
//    // map to the occupied bucket
//    //MODIFIES: this
//    public void addSnakeHead(DaddySnake snake) {
////        int headPosInBoard = calculatePositionInArray(snake.getHeadPosition());
////        board.get(headPosInBoard).setStatus(snake.getHeadPosition().getStatus()); //sets status to head position
//        setPositionStatus(snake.getHeadPosition(), snake.getHeadPosition().getStatus().getStatusValue());
//        ArrayList<Position> freeCell = boardMap.get(false); //!!! new method for removing free cells
//        freeCell.remove(snake.getHeadPosition());
//        ArrayList<Position> occupiedCell = boardMap.get(true);
//        occupiedCell.add(snake.getHeadPosition());
//
//    }
//
//    public void addSnakeBody(Snake snake) {
//        ArrayList<Position> freeCells = boardMap.get(false);
//        ArrayList<Position> occupiedCells = boardMap.get(true);
//        for (Position i : snake.getPositionsBody()) {
//            freeCells.remove(i);
//            setPositionStatus(i, i.getStatus().getStatusValue());
//            occupiedCells.add(i); //should i check when adding?
//        }
//    }
//
//
//
//
//    public void save() throws FileNotFoundException, UnsupportedEncodingException {
//        PrintWriter boardSave = new PrintWriter("./data/SaveData.txt","UTF-8");
//        for (Position i: board) {
//            boardSave.print(i.getCol());
//            boardSave.print(" ");
//            boardSave.print(i.getRow());
//            boardSave.print(" ");
//            boardSave.println(i.getStatus());
//        }
//        boardSave.close(); //note -- if you miss this, the file will not be written at all.
//    }
//
//    public void load() throws IOException {
//        List<String> lines = Files.readAllLines(Paths.get("./data/SaveData.txt"));
//        for (String line : lines) {
//            ArrayList<String> partsOfLine = splitOnSpace(line);
//            int posX = Integer.parseInt(partsOfLine.get(0));
//            int posY = Integer.parseInt(partsOfLine.get(1));
//            int stat = Integer.parseInt(partsOfLine.get(2));
//            board.get(calculatePositionInArray(posY,posX)).setStatus(stat);
//        }
//    }
//
//    public ArrayList<String> splitOnSpace(String str) {
//        String[] splits = str.split(" ");
//        return new ArrayList<>(Arrays.asList(splits));
//    }
//
//    public ArrayList<Position> getBoard() {
//        return board;
//    }
//
//    private void setPositionStatus(Position objPosition, int objStatus) {
//        for (Position i : board) {
//            if (i.equals(objPosition)) {
//                i.setStatus(objStatus);
//                break;
//            }
//        }
//    }
//
//    public HashMap<Boolean, ArrayList<Position>> getBoardMap() {
//        return boardMap;
//    }
//}
//
//
