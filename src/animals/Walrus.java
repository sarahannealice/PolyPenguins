package animals;

import java.util.ArrayList;

public class Walrus extends Species {
    private String dentalHealth;

    public Walrus(String gender, int weight, String dentalHealth, ArrayList<String> gpsCoordinates) {
        this.gender = gender;
        this.weight = weight;
        this.gpsCoordinates = gpsCoordinates;
        this.dentalHealth = dentalHealth;
    }
    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getGender() {
        return gender;
    }

    public ArrayList<String> getGPSCoordinates() {
        return gpsCoordinates;
    }


    public void writeToFile() {

    }

    public void writeToConsole() {

    }
}
