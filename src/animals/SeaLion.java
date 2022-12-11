package animals;

import java.util.ArrayList;

public class SeaLion extends Species {
    private int spots;

    public SeaLion(String gender, int weight, int spots, ArrayList<String> gpsCoordinates) {
        this.gender = gender;
        this.weight = weight;
        this.gpsCoordinates = gpsCoordinates;
        this.spots = spots;
    }

    @Override
    public String getSpecies() {
        return "Species: Sea Lion";
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
        return "Spots: " + spots;
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
