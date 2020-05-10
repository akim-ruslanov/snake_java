package ui;

import exceptions.CannibalismException;
import exceptions.OutOfBoundsExcecption;
import model.Berry;
import model.Snake;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Board extends JPanel implements ActionListener {

    //Size to represent
    public static final int PIXEL_SIZE = 25;

    //Holds height and width of the window
    public static final int BOARD_DIMENSION = 25;
    private static final int BOARD_WIDTH = BOARD_DIMENSION * PIXEL_SIZE;
    private static final int BOARD_HEIGHT = BOARD_DIMENSION * PIXEL_SIZE;

    //represents total pixel size
    private static final int TOTAL_PIXEL_SIZE = (BOARD_WIDTH * BOARD_HEIGHT) / (PIXEL_SIZE * PIXEL_SIZE);

    //to see if the game is still running
    private boolean inGame = true;

    //timer
    private Timer timer;
    private static int speed = 90;

    //here go the instances of snake and food
    Snake snake = new Snake();
    Berry berry = new Berry();
    private int points;
    JLabel scorePanel;
    private Image backgroundImage;

    public Board() {
        addKeyListener(new Keys());
        setBackground(Color.BLACK);
        setFocusable(true);
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));

        scorePanel = new JLabel("SCORE:" + points);
        initializeGame();
    }


    //used to paint our component to the screen
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    private void draw(Graphics g) {
        scorePanel.setText("SCORE:" + points);
        add(scorePanel);
        if (inGame == true) {
            //drawing green berry
            g.setColor(Color.green);
            g.fillRect(berry.getBerryCol() * PIXEL_SIZE,  berry.getBerryRow() * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            //drawing snake head first and then body
//            try {
//                BufferedImage headImage = ImageIO.read(new File("./data/headSmall.png"));
//                Image headImageScaledInstance = headImage.getScaledInstance(PIXEL_SIZE  * 5,
//                        PIXEL_SIZE * 5, Image.SCALE_DEFAULT);
//                g.drawImage(headImageScaledInstance, snake.getHeadCol() * PIXEL_SIZE, snake.getHeadRow() * PIXEL_SIZE, null);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            g.setColor(Color.red);
            g.fillRect(snake.getHeadCol() * PIXEL_SIZE, snake.getHeadRow() * PIXEL_SIZE,PIXEL_SIZE, PIXEL_SIZE);
            for (int i = 0; i < snake.getPositionsBody().size(); i++) {
                g.fillRect(PIXEL_SIZE * snake.getPositionsBody().get(i).getCol(),
                        PIXEL_SIZE * snake.getPositionsBody().get(i).getRow(),
                        PIXEL_SIZE, PIXEL_SIZE);
            }

            Toolkit.getDefaultToolkit().sync();
        } else {
            endGame(g);
        }
    }

    private void endGame(Graphics g) {
        String message = "Game over.\n Your points are " + points;
        try {
            backgroundImage = ImageIO.read(new File("./data/pepe.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(backgroundImage, 0, 0, this);
        Font font = new Font("Times New Roman", Font.BOLD, 30);
        FontMetrics metrics = getFontMetrics(font);
        g.setColor(Color.RED);
        g.setFont(font);
        g.drawString(message, (BOARD_WIDTH - metrics.stringWidth(message)) / 2,
                BOARD_HEIGHT / 2);
        System.out.println("game ended");
    }

    private void initializeGame() {
        timer = new Timer(speed, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            snake.moveStraightBody();
        } catch (OutOfBoundsExcecption | CannibalismException outOfBoundsExcecption) {
            inGame = false;
        }
        checkForFoodCollisions();
        repaint();
    }

    private void checkForFoodCollisions() {
        if (snake.getHeadPosition().equals(berry.getPosition())) {
            points++;
            snake.grow();
            berry = new Berry();
            scorePanel.setText("SCORE:" + points);
        }
    }

    private class Keys extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_RIGHT && (!(snake.getDirection().equals("LEFT")))) {
                snake.setDirection("RIGHT");
            }
            if (key == KeyEvent.VK_LEFT && (!(snake.getDirection().equals("RIGHT")))) {
                snake.setDirection("LEFT");
            }
            if (key == KeyEvent.VK_UP && (!(snake.getDirection().equals("DOWN")))) {
                snake.setDirection("UP");
            }
            if (key == KeyEvent.VK_DOWN && (!(snake.getDirection().equals("UP")))) {
                snake.setDirection("DOWN");
            }
            if (key == KeyEvent.VK_ENTER && (!inGame)) {
                inGame = true;
                snake = new Snake();
                berry = new Berry();
            }
        }
    }
}
