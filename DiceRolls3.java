package Chapter6;

/**4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * 6.8.3. Exercise 3

 Create an ArrayList of Integers named dice3. Generate an Integer representing a roll of a six-sided die 10 times, adding each result to dice3. (hint: generate a random integer value between 1 and 6, inclusive). Print the ArrayList using an enhanced for loop.

 Sample output: dice3 = 3 5 5 1 2 5 3 2 6 5
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class DiceRolls3 {
    public static void main(String[] args) {
        // Create an ArrayList of Integers named dice3
        ArrayList<Integer> dice3 = new ArrayList<>();

        // Generate 10 random integers representing rolls of a six-sided die
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int roll = rand.nextInt(6) + 1; // Generate a random value between 1 and 6
            dice3.add(roll); // Add the roll to the ArrayList
        }

        // Print the ArrayList using an enhanced for loop
        System.out.print("dice3 = ");
        for (Integer value : dice3) {
            System.out.print(value + " ");
        }
        System.out.println(); // Print a newline
    }
}
