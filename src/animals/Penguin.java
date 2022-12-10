package animals;

import java.util.ArrayList;

public class Penguin extends Species {
    private double bloodPressure;

    public Penguin(String gender, int weight, double bloodPressure, ArrayList gpsCoordinates) {
        this.gender = gender;
        this.weight = weight;
        this.gpsCoordinates = gpsCoordinates;
        this.bloodPressure = bloodPressure;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getGender() {
        return gender;
    }


    @Override
    public void writeToFile() {

    }

    @Override
    public void writeToConsole() {

    }
}
