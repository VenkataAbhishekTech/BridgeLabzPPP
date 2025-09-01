package Methods.Level1;

import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculateHandShakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handShakes = calculateHandShakes(numberOfStudents);
        
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is: " + handShakes);

        sc.close();

    }
}
