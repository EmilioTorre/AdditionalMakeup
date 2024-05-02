package Chapter6;
/**4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * 6.8.6. Exercise 6
 *
 * Consider the follow ArrayList:
 *
 * ArrayList<LocalDate> centennials = new ArrayList<>();
 *
 * centennials.add(LocalDate.of(1776, Month.JULY, 4));
 *
 * centennials.add(LocalDate.of(1876, Month.JULY, 4));
 *
 * centennials.add(LocalDate.of(1900, Month.JULY, 4));
 *
 * centennials.add(LocalDate.of(1976, Month.JULY, 4));
 *
 * centennials.add(LocalDate.of(2076, Month.JULY, 4));
 *
 * As you can observe, a java programmer has mistakenly entered the 1900
 *
 * date item into the ArrayList. Without removing the associated
 *
 * centennials.add(...) source line, write the code to remove the errant
 *
 * entry. Print out the resulting ArrayList and size as follows:
 *
 * Before removal:
 *
 * 07/04/1776
 *
 * 07/04/1876
 *
 * 07/04/1900
 *
 * 07/04/1976
 *
 * 07/04/2076
 *
 * size = 5
 *
 * After removal:
 *
 * 07/04/1776
 *
 * 07/04/1876
 *
 * 07/04/1976
 *
 * 07/04/2076
 *
 * size = 4
 *
 * Hint: you should use the DateTimeFormatter class for formatting
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Centennials {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();

        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4)); // Erroneous entry
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        // Remove the erroneous entry for the year 1900
        centennials.removeIf(date -> date.getYear() == 1900);

        // Print the resulting ArrayList
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("After removal:");
        for (LocalDate date : centennials) {
            System.out.println(date.format(formatter));
        }

        // Print the size of the ArrayList
        System.out.println("size = " + centennials.size());
    }
}