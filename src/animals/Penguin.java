package animals;

import java.util.ArrayList;

public class Penguin extends Species {
    private double bloodPressure;

    public Penguin(String gender, int weight, double bloodPressure, ArrayList<String> gpsCoordinates) {
        this.gender = gender;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.gpsCoordinates = gpsCoordinates;
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
//        String temp = "";
//        for (int i = 0; i < gpsCoordinates.size(); i++) {
//            temp = gpsCoordinates.get(i).toString();
//        }
//        return temp;
        return gpsCoordinates;
    }


    @Override
    public void writeToFile() {

    }

    @Override
    public void writeToConsole() {

    }
}
