
package divisiongame;
import java.util.Scanner;
public class DivisionGame {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two integers
            System.out.print("Enter the first integer: ");
            int num1 = getIntegerInput(scanner);

            System.out.print("Enter the second integer: ");
            int num2 = getIntegerInput(scanner);

            // Perform the division
            int result = num1 / num2;

            // Display the result
            System.out.println("Result of " + num1 + " ÷ " + num2 + " = " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            // Handle invalid input (non-integer input)
            System.out.println("Error: Invalid input. Please enter integer numbers only.");
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Helper method to get integer input with validation
    private static int getIntegerInput(Scanner scanner) throws NumberFormatException {
        String input = scanner.nextLine();
        // Check if the input is a valid integer
        if (!input.matches("-?\\d+")) { // Regular expression to match integers (positive or negative)
            throw new NumberFormatException("Input is not an integer.");
        }
        return Integer.parseInt(input);
    }
}  
    
    

