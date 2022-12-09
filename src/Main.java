import animals.*;
import gui.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Species> penguins = new ArrayList<>();
        ArrayList<Species> sealions = new ArrayList<>();
        ArrayList<Species> walrus = new ArrayList<>();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame frame = new Frame();
                    frame.setVisible(true);



                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
