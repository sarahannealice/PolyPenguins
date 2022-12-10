package gui;

import javax.swing.*;
import java.awt.*;

public class Report extends JPanel {
    public JLabel reportLabel;
    private JTextArea reportArea;
    private JScrollPane scrollPane;
    private JButton newEntryBtn;
    private JButton gpsLogsBtn;
    private JButton backBtn;

    //functions
    public JButton getNewEntryBtn() { return newEntryBtn; }
    public JButton getGpsLogsBtn() { return gpsLogsBtn; }
    public JButton getBackBtn() { return backBtn; }

    public Report() {
        //Fonts
        Font fontTitle = new Font("Consolas",Font.BOLD,14);
        Font fontText = new Font("Consolas",Font.PLAIN,14);

        //JPanel properties
        setLayout(null);
        setBounds(0, 0, 750, 300);
        setBackground(Color.pink);
        setVisible(false);

        //JLabels
        reportLabel = new JLabel("Report:");
        reportLabel.setBounds(20,10,400,20);
        reportLabel.setForeground(Color.darkGray);
        reportLabel.setFont(fontTitle);
        add(reportLabel);

        //JTextArea
        reportArea = new JTextArea();
        reportArea.setBounds(20,30,690,180);
        reportArea.setForeground(Color.darkGray);
        reportArea.setFont(fontText);
        reportArea.setEditable(false);
        add(reportArea);

        //JScrollPane
        scrollPane = new JScrollPane(reportArea);
        scrollPane.setBounds(20,30,690,180);
        scrollPane.setAutoscrolls(false);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        //JButtons
        newEntryBtn = new JButton("Show New Entries");
        newEntryBtn.setBounds(110,225,165,25);
        newEntryBtn.setForeground(Color.darkGray);
        newEntryBtn.setFont(fontTitle);
        add(newEntryBtn);

        gpsLogsBtn = new JButton("Show GPS Logs");
        gpsLogsBtn.setBounds(285,225,165,25);
        gpsLogsBtn.setForeground(Color.darkGray);
        gpsLogsBtn.setFont(fontTitle);
        add(gpsLogsBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(460,225,165,25);
        backBtn.setForeground(Color.darkGray);
        backBtn.setFont(fontTitle);
        add(backBtn);

    }

}
