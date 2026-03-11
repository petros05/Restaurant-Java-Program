# Restaurant (Java)

A small Java console project that reads restaurant data from a text file, stores each row as a `Restaurant` object, and prints one random restaurant recommendation.

## Project Structure

- `src/Main.java`: Program entry point. Reads file data into an `ArrayList<Restaurant>` and prints one random item.
- `src/Restaurant.java`: `Restaurant` model class (fields, constructor, getters/setters, and `toString()`).
- `src/restaurant.txt`: Source data file used by `Main.java`.

## Data Format

Each restaurant is a comma-separated row in `src/restaurant.txt`:

`name,waitTime,rating,averagePrice,distance,hoursOpen,`

Example:

`Applebee's,1,3.9,25,20,11:00 AM - 12:00 AM,`

## How To Run

## Compile and run from terminal (PowerShell)

```powershell
javac -d out src\Restaurant.java src\Main.java
java -cp out Main
```

## Run in VS Code

1. Open the folder in VS Code.
2. Run `Main.java` with the Java extension.
3. Current code uses `new File("restaurant.txt")`, so either:
   - place `restaurant.txt` in project root, or
   - change code to `new File("src/restaurant.txt")` to use the file already in `src`.

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
- Change the path in code to `src/restaurant.txt` (matches this repo's current file location).

## Git Notes

- `.class` files are compiled output and are not source code.
- Recommended: do not commit `.class` files.
- Typical `.gitignore` entries:
  - `*.class`
  - `out/`
  - `bin/`
