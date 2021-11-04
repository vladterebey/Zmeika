package Objects;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static Main.Constants.*;
import static Main.Main.*;

public class Object extends JPanel
{
    private Image Zone;
    private Image Zmeika;
    private Image Berry;
    public int RX1;
    public int RY1;
    public int RX2;
    public int RY2;
    public int RX3;
    public int RY3;
    public Object()
    {
        try
        {
            Zone = ImageIO.read(new File("src\\Materials\\Border.jpg"));
            Zmeika = ImageIO.read(new File("src\\Materials\\Zmeika.png"));
            Berry = ImageIO.read(new File("src\\Materials\\Berry.png"));
        }
        catch (IOException exception)
        {}
    }
    public void paint(Graphics a)
    {
        super.paintComponent(a);
        a.drawImage(Zone,18*n,2*n,32*n,32*n,null);
        a.drawImage(Zmeika,PlZmX*n,PlZmY*n,1*n,1*n,null);
        int minX = 20 ;
        int maxX = 47;
        int minY = 4;
        int maxY = 31;
        if (Berry1)
        {
            RX1 = rndX(minX,maxX);
            RY1 = rndY(minY,maxY);
        }
        a.drawImage(Berry,RX1*n,RY1*n,1*n,1*n,null);
        if (Berry2)
        {
            RX2 = rndX(minX,maxX);
            RY2 = rndY(minY,maxY);
        }
        a.drawImage(Berry,RX2*n,RY2*n,1*n,1*n,null);
        if (Berry3)
        {
            RX3 = rndX(minX,maxX);
            RY3 = rndY(minY,maxY);
        }
        a.drawImage(Berry,RX3*n,RY3*n,1*n,1*n,null);

    }
    // Рандомайзеры
    public static int rndX(int minX, int maxX)
    {
        maxX -= minX;
        return (int) (Math.random() * ++maxX) + minX;
    }
    public static int rndY(int minY, int maxY)
    {
        maxY -= minY;
        return (int) (Math.random() * ++maxY) + minY;
    }
}
