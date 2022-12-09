package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    public DataEntry dataPage;
    private Report reportPage;

    public Frame() {
        //JFrame properties
        setTitle("Antarctic Animal Tracking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 300);
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
        JButton reportBtn = dataPage.getReportBtn();
        reportBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPage.setVisible(false);
                reportPage.setVisible(true);
            }
        });

        //-----------------------------------------------------------------//

        //add JPanels
        add(dataPage);
        add(reportPage);
    }
}
