package ExtraBuiltInFunction.list2;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput);

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondInput = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput);

        if (firstDate.isBefore(secondDate)) {
            System.out.println(firstDate + " is BEFORE " + secondDate);
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println(firstDate + " is AFTER " + secondDate);
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println(firstDate + " is EQUAL to " + secondDate);
        }

        sc.close();
    }
}
