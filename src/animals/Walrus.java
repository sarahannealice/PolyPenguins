package animals;

import java.util.ArrayList;

public class Walrus extends Species {
    private int dentalHealth;

    public Walrus(String gender, int weight, int dentalHealth, ArrayList gpsCoordinates) {
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


    public void writeToFile() {

    }

    public void writeToConsole() {

    }
}
