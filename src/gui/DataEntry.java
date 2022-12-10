package gui;

import animals.Species;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DataEntry extends JPanel {
    //variable initializations
    public String[] animalOptions = {"Penguin","Sea Lion","Walrus"};//use getClass() for individual names
    public String[] genderOptions = {"Female","Male"};
    public String[] dhOptions = {"Good","Average","Poor"};
    public String animalType;
    public String animalGender;
    public String walrusDH;
    private ArrayList<String> coordinates = new ArrayList<>();

    //functions to use in Frame
    public int getAnimalWeight() { return Integer.parseInt(weightField.getText()); }
    public double getPenguinBP() { return Double.parseDouble(bpField.getText()) ; }
    public int getSealionSpots() { return Integer.parseInt(spotsField.getText()); }
    public ArrayList<String> getCoordinates() { return coordinates; }


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
    public JTextField weightField;
    public JTextField bpField;
    public JTextField spotsField;
    public JTextField gpsField;
    public JTextArea gpsArea;

    //button initializations
    private JButton addGPSBtn;
    private JButton addEntryBtn;
    public JButton getEntryBtn() { return addEntryBtn; }//******check if needed******
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
        addGPSBtn = new JButton("Add GPS");
        addGPSBtn.setBounds(605,35,95,25);
        addGPSBtn.setForeground(Color.darkGray);
        addGPSBtn.setFont(fontTitle);
        add(addGPSBtn);

        addEntryBtn = new JButton("Add Entry");
        addEntryBtn.setBounds(75,175,125,25);
        addEntryBtn.setForeground(Color.darkGray);
        addEntryBtn.setFont(fontTitle);
        add(addEntryBtn);

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

        //required functions
        getAnimalType();

        //-----------------------------------------------------------------//

        //ActionListeners

        addGPSBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                if (gpsField.getText().isEmpty()) {
//                    JOptionPane.showMessageDialog(null, "At least one GPS location must be entered.");
                if (gpsField.getText().matches("^$") || !getGPSValidate()){
                    JOptionPane.showMessageDialog(null, "Invalid GPS format:\n" +
                            "Latitude values range from -90 to 90.\nLongitude values range from -180 to 180.\n" +
                            "Both values must have 7 digits after the decimal separated by a space.\n" +
                            "(-)##.####### (-)(## or ###).#######");
                } else if (getGPSValidate()){
                    coordinates.add(gpsField.getText());
                    gpsArea.append(gpsField.getText() + "\n");
                }
            }
        });


    }



    //-----------------------------------------------------------------//
    //-----------------------------------------------------------------//
    public String getAnimalType() {
        animalDropBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (animalDropBox.getSelectedIndex() == 0) {
                    spotsLabel.setVisible(false);
                    spotsField.setVisible(false);
                    dhLabel.setVisible(false);
                    dhDropBox.setVisible(false);

                    bpLabel.setVisible(true);
                    bpField.setVisible(true);

                    animalType = animalOptions[0];
                } else if (animalDropBox.getSelectedIndex() == 1) {
                    bpLabel.setVisible(false);
                    bpField.setVisible(false);
                    dhLabel.setVisible(false);
                    dhDropBox.setVisible(false);

                    spotsLabel.setVisible(true);
                    spotsField.setVisible(true);

                    animalType = animalOptions[1];
                } else if (animalDropBox.getSelectedIndex() == 2) {
                    bpLabel.setVisible(false);
                    bpField.setVisible(false);
                    spotsLabel.setVisible(false);
                    spotsField.setVisible(false);

                    dhLabel.setVisible(true);
                    dhDropBox.setVisible(true);

                    animalType = animalOptions[2];
                }
            }

        });

        return animalType;
    }

    public String getAnimalGender() {
        genderDropBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (genderDropBox.getSelectedIndex() == 0) {
                    animalGender = genderOptions[0];
                } else if (genderDropBox.getSelectedIndex() == 1) {
                    animalGender = genderOptions[1];
                }
            }
        });

        return animalGender;
    }

    public String getWalrusDH() {
        dhDropBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dhDropBox.getSelectedIndex() == 0) {
                    walrusDH = dhOptions[0];
                } else if (dhDropBox.getSelectedIndex() == 1) {
                    walrusDH = dhOptions[1];
                } else if (dhDropBox.getSelectedIndex() == 2) {
                    walrusDH = dhOptions[2];
                }
            }
        });

        return walrusDH;
    }


    //Validation methods
    public boolean getIntValidate() {
        String weightInput = weightField.getText();
        boolean validate = weightInput.matches("^+\\d*$");
        if (weightInput.matches("^&")) {
            return false;
        } else {
            return (weightInput.matches("^+\\d*$"));
        }
    }

    public boolean getGPSValidate() {
        boolean gpsVal = false;

        String[] latlong = gpsField.getText().split(" ");
        String latitude = latlong[0];
        String longitude = latlong[1];
        float latFloat = Float.parseFloat(latitude);
        float longFloat = Float.parseFloat(longitude);

        if (latitude.matches("^-?([0-9]{2}[.])[0-9]{7}$") && longitude.matches("^-?[0-9]{2,3}[.][0-9]{7}$")) {
            if (-90 <= latFloat && latFloat <= 90 && -180 <= longFloat && longFloat <= 180) {
            gpsVal = true;
            }
        } else {
        }

        return gpsVal;
    }
}
