/*
OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
This use case improves upon UC3 by using a String array to store banner lines
and iterating through them with a for-each loop, eliminating hardcoded print
statements and improving modularity and reusability.
@author Developer
@version 4.0
*/

public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC4: 2D String array stores ALL banner lines
        String[][] banner = {
            {"█████", "████ ", "██  ██", "██ ██", "█████"},  // Line 1
            {"█   █", "█  █ ", "██  ██", "██ ██", "█   █"},  // Line 2
            {"█████", "████ ", "██████", "  ██ ", "█████"},  // Line 3
            {"█   █", "█  █ ", "██  ██", "  ██ ", "█   █"},  // Line 4
            {"█████", "████ ", "██  ██", "██ ██", "█████"}   // Line 5
        };
        
        // For-each loop prints each line using String.join()
        for (String[] line : banner) {
            System.out.println(String.join(" ", line));
        }
    }
}
