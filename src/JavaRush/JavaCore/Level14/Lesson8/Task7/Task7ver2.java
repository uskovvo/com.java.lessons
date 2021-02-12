package JavaRush.JavaCore.Level14.Lesson8.Task7;

import java.util.ArrayList;
import java.util.List;

public class Task7ver2 {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());
        apartments.add(new OneRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (int x = 0; x < apartments.size(); x++){
            if(apartments.get(x) instanceof OneRoomApt) {
                OneRoomApt oneRoomApt = (OneRoomApt) apartments.get(x);
                oneRoomApt.clean1Room();
            }else if(apartments.get(x) instanceof TwoRoomApt) {
                TwoRoomApt twoRoomApt = (TwoRoomApt) apartments.get(x);
                twoRoomApt.clean2Rooms();
            }else if(apartments.get(x) instanceof ThreeRoomApt) {
                ThreeRoomApt threeRoomApt = (ThreeRoomApt) apartments.get(x);
                threeRoomApt.clean3Rooms();
            }
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
