package app;

import javax.swing.*;
import java.awt.*;

public class GUIChatFrame {
    public void launchChatFrame() 
    {
        JFrame frame = new JFrame("Chat Frame");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

                JMenuBar ob = new JMenuBar();
                    JMenu ob1 = new JMenu("FILE");
                        ob.add(ob1);
                            JMenuItem m11 = new JMenuItem("Open");
                            JMenuItem m22 = new JMenuItem("Save as");
                        ob1.add(m11);
                        ob1.add(m22);
                    JMenu ob2 = new JMenu("Help");
                        ob.add(ob2);

                JPanel panel = new JPanel(); // the panel is not visible in output

                    JLabel label = new JLabel("Enter Text");
                    JTextField tf = new JTextField(10); // accepts upto 10 characters
                    JButton send = new JButton("Send");
                    JButton reset = new JButton("Reset");
                    JTextArea ta = new JTextArea();

                panel.add(label); // Components Added using Flow Layout
                panel.add(label); // Components Added using Flow Layout
                panel.add(tf);
                panel.add(ta);
                panel.add(send);
                panel.add(reset);


        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, tf);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
