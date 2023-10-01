import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        
        int number = scanner.nextInt();
        scanner.close();
        
        long factorial = calculateFactorial(number);
        
        if (factorial != -1) {
            System.out.println("Factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
    }
    
    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Factorial is not defined for negative numbers
        } else if (n == 0) {
            return 1;  // The factorial of 0 is defined as 1
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
