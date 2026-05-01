import java.util.Scanner;

public class StringLengthProgram {

    // User-defined method to find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        int userLength = findLength(text);

        // Built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
