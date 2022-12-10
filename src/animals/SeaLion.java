package animals;

import java.util.ArrayList;

public class SeaLion extends Species {
    private int spots;

    public SeaLion(String gender, int weight, double bloodPressure, ArrayList<String> gpsCoordinates) {
        this.gender = gender;
        this.weight = weight;
        this.gpsCoordinates = gpsCoordinates;
        this.spots = spots;
    }
    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public String getGender() {
        return gender;
    }

    public ArrayList<String> getGPSCoordinates() {
        return gpsCoordinates;
    }

    @Override
    public void writeToFile() {

    }

    @Override
    public void writeToConsole() {

    }
}
