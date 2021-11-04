package Windows;

import Objects.Object;

import javax.swing.*;


public class MainWindow extends JFrame
{
   public MainWindow()
   {
       super("Змейка");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Object Panel = new Object();
       add(Panel);
   }
}

