package animals;

import java.util.ArrayList;

abstract public class Species implements ILoggable {
    public String gender;
    public int weight;
    public ArrayList<String> gpsCoordinates;

    abstract public String getSpecies();

    abstract public String getGender();

    abstract public String getWeight();

    abstract public String getSpecialTrait();

    abstract public ArrayList<String> getGPSCoordinates();


}
