package gui;

import animals.Penguin;
import animals.SeaLion;
import animals.Species;
import animals.Walrus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frame extends JFrame {
    //initializing arraylists
    ArrayList<Species> penguins = new ArrayList<>();
    ArrayList<Species> sealions = new ArrayList<>();
    ArrayList<Species> walrus = new ArrayList<>();

    //initializing variables
    private Species tempAnimal;

    //initializing panels for container
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

        //

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



        //ActionListener to get individual animal entries on data page
        JButton addEntryBtn = dataPage.getEntryBtn();
        addEntryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dataPage.getAnimalType() == null) {
                    JOptionPane.showMessageDialog(null, "An animal must be selected to add an entry.");
                } else if (dataPage.gpsArea.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "At least one GPS location must be entered.");
                } else if (!dataPage.getIntValidate()) {
                    JOptionPane.showMessageDialog(null, "[Weight]: Invalid input:\n" +
                            "Enter a whole number greater than 0,");
                } else {
                    if (dataPage.getAnimalType().equals(dataPage.animalOptions[0])) {
                        tempAnimal = new Penguin(dataPage.getAnimalGender(), dataPage.getAnimalWeight(), dataPage.getPenguinBP(), dataPage.getCoordinates());
                    } else if (dataPage.getAnimalType().equals(dataPage.animalOptions[1])) {
                        tempAnimal = new SeaLion(dataPage.getAnimalGender(), dataPage.getAnimalWeight(), dataPage.getSealionSpots(), dataPage.getCoordinates());
                    } else {
                        tempAnimal = new Walrus(dataPage.getAnimalGender(), dataPage.getAnimalWeight(), dataPage.getWalrusDH(), dataPage.getCoordinates());
                    }

                    JOptionPane.showMessageDialog(null,dataPage.getAnimalType()+" saved as new entry.");
                }
            }
        });



        //ActionListener to get new entries on report page
        JButton newEntriesBtn = reportPage.getNewEntryBtn();
        newEntriesBtn.addActionListener(new ActionListener() {
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
