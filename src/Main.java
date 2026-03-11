import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        File file = new File("restaurant.txt");
        Scanner scan = new Scanner(file);
        scan.useDelimiter(",");

        while (scan.hasNext()) {
            // Variables
            String name = scan.next().trim();
            int waitTime = scan.nextInt();
            double rating = scan.nextDouble();
            double avrPrice =  scan.nextDouble();
            double distance = scan.nextDouble();
            String hoursOpen =  scan.next();

            if (rating > 5) {
                rating = 5;
            }

            // Create new Restaurant Object
            Restaurant restaurant = new Restaurant(name,waitTime,rating,avrPrice,distance,hoursOpen);

            // Add restaurant to Array list
            restaurants.add(restaurant);
        }

        printRandomRestaurant(restaurants);
        
    }

    /**
     * Chooses a random Restaurant from an ArrayList and outputs the Restaurant
     * @param list ArrayList of Restaurants
     */
    public static void printRandomRestaurant(ArrayList<Restaurant> list) {
        Random random =  new Random();
        int numRestaurants = list.size();
        int randomIndex = random.nextInt(numRestaurants - 1);
        System.out.println(list.get(randomIndex));
    }
}