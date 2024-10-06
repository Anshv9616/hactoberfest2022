import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = sc.nextInt();

        int val = 1; // Starting value for the pattern
        for (int row = 1; row <= N; row++) {
            int cval = val; // Current value to print
            for (int cst = 1; cst <= row; cst++) {
                System.out.print(cval + " ");
                cval++; // Increment the value
            }
            val += row; // Update starting value for the next row
            System.out.println(); // Move to the next line
        }
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
