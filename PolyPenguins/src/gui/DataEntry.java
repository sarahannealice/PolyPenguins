package gui;

import javax.swing.*;
import java.awt.*;

public class DataEntry extends JPanel {
    //variable initializations
    String[] animalOptions;//use getClass() for individual names

    //label initializations
    private JLabel animalObsLabel;
    private JLabel animalLabel;
    private JLabel genderLabel;
    private JLabel weightLabel;
    private JLabel bpLabel;
    private JLabel spotsLabel;
    private JLabel dhLabel;
    private JLabel gpsLabel;

    //button initializations
    private JButton button;

    //dropbox initializations
    private JComboBox<String> animalDropBox;
    private JComboBox<String> genderDropBox;
    private JComboBox<String> dhDropBox;

    public DataEntry() {
        //Fonts
        Font fontTitles = new Font("Consolas", Font.BOLD, 14);
        Font fontText = new Font("Consolas", Font.PLAIN, 14);

        //-----------------------------------------------------------------//

        //JPanel properties
        setLayout(null);
        setBounds(0, 0, 700, 300);
        setBackground(Color.pink);
        setVisible(true);

        //-----------------------------------------------------------------//

        //JLabels
        animalObsLabel = new JLabel("Animal Observed:");
        animalObsLabel.setBounds(10,20,150,20);
        animalObsLabel.setForeground(Color.darkGray);
        animalObsLabel.setFont(fontTitles);
        add(animalObsLabel);

        animalLabel = new JLabel("Animal");
        animalLabel.setBounds(10,50,150,20);
        animalLabel.setForeground(Color.darkGray);
        animalLabel.setFont(fontTitles);
        add(animalLabel);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(10,80,150,20);
        genderLabel.setForeground(Color.darkGray);
        genderLabel.setFont(fontTitles);
        add(genderLabel);

        weightLabel = new JLabel("Weight");
        weightLabel.setBounds(10,110,150,20);
        weightLabel.setForeground(Color.darkGray);
        weightLabel.setFont(fontTitles);
        add(weightLabel);

        bpLabel = new JLabel("Blood Pressure");
        bpLabel.setBounds(10,140,150,20);
        bpLabel.setForeground(Color.darkGray);
        bpLabel.setFont(fontTitles);
        add(bpLabel);

        spotsLabel = new JLabel("Spots");
        spotsLabel.setBounds(10,140,150,20);
        spotsLabel.setForeground(Color.darkGray);
        spotsLabel.setFont(fontTitles);
        spotsLabel.setVisible(false);
        add(spotsLabel);

        dhLabel = new JLabel("Dental Health");
        dhLabel.setBounds(10,140,150,20);
        dhLabel.setForeground(Color.darkGray);
        dhLabel.setFont(fontTitles);
        dhLabel.setVisible(false);
        add(dhLabel);


        //-----------------------------------------------------------------//



        //-----------------------------------------------------------------//



        //-----------------------------------------------------------------//

    }
}
