import javax.swing.*;
import java.awt.*;

public class Menu extends Rectangle{

    private JFrame win;

    public Menu(JFrame w)
    {
        super(0,0,0,0);
        win = w;
        setSize(win.getSize());
        setBackground(Color.RED);
    }
}
