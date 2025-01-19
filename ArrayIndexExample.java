
package arrayindexexample;
import java.util.Random;
import java.util.Scanner;
public class ArrayIndexExample {
    public static void main(String[] args) {
        // Step 1: Create an array with 10 randomly chosen integers
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Random numbers between 0 and 99
        }

        // Display the array elements
        System.out.println("Generated Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Step 2: Prompt the user to enter the index of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the array (0-9): ");

        try {
            int index = scanner.nextInt();

            // Step 3: Display the element at the given index
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the index is out of bounds
            System.out.println("Out of Bounds. Please enter a valid index (0-9).");
        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
    
    

