package java_two.enums_exercise;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        makeDrivingDecision(TrafficLightColor.GREEN);
//        makeDrivingDecision(TrafficLightColor.YELLOW);
        makeDrivingDecision(TrafficLightColor.RED);
    }

    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case GREEN:
                System.out.println("Go dog go");
                break;
            case YELLOW:
                System.out.println("Go faster dog");
                break;
            case RED:
                System.out.println("Rats! wait to make sure no is looking");
                break;
        }
    }
}
