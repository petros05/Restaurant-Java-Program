# Restaurant (Java)

This is a small Java console program that reads restaurant data from a text file, creates a `Restaurant` object for each entry, stores them in an `ArrayList`, and prints one random restaurant.

## What The Program Does

`Main.java`:

1. Creates an empty `ArrayList<Restaurant>`.
2. Reads restaurant data from a comma-separated text file.
3. Builds a `Restaurant` object for each row.
4. Stores every object in the list.
5. Prints one randomly selected restaurant.

`Restaurant.java`: 

- `name`
- `waitTime`
- `rating`
- `avrPrice`
- `distance`
- `hoursOpen`

## File Structure

- `src/Main.java` - program entry point and file reading logic
- `src/Restaurant.java` - restaurant class with fields, constructor, getters/setters, and `toString()`
- `src/restaurant.txt` - input data used by the program

## Data Format

Each restaurant is stored as a comma separated record in `restaurant.txt`:

```text
name,waitTime,rating,averagePrice,distance,hoursOpen,
```

Example:

```text
Applebee's,1,3.9,25,20,11:00 AM - 12:00 AM,
```

Field meanings:

- `name`: restaurant name
- `waitTime`: estimated wait time as an integer
- `rating`: restaurant rating as a decimal value
- `averagePrice`: average meal price
- `distance`: distance from the user
- `hoursOpen`: hours of operation

## How Scanning Works

The `scanRestaurantFile(...)` method:

- opens the file using `Scanner`
- uses commas as delimiters
- reads values in this order: `String`, `int`, `double`, `double`, `double`, `String`
- trims the restaurant name
- restaurant any rating above `5` would change to `5`
- creates a `Restaurant` object and adds it to the `ArrayList`

## How Random Selection Works

The `printRandomRestaurant(...)` method picks a random index from the list and prints the selected restaurant using the `toString()` method from `Restaurant.java`.


## Example Output

```text
Restaurant Name: Chili's
Wait Time: 3
Rating: 4.0
Average Price: 20.0
Distance: 20.0
Hours Open: 11:00 AM - 10:00 PM
```
