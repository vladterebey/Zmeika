package Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinishWindow extends JFrame
{
  private JLabel Word;
  private JButton AnswerYes;
  private JButton AnswerNo;
  public FinishWindow()
  {
    super("Game Over");
    // Значения переменных
    Word = new JLabel("Вы проиграли. Желаете начать заново?");
    Word.setHorizontalAlignment(SwingConstants.CENTER);
    AnswerYes = new JButton("Да");
    AnswerNo = new JButton("Нет");

    // Функции кнопок(прописать yes)!!!!!!
    AnswerNo.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
        {
          System.exit(0);
      }
    });

    // Создание объекта
    JPanel Panel =new JPanel(new BorderLayout());
    // Присвивания значений переменным
    Panel.add(Word, BorderLayout.NORTH);
    Panel.add(AnswerYes, BorderLayout.WEST);
    Panel.add(AnswerNo, BorderLayout.EAST);

    // Добавление панельки
    add(Panel);
  }
}


