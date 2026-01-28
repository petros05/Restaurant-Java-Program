public class Restaurant {
    // Properties
    private int waitTime;
    private double rating;
    private double avrPrice;
    private double distance;
    private String hoursOpen;

    // Constructor
    public Restaurant(int waitTime, double rating, double avrPrice, double distance, String hoursOpen) {
        this.waitTime = waitTime;
        this.rating = rating;
        this.avrPrice = avrPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;
    }
}

