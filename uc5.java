import java.util.Collections;

public class BannerUC5 {
    public static void main(String[] args) {
        // Combining declaration and initialization in a single streamlined statement
        // Incorporating String.join() directly into the array setup
        String[] banner = {
            String.join("", Collections.nCopies(30, "*")), // Line 1: Dynamic Border
            "* *",             // Line 2: Spacer
            "* WELCOME TO UC5        *",             // Line 3: Content
            "* CONCISE INITIALIZATION   *",             // Line 4: Content
            "* OPTIMIZED OUTPUT      *",             // Line 5: Content
            "* *",             // Line 6: Spacer
            String.join("", Collections.nCopies(30, "*"))  // Line 7: Dynamic Border
        };

        // Utilizing an enhanced for loop to display the 7-line visual output
        for (String line : banner) {
            System.out.println(line);
        }
    }
}