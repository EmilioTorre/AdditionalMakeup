package Chapter6;

/**4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * 6.8.2. Exercise 2

 Create an integer array named dice2 with a size of 6. Populate each array location with a roll of a six-sided die (hint: an int value of 1 through 6). Print the array out using an indexed for loop.

 Sample output: dice2 = 4 5 6 1 4 1
 *
 */
public class DiceRolls2 {
    public static void main(String[] args) {
        // Create an integer array named dice2 with a size of 6
        int[] dice2 = new int[6];

        // Populate each array location with a random roll of a six-sided die (1 through 6)
        for (int i = 0; i < dice2.length; i++) {
            dice2[i] = (int) (Math.random() * 6) + 1;
        }

        // Print the array using an indexed for loop
        System.out.print("dice2 = ");
        for (int i = 0; i < dice2.length; i++) {
            System.out.print(dice2[i] + " ");
        }
        System.out.println(); // Print a newline

        // Alternatively, you can use the enhanced for loop (for-each loop):
        // for (int value : dice2) {
        //     System.out.print(value + " ");
        // }
    }
}
