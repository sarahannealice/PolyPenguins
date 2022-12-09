import gui.Frame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

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

        //**Fonts for Swing**//
//        String fonts[] =
//                GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//
//        for (int i = 0; i < fonts.length; i++) {
//            System.out.println(fonts[i]);
//        }

    }
}
