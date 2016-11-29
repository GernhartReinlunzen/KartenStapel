package View;

import Control.MainController;

import Model.Card;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jens on 28.11.2016.
 */
public class MainView {
    private JTextArea FlippedStack;
    private JTextArea BackUpStack;
    private JButton FlipCard;
    private JPanel panel;
    private MainController controller;


    public MainView() {
        JFrame frame = new JFrame("Quizz");
        frame.setContentPane(panel);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        controller = new MainController();

        //FlippedStack.setText(controller.shuffle());
        FlipCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flipCard();
            }
        });
        BackUpStack.setText("\uF0A0");
    }

    public void flipCard() {
        if(controller.naziLehr()){
            Card card = controller.flipCard();
            FlippedStack.setText(card.getFront());
        } else{
            controller.stapelUmdrehen();
            FlippedStack.setText("Stapel Umgedreht");
        }
    }
}
