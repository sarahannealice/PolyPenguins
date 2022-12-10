package animals;

import java.util.ArrayList;

abstract public class Species implements ILoggable {
    String gender;
    int weight;
    ArrayList<String> gpsCoordinates;

    abstract int getWeight();
    abstract String getGender();


}
