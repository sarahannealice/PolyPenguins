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

        JButton backBtn = reportPage.getBackBtn();
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reportPage.setVisible(false);
                dataPage.setVisible(true);
            }
        });

        //ActionListener to get new entries on report page
        JButton newEntryBtn = reportPage.getNewEntryBtn();
        newEntryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                reportPage.reportLabel.setText("Report: New Animal Entries");

                //**add code to retrieve new entry data
            }
        });

        //ActionListener to get gps log on report page
        JButton gpsLogsBtn = reportPage.getGpsLogsBtn();
        gpsLogsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reportPage.reportLabel.setText("Report: All Logged GPS Positions to Date");

                //**add code to retrieve gps log data
            }
        });


        //-----------------------------------------------------------------//

        //add JPanels
        add(dataPage);
        add(reportPage);
    }
}
