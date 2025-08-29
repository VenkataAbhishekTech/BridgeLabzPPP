package Strings.Level1;

public class NullPointerDemo {
    public static void generateException() {
        String text = null; 
        System.out.println("Length of text: " + text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Text is null!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling generateException()...");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("\nCalling handleException()...");
        handleException();
    }
}
