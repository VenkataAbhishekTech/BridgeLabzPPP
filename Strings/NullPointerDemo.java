package Strings;

public class NullPointerDemo {
    public static void generateException() {
        String text = null; // text is null
        // Trying to call length() on null will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method that handles NullPointerException using try-catch
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Text is null!");
        }
    }

    public static void main(String[] args) {
        // Step 1: This will generate the exception
        System.out.println("Calling generateException()...");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        // Step 2: Refactor - handle the exception properly
        System.out.println("\nCalling handleException()...");
        handleException();
    }
}
