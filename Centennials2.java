package Chapter6;
/**4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * 6.8.7. Exercise 7
 *
 * Consider the follow ArrayList:
 *
 * ArrayList<LocalDate> centennials = new ArrayList<>();
 *
 * centennials.add(LocalDate.of(1776, Month.JULY, 4));
 *
 * centennials.add(LocalDate.of(1876, Month.JULY, 4));
 *
 * centennials.add(LocalDate.of(1976, Month.JULY, 4));
 *
 * centennials.add(LocalDate.of(2076, Month.JULY, 4));
 *
 * write the code necessary to determine the ArrayList size. Sample output:
 *
 * size = 4
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Centennials2 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();

        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        // Get the size of the ArrayList
        int size = centennials.size();

        // Print the size
        System.out.println("size = " + size);
    }
}
