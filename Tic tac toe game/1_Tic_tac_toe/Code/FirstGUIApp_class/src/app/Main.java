package app;

import java.awt.*;
import javax.swing.*;

public class Main
{
    public static void main(String args[]) 
    {
        /* 1 */
        JFrame a = new JFrame("First GUI App");

        /* 2 */
        JTextField b = new JTextField("edureka");
        b.setBounds(50,20,200,30);

        /* 3 */
        JButton c = new JButton("click me");
        c.setBounds(50,60,200,30);
        
        /* 4 */
        JScrollBar d = new JScrollBar();
        d.setBounds(50,120,40,90);
        
        /* 5 */
        JMenu menu = new JMenu("options");
            JMenuBar m1 = new JMenuBar();
            JMenuItem a1 = new JMenuItem("example");
            JMenuItem a2 = new JMenuItem("example1");
            
            menu.add(a1);
            menu.add(a2);
                m1.add(menu);
        
        /* 6 */
        DefaultListModel<String> l = new DefaultListModel< >();
            l.addElement("first item");
            l.addElement("second item");

        JList<String> e = new JList< >(l);
        e.setBounds(50,300,75,75);
        
        /* 7 */
        JLabel b1 = new JLabel("edureka");
        b1.setBounds(50,400,90,20);
        
        /* 8 */
        String courses[] = { "core java","advance java", "java servlet"};
        
        JComboBox f = new JComboBox(courses);
        f.setBounds(50,500,90,20);

/* ************************************************************************************** */

        /* A */
        GUIChatFrame MyChatFrame = new GUIChatFrame();
        MyChatFrame.launchChatFrame();

        /* B */
        GUICalculator MyGUICalculator = new GUICalculator();
        MyGUICalculator.launchCalculator();

        /* C */
        GUIMenu MyGUIMenu = new GUIMenu();
        MyGUIMenu.launchGUIMenu();

        /* D */
        GUIGame MyGUIGame = new GUIGame();
        MyGUIGame.launchGUIGame();


        a.add(b);
        a.add(c);
        a.add(d);
        a.setJMenuBar(m1);
        a.add(e);
        a.add(b1);
        a.add(f);


        a.setSize(800,800);
        a.setLayout(null);
        a.setVisible(true);
    }
}