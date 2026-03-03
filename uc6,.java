import java.util.Collections;

public class BannerUC6 {
    public static void main(String[] args) {
        // Pre-fetching character patterns for cleaner array initialization
        String[] o = getCharO();
        String[] p = getCharP();
        String[] s = getCharS();

        // 1. Modular Array Declaration
        // We invoke the methods directly (or their variables) to build the banner lines
        String[] banner = {
            getBorder(25),                      // Row 1: Top Border
            o[0] + "  " + p[0] + "  " + s[0],   // Row 2: Character Row 1
            o[1] + "  " + p[1] + "  " + s[1],   // Row 3: Character Row 2
            o[2] + "  " + p[2] + "  " + s[2],   // Row 4: Character Row 3
            o[3] + "  " + p[3] + "  " + s[3],   // Row 5: Character Row 4
            o[4] + "  " + p[4] + "  " + s[4],   // Row 6: Character Row 5
            getBorder(25)                       // Row 7: Bottom Border
        };

        // 2. Loop-based Rendering
        // Utilizing an enhanced for-loop to iterate through the array efficiently
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // --- Static Helper Methods (Encapsulation) ---

    public static String getBorder(int length) {
        return String.join("", Collections.nCopies(length, "*"));
    }

    public static String[] getCharO() {
        return new String[]{
            "  *** ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  *** "
        };
    }

    public static String[] getCharP() {
        return new String[]{
            " **** ",
            " *  * ",
            " **** ",
            " * ",
            " * "
        };
    }

    public static String[] getCharS() {
        return new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        };
    }
}