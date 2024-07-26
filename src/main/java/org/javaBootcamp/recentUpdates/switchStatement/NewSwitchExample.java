package org.javaBootcamp.recentUpdates.switchStatement;

public class NewSwitchExample {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid day";
        };

        System.out.println(dayName);
    }
}