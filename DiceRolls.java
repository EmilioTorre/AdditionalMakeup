package Chapter6;

/**4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * 6.8.1. Exercise 1

 Create an integer array named dice1 with a size of 10. Populate each array location with a roll of a six-sided die (hint: an int value of 1 through 6). Print the array out using an enhanced for loop.

 Sample output: dice1 = 1 1 6 2 3 5 1 5 4 5
 *
 */
public class DiceRolls {
    public static void main(String[] args) {
        // Create an integer array named dice1 with a size of 10
        int[] dice1 = new int[10];

        // Populate each array location with a random roll of a six-sided die (1 through 6)
        for (int i = 0; i < dice1.length; i++) {
            dice1[i] = (int) (Math.random() * 6) + 1;
        }

        // Print the array using an enhanced for loop
        System.out.print("dice1 = ");
        for (int value : dice1) {
            System.out.print(value + " ");
        }
    }
}