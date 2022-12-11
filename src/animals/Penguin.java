package animals;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Penguin extends Species {
    private double bloodPressure;

    public Penguin(String gender, int weight, double bloodPressure, ArrayList<String> gpsCoordinates) {
        this.gender = gender;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.gpsCoordinates = gpsCoordinates;

        writeToFile();
        writeToConsole();
    }

    @Override
    public String getSpecies() {
        return "Species: Penguin";
    }

    @Override
    public String getGender() {
        return "Gender: " + gender;
    }

    @Override
    public String getWeight() {
        return "Weight: " + weight + "kg";
    }

    public String getSpecialTrait() {
        return "Blood Pressure: " + bloodPressure;
    }

    @Override
    public ArrayList<String> getGPSCoordinates() {
        return gpsCoordinates;
    }


    @Override
    public void writeToFile() {
        try {
            File file = new File("PolyPenguin_Coordinates.txt");
            if (file.createNewFile()) {
//                System.out.println("file created successfully");
            } else {
//                System.out.println("file already exists");
            }
        } catch (IOException e) {
//            System.out.println("an error occurred");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("PolyPenguin_Coordinates.txt", true);
            for (int i = 0; i < getGPSCoordinates().size(); i++) {
                writer.append(getGPSCoordinates().get(i) + "\n");
            }
            writer.close();
//            System.out.println("wrote to file successfully");
        } catch (IOException e) {
//            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }

    @Override
    public void writeToConsole() {
        for (int i = 0; i < getGPSCoordinates().size(); i++) {
            System.out.println(getGPSCoordinates().get(i));
        }
    }
}
