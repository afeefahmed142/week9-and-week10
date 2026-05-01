import java.util.Scanner;

public class CharacterArrayProgram {

    // User-defined method to convert string to char array
    public static char[] getCharacters(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] userArray = getCharacters(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Compare arrays
        boolean result = compareArrays(userArray, builtInArray);

        // Display arrays
        System.out.print("Characters using user-defined method: ");
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        // Display result
        System.out.println("Are both arrays same? " + result);

        sc.close();
    }
}
