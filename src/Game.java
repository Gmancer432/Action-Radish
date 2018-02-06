import javax.swing.*;

public class Game extends JFrame{

    private Menu menu;

    public Game()
    {
        super("Action Radish!");
        setSize(1000, 750);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        menu = new Menu(this);
        add(menu);

        setVisible(true);
    }
}
