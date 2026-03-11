public class Restaurant {
    // Properties
    private String name;
    private int waitTime;
    private double rating;
    private double avrPrice;
    private double distance;
    private String hoursOpen;

    // Constructor
    public Restaurant(String name, int waitTime, double rating, double avrPrice, double distance, String hoursOpen) {
        this.name = name;
        this.waitTime = waitTime;
        this.rating = rating;
        this.avrPrice = avrPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;
    }

    // Getters & Setters

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaitTime() { return waitTime; }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAvrPrice() {
        return avrPrice;
    }

    public void setAvrPrice(double avrPrice) {
        this.avrPrice = avrPrice;
    }

    public double getDistance() { return distance; }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getHoursOpen() {
        return hoursOpen;
    }

    public void setHoursOpen(String hoursOpen) {
        this.hoursOpen = hoursOpen;
    }

    public String toString(){
        return "\nRestaurant Name: " + name +
                "\nWait Time: " + waitTime +
                "\nRating: " + rating +
                "\nAverage Price: " + avrPrice +
                "\nDistance: " + distance +
                "\nHours Open: " + hoursOpen + "\n";
    }
}

