import java.util.Collections;

/**
 * Proper Program Name: OopsObjectOrientedBanner
 * This version uses an OO structure to manage character patterns efficiently.
 */
public class OopsObjectOrientedBanner {

    // 1. Static inner class to encapsulate character data and patterns
    private static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        // Constructor to initialize the character and its ASCII lines
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for the ASCII pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // 2. Defining configuration variables
        int borderSize = 40;
        String gap = "  ";

        // 3. Initializing pattern objects using constructors
        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
            "  *** ", " * * ", " * * ", " * * ", "  *** "
        });
        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
            " **** ", " * * ", " **** ", " * ", " * "
        });
        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
            "  **** ", " * ", "  *** ", "     * ", " **** "
        });

        // Retrieving patterns via getters
        String[] o = charO.getPattern();
        String[] p = charP.getPattern();
        String[] s = charS.getPattern();

        // 4. Concise array initialization (UC5/UC6 technique)
        String[] banner = {
            getBorder(borderSize),
            o[0] + gap + o[0] + gap + p[0] + gap + s[0], // Building "OOPS"
            o[1] + gap + o[1] + gap + p[1] + gap + s[1],
            o[2] + gap + o[2] + gap + p[2] + gap + s[2],
            o[3] + gap + o[3] + gap + p[3] + gap + s[3],
            o[4] + gap + o[4] + gap + p[4] + gap + s[4],
            getBorder(borderSize)
        };

        // 5. Enhanced for-loop for rendering the final banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Helper method for dynamic border creation
     */
    public static String getBorder(int length) {
        return String.join("", Collections.nCopies(length, "*"));
    }
}