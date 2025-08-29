package Methods;
import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        boolean a = (year % 4 == 0) && (year % 100 != 0);
        boolean b = (year % 400 == 0);
        return a || b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year(>=1582): ");
        int year = sc.nextInt();

        if (year<1582){
            System.out.println("Leap year valid only from >=1583.");
        }else{
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
        sc.close();
    }
}
