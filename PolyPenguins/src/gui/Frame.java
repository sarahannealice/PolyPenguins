package gui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private DataEntry dataPage;
    private Report reportPage;

    public Frame() {
        //JFrame properties
        setTitle("Antarctic Animal Tracking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 300);
        setLocationRelativeTo(null);
        setLayout(new CardLayout());
        setVisible(true);
        setResizable(false);

        //-----------------------------------------------------------------//

        //defining JPanels to go in container
        dataPage = new DataEntry();
        reportPage = new Report();

        //-----------------------------------------------------------------//

        //ActionListeners to switch panels

        //-----------------------------------------------------------------//

        //add JPanels
        add(dataPage);
        add(reportPage);
    }
}
