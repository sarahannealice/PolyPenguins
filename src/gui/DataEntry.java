package gui;

import animals.Species;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataEntry extends JPanel {
    //variable initializations
    String[] animalOptions = {"Penguin","Sea Lion","Walrus"};//use getClass() for individual names
    String[] genderOptions = {"Female","Male"};
    String[] dhOptions = {"Good","Average","Poor"};
    String animalType;

    //label initializations
    private JLabel animalObsLabel;
    private JLabel animalLabel;
    private JLabel genderLabel;
    private JLabel weightLabel;
    private JLabel bpLabel;
    private JLabel spotsLabel;
    private JLabel dhLabel;
    private JLabel gpsLabel;

    //text fields and areas initializations
    private JTextField weightField;
    private JTextField bpField;
    private JTextField spotsField;
    private JTextField gpsField;
    private JTextArea gpsArea;

    //button initializations
    private JButton gpsBtn;
    private JButton entryBtn;
    public JButton getEntryBtn() { return entryBtn; }//******check if needed******
    private JButton reportBtn;
    public JButton getReportBtn() { return reportBtn; }

    //dropbox initializations
    private JComboBox<String> animalDropBox;
    private JComboBox<String> genderDropBox;
    private JComboBox<String> dhDropBox;

    public DataEntry() {
        //Fonts
        Font fontTitle = new Font("Consolas",Font.BOLD,14);
        Font fontText = new Font("Consolas",Font.PLAIN,14);

        //-----------------------------------------------------------------//

        //JPanel properties
        setLayout(null);
        setBounds(0, 0, 750, 300);
        setBackground(Color.pink);
        setVisible(true);

        //-----------------------------------------------------------------//

        //JLabels
        animalObsLabel = new JLabel("Animal Observed:");
        animalObsLabel.setBounds(30,20,150,20);
        animalObsLabel.setForeground(Color.darkGray);
        animalObsLabel.setFont(fontTitle);
        add(animalObsLabel);

        gpsLabel = new JLabel("GPS Coordinates:");
        gpsLabel.setBounds(300,20,150,20);
        gpsLabel.setForeground(Color.darkGray);
        gpsLabel.setFont(fontTitle);
        add(gpsLabel);

        animalLabel = new JLabel("Animal");
        animalLabel.setBounds(30,50,150,20);
        animalLabel.setForeground(Color.darkGray);
        animalLabel.setFont(fontTitle);
        add(animalLabel);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(30,80,150,20);
        genderLabel.setForeground(Color.darkGray);
        genderLabel.setFont(fontTitle);
        add(genderLabel);

        weightLabel = new JLabel("Weight");
        weightLabel.setBounds(30,110,150,20);
        weightLabel.setForeground(Color.darkGray);
        weightLabel.setFont(fontTitle);
        add(weightLabel);

        bpLabel = new JLabel("Blood Pressure");
        bpLabel.setBounds(30,140,150,20);
        bpLabel.setForeground(Color.darkGray);
        bpLabel.setFont(fontTitle);
        add(bpLabel);

        spotsLabel = new JLabel("Spots");
        spotsLabel.setBounds(30,140,150,20);
        spotsLabel.setForeground(Color.darkGray);
        spotsLabel.setFont(fontTitle);
        spotsLabel.setVisible(false);
        add(spotsLabel);

        dhLabel = new JLabel("Dental Health");
        dhLabel.setBounds(30,140,150,20);
        dhLabel.setForeground(Color.darkGray);
        dhLabel.setFont(fontTitle);
        dhLabel.setVisible(false);
        add(dhLabel);

        //-----------------------------------------------------------------//

        //JTextFields and JTextAreas
        weightField = new JTextField();
        weightField.setBounds(150,105,100,25);
        weightField.setForeground(Color.darkGray);
        weightField.setFont(fontText);
        add(weightField);

        bpField = new JTextField();
        bpField.setBounds(150,135,100,25);
        bpField.setForeground(Color.darkGray);
        bpField.setFont(fontText);
        add(bpField);

        spotsField = new JTextField();
        spotsField.setBounds(150,135,100,25);
        spotsField.setForeground(Color.darkGray);
        spotsField.setFont(fontText);
        add(spotsField);

        gpsField = new JTextField();
        gpsField.setBounds(300,35,300,25);
        gpsField.setForeground(Color.darkGray);
        gpsField.setFont(fontText);
        add(gpsField);

        gpsArea = new JTextArea();
        gpsArea.setBounds(300,65,400,150);
        gpsArea.setForeground(Color.darkGray);
        gpsArea.setFont(fontText);
        gpsArea.setEditable(false);
        add(gpsArea);

        //-----------------------------------------------------------------//

        //JButtons
        gpsBtn = new JButton("Add GPS");
        gpsBtn.setBounds(605,35,95,25);
        gpsBtn.setForeground(Color.darkGray);
        gpsBtn.setFont(fontTitle);
        add(gpsBtn);

        entryBtn = new JButton("Add Entry");
        entryBtn.setBounds(75,175,125,25);
        entryBtn.setForeground(Color.darkGray);
        entryBtn.setFont(fontTitle);
        add(entryBtn);

        reportBtn = new JButton("View Report");
        reportBtn.setBounds(575,225,125,25);
        reportBtn.setForeground(Color.darkGray);
        reportBtn.setFont(fontTitle);
        add(reportBtn);

        //-----------------------------------------------------------------//

        //JComboBoxes
        animalDropBox = new JComboBox<>(animalOptions);
        animalDropBox.setBounds(150,45,100,25);
        animalDropBox.setForeground(Color.darkGray);
        animalDropBox.setFont(fontTitle);
        add(animalDropBox);

        genderDropBox = new JComboBox<>(genderOptions);
        genderDropBox.setBounds(150,75,100,25);
        genderDropBox.setForeground(Color.darkGray);
        genderDropBox.setFont(fontTitle);
        add(genderDropBox);

        dhDropBox = new JComboBox<>(dhOptions);
        dhDropBox.setBounds(150,135,100,25);
        dhDropBox.setForeground(Color.darkGray);
        dhDropBox.setFont(fontTitle);
        dhDropBox.setSelectedIndex(1);
        dhDropBox.setVisible(false);
        add(dhDropBox);

        //-----------------------------------------------------------------//

        getAnimal();

        //ActionListeners
        entryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,getAnimal()+" saved as new entry.");
            }
        });


    }

    public String getAnimal() {
        animalDropBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (animalDropBox.getSelectedIndex() == 0) {
                    spotsField.setVisible(false);
                    dhDropBox.setVisible(false);
                    bpField.setVisible(true);

                    animalType = "Penguin";
                } else if (animalDropBox.getSelectedIndex() == 1) {
                    bpField.setVisible(false);
                    dhDropBox.setVisible(false);
                    spotsField.setVisible(true);

                    animalType = "Sea Lion";
                } else if (animalDropBox.getSelectedIndex() == 2) {
                    bpField.setVisible(false);
                    spotsField.setVisible(false);
                    dhDropBox.setVisible(true);

                    animalType = "Walrus";
                }
            }

        });

        return animalType;
    }
}
