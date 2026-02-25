# Restaurant Project

Simple Java program that collects restaurant information from user input and stores it in an `ArrayList`.

## Files

#### `src/Restaurant.java`
Defines the `Restaurant` class.

- Properties:
  - `name` (`String`)
  - `waitTime` (`int`, minutes)
  - `rating` (`double`, 0.0 to 5.0)
  - `avrPrice` (`double`, average meal price)
  - `distance` (`double`, miles)
  - `hoursOpen` (`String`, operating hours)
- Constructor initializes all properties.
- Includes getters and setters for each property.
- Overrides `toString()` to print restaurant details in a readable format.

### `src/Main.java`
Contains the program entry point.

- Creates `ArrayList<Restaurant>` to store restaurant objects.
- Uses `JOptionPane` dialogs to collect restaurant information from the user.
- Creates a `Restaurant` object using user input.
- Adds the object to the list.
- Prints the list (which uses `Restaurant.toString()`) to the console.