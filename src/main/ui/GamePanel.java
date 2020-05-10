package ui;




import javax.swing.*;

public class GamePanel extends JFrame {
    GamePanel() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Snake game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GamePanel();
                frame.setVisible(true);
            }
        });
    }
}
