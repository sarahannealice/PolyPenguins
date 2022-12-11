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
    public String getSpecies() {
        return "Species: Walrus";
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
        return "Dental Health: " + dentalHealth;
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


    public void writeToFile() {

    }

    public void writeToConsole() {

    }
}
