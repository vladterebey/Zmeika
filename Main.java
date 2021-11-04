package Main;

import Windows.FinishWindow;
import Windows.MainWindow;

import java.awt.*;

import static Main.Constants.StPlZmX;
import static Main.Constants.StPlZmY;

public class Main
{
    public static int PlZmX;
    public static int PlZmY;
    public static void main(String[] args)
    {
        PlZmX = StPlZmX;
        PlZmY = StPlZmY;
        FinishWindow FinWin = new FinishWindow();
        FinWin.pack();
        FinWin.setLocationRelativeTo(null);
        FinWin.setVisible(true);
        MainWindow MainWin = new MainWindow();
        MainWin.setLocationRelativeTo(null);
        MainWin.setVisible(true);
        MainWin.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}
