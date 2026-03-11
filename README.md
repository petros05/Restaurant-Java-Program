# Restaurant (Java)

A small Java console project that reads restaurant data from a text file, stores each row as a `Restaurant` object, and prints one random restaurant recommendation.

## Project Structure

- `src/Main.java`: Program entry point. Reads file data into an `ArrayList<Restaurant>`, then calls `printRandomRestaurant(...)`.
- `src/Restaurant.java`: `Restaurant` model class (fields, constructor, getters/setters, and `toString()`).
- `restaurant.txt`: Input data file read by `Main.java` using `new File("restaurant.txt")`.

## Program Flow

1. Create an empty `ArrayList<Restaurant>`.
2. Open `restaurant.txt` with `Scanner`.
3. Read each comma-separated row into fields.
4. Create a `Restaurant` object per row and add it to the list.
5. Call `printRandomRestaurant(ArrayList<Restaurant> list)` to print one random restaurant.

## Data Format

Each restaurant is a comma-separated row in `restaurant.txt`:

`name,waitTime,rating,averagePrice,distance,hoursOpen,`

Example:

`Applebee's,1,3.9,25,20,11:00 AM - 12:00 AM,`

## How To Run

### Compile and run from terminal (PowerShell)

```powershell
javac -d out src\Restaurant.java src\Main.java
java -cp out Main
```

Note: if your file is currently `src/restaurant.txt`, either move it to project root as `restaurant.txt` or change `Main.java` to `new File("src/restaurant.txt")`.

## Run in VS Code

1. Open the folder in VS Code.
2. Run `Main.java` with the Java extension.
3. Make sure `restaurant.txt` is in the project root folder (same level as `src`).

## Run in IntelliJ IDEA

1. Open the project in IntelliJ.
2. Open **Run | Edit Configurations...**
3. Select your `Main` run config.
4. Set **Working directory** to project root:
   `.../Restaurant`
5. Run `Main`.

## File Path Note

`Main.java` uses:

`new File("restaurant.txt")`

That path is relative to the current working directory. If your IDE uses a different working directory, the file may not be found.
If needed, either:

- Keep working directory at project root, or
- Change the path in code if your data file is stored elsewhere.

## Git Notes

- `.class` files are compiled output and are not source code.
- Recommended: do not commit `.class` files.
- Typical `.gitignore` entries:
  - `*.class`
  - `out/`
  - `bin/`
