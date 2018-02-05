import javax.swing.*;

public class Game {

    private JFrame win = new JFrame("Action Radish!");
    private Menu menu;

    public Game()
    {
        win.setSize(1000, 750);
        win.setLocationRelativeTo(null);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);

        menu = new Menu(this);

        win.setVisible(true);
    }
}
