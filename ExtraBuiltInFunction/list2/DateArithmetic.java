package ExtraBuiltInFunction.list2;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate);

        LocalDate modifiedDate = date.plusDays(7).plusMonths(1)
                                     .plusYears(2).minusWeeks(3);

        System.out.println("\nOriginal Date : " + date);
        System.out.println("After +7 days, +1 month, +2 years and -3 weeks: ");
        System.out.println("Final Date    : " + modifiedDate);

        sc.close();
    }
}
