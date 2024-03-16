/*
CIS505-T301
Khadga Thapa
Professor Michael McGee
Bellevue University
Assignment 1.3
March 16, 2024
*/

public class TestFanApp {
    public static void main(String[] args) {
        // Creating a default fan
        Fan defaultFan = new Fan();

        // Creating a fan with arguments
        Fan customFan = new Fan(Fan.MEDIUM, true, 8.0, "Blue");

        // Displaying the fans
        System.out.println(defaultFan);
        System.out.println(customFan);
    }
}