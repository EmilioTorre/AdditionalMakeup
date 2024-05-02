package Chapter6;
/**4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * 6.8.4. Exercise 4
 *
 * Create an ArrayList of Integers named dice4. Generate an Integer representing a roll of a six-sided die 5 times, adding each result to dice4. (hint: generate a random integer value between 1 and 6, inclusive). Print the ArrayList using an enhanced for loop.
 *
 * Sample output: dice4 = 3 2 4 4 1
 */

import java.util.ArrayList;
import java.util.Random;

public class DiceRolls4 {
    public static void main(String[] args) {
        // Create an ArrayList of Integers named dice4
        ArrayList<Integer> dice4 = new ArrayList<>();

        // Generate 5 random integers representing rolls of a six-sided die
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int roll = rand.nextInt(6) + 1; // Generate a random value between 1 and 6
            dice4.add(roll); // Add the roll to the ArrayList
        }

        // Print the ArrayList using an enhanced for loop
        System.out.print("dice4 = ");
        for (Integer value : dice4) {
            System.out.print(value + " ");
        }
        System.out.println(); // Print a newline
    }
}
