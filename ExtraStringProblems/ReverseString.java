package ExtraStringProblems;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        String reversed = "";

        for (int i = st.length() - 1; i >= 0; i--) {
            reversed += st.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
