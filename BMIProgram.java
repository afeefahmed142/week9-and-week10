import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            // Convert cm to meter
            double heightM = heightCm / 100.0;

            // BMI Formula
            double bmi = weight / (heightM * heightM);

            String status;

            // BMI Status
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store values in String array
            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display result in table format
    public static void displayResult(String[][] result) {

        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-15s\n",
                "Height", "Weight", "BMI", "Status");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.printf("%-10s %-12s %-12s %-15s\n",
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);
        }

        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array for storing weight and height
        double[][] persons = new double[10][2];

        // Input
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            persons[i][1] = sc.nextDouble();

            System.out.println();
        }

        // Calculate BMI
        String[][] result = calculateBMI(persons);

        // Display Result
        displayResult(result);

        sc.close();
    }
}
