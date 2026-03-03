import java.util.Collections;

public class BannerUC4 {
    public static void main(String[] args) {
        // 1. Defining the dimensions/style components
        String borderChar = "*";
        int width = 30;

        // 2. Using String.join to populate repetitive border lines 
        // We create a line of stars by joining a "collection" of the border character
        String horizontalBorder = String.join("", Collections.nCopies(width, borderChar));

        // 3. Storing banner lines in a String array (The Data Structure)
        String[] banner = {
            horizontalBorder,
            "* *",
            "* WELCOME TO JAVA       *",
            "* UC4 ENHANCEMENT      *",
            "* *",
            horizontalBorder
        };

        // 4. Using an enhanced for-loop to print (The Logic)
        // This achieves modularity: the loop doesn't care how many lines are in the array
        for (String line : banner) {
            System.out.println(line);
        }
    }
}