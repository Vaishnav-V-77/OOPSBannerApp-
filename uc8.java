import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Proper Program Name: AdvancedOopsBannerApp
 * Final Use Case: Implementing HashMap for efficient pattern management.
 */
public class AdvancedOopsBannerApp {

    public static void main(String[] args) {
        // 1. Defining configuration variables
        int borderSize = 45;
        String wordToPrint = "OOPS";
        String gap = "  ";

        // 2. Initializing a centralized HashMap for pattern storage
        // This replaces scattered helper methods with a more efficient lookup
        Map<Character, String[]> patternMap = new HashMap<>();
        
        // Populating the map with multi-line character patterns
        patternMap.put('O', new String[]{"  *** ", "  * * ", " ** ", " * * ", "  *** "});
        patternMap.put('P', new String[]{"  **** ", " * * ", " **** ", " * ", " * "});
        patternMap.put('S', new String[]{"  **** ", " * ", "   *** ", "     * ", " **** "});

        // 3. Displaying the top border
        System.out.println(getBorder(borderSize));

        // 4. Nested Loops to assemble and render the banner
        // The outer loop iterates through each line of the ASCII height (5 lines)
        for (int lineIndex = 0; lineIndex < 5; lineIndex++) {
            StringBuilder lineAssembler = new StringBuilder();
            
            // The inner loop retrieves patterns from the HashMap for each char in the word
            for (char letter : wordToPrint.toCharArray()) {
                if (patternMap.containsKey(letter)) {
                    lineAssembler.append(patternMap.get(letter)[lineIndex]).append(gap);
                }
            }
            // Printing the assembled row
            System.out.println(lineAssembler.toString());
        }

        // 5. Displaying the bottom border
        System.out.println(getBorder(borderSize));
    }

    /**
     * Helper method to generate the banner border
     */
    public static String getBorder(int length) {
        return String.join("", Collections.nCopies(length, "*"));
    }
}