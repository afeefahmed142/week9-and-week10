import java.util.Scanner;

public class SplitTextProgram {

    // Method to find length without using length()
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

    // Method to split text into words without using split()
    public static String[] splitText(String text) {

        int length = findLength(text);

        // Count words
        int wordsCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordsCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndexes = new int[wordsCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        // Create words array
        String[] words = new String[wordsCount];

        int start = 0;

        for (int i = 0; i < wordsCount - 1; i++) {

            int end = spaceIndexes[i];

            String word = "";

            for (int j = start; j < end; j++) {
                word = word + text.charAt(j);
            }

            words[i] = word;

            start = end + 1;
        }

        // Last word
        String lastWord = "";

        for (int i = start; i < length; i++) {
            lastWord = lastWord + text.charAt(i);
        }

        words[wordsCount - 1] = lastWord;

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {

            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split method
        String[] userWords = splitText(text);

        // Built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare arrays
        boolean result = compareArrays(userWords, builtInWords);

        // Display user-defined words
        System.out.println("\nWords using user-defined method:");
        for (String word : userWords) {
            System.out.println(word);
        }

        // Display built-in words
        System.out.println("\nWords using split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre both arrays same? " + result);

        sc.close();
    }
}
