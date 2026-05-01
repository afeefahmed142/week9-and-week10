import java.util.Scanner;

public class CompareStrings {

    // User-defined method to compare strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        // Check length first
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // User-defined comparison
        boolean userResult = compareStrings(str1, str2);

        // Built-in equals() method
        boolean builtInResult = str1.equals(str2);

        // Display results
        System.out.println("Using charAt() method: " + userResult);
        System.out.println("Using equals() method: " + builtInResult);

        // Check both results
        if (userResult == builtInResult) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Both results are different.");
        }

        sc.close();
    }
}
