package Project1_FLP;

import Project1_FLP.Enum.Station_Type;

import java.util.Random;

public class Station {
    private final Station_Type station_type;

    public Station() {
        int random_station_type = new Random().nextInt(Station_Type.values().length);
        this.station_type = Station_Type.values()[random_station_type];
    }

    public Station_Type getStation_type() {
        return station_type;
    }



//    public static void main(String[] args) {
//        int random_station_type = new Random().nextInt(3);
//    }
}
