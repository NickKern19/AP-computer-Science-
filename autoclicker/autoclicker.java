package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class autoclicker extends JFrame implements ActionListener {

public static boolean isClicking = false;

public void actionPerformed(ActionEvent e) {}

public void createFrame() { initComponents(); }

public void initComponents() {

    JFrame frame = new JFrame("AutoClicker");
    JPanel panel = new JPanel(true);
    JButton button = new JButton("OKAY");
    JLabel label = new JLabel();

    frame.setVisible(true);
    frame.setSize(350, 68);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.add(panel);

    button.addActionListener(new Action() {

        @Override
        public Object getValue(String s) {
            return null;
        }

        @Override
        public void putValue(String s, Object o) {}

        @Override
        public void setEnabled(boolean b) {}

        @Override
        public boolean isEnabled() {
            return false;
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {}

        @Override
        public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {}

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            if(isClicking){isClicking = false; return;}
            if(!isClicking){isClicking = true; return;}
        }
    });

    label.setFont(new Font("arial", 1, 16));
    label.setText("Click 'OKAY' to start.");
    label.setBorder(BorderFactory.createLineBorder(Color.black));

    panel.add(label);
    panel.setBorder(new LineBorder(Color.BLACK));
    panel.add(button);

}

public static void main(String[] args) throws java.awt.AWTException, java.lang.InterruptedException {
    clickForever clickForever = new clickForever();
    Robot rbt = new Robot();

    clickForever.createFrame();

    while(true){
        if(isClicking) rbt.mousePress(InputEvent.BUTTON1_MASK);
        if(!isClicking);
    }
  }
}