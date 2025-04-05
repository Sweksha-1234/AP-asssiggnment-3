import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Flag to check whether the number is prime
        boolean isPrime = true;
        
        // Check if the number is less than 2 (since 0 and 1 are not prime)
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop to check if the number is divisible by any number other than 1 and itself
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        // Output whether the number is prime or not
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}


 