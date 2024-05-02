package Chapter6;
/**4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * 6.8.8. Exercise 8
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
 * write the code necessary to determine if the centennial (1876, at 100 years) is present.
 *
 * Sample output:
 *
 * centennial present = true
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Centennials3 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();

        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        // Check if the centennial year 1876 is present
        if (centennials.contains(LocalDate.of(1876, Month.JULY, 4))) {
            System.out.println("Centennial year 1876 exists in the ArrayList");
        } else {
            System.out.println("Centennial year 1876 does not exist in the ArrayList");
        }
    }
}
