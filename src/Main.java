import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Instantiate an ArrayList to hold Restaurant objects
        ArrayList<Restaurant> restaurantList = new ArrayList<>();

        // Take user input using JOptionPane
        String name = JOptionPane.showInputDialog("Enter Restaurant Name");
        int  waitTime = Integer.parseInt(JOptionPane.showInputDialog("Enter Restaurant wait time in Minutes: (ex. 30)"));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant rating (ex. 0.0 - 5.0)"));
        double avrPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Average price: (ex. 12.50)"));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Distance in Miles (ex. 5.5)"));
        String hoursOpen =  JOptionPane.showInputDialog("Enter Restaurant of Operation: (ex. 09:00am - 10:00pm)");

        // Create and store the Restaurant object
        Restaurant userRestaurant = new Restaurant(name, waitTime, rating, avrPrice, distance, hoursOpen);

        // Add the Restaurant object to the ArrayList
        restaurantList.add(userRestaurant);

        // Print all restaurants in the ArrayList
        System.out.println(restaurantList);
    }
}