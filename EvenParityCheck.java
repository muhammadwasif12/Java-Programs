import java.util.Scanner;

public class EvenParityCheck {
    // Function to calculate the parity bit for even parity
    public static int calculateEvenParity(int[] bits) {
        int count = 0;
        for (int bit : bits) {
            if (bit == 1) count++;
        }
        return (count % 2 == 0) ? 0 : 1; // Return 0 if even, 1 if odd
    }

    // Function to check for errors in the codeword using the syndrome
    public static boolean checkSyndrome(int[] codeword) {
        int[] dataBits = new int[8];
        System.arraycopy(codeword, 0, dataBits, 0, 8); // Copy first 8 bits
        int receivedParity = codeword[8];
        int calculatedParity = calculateEvenParity(dataBits);
        return (calculatedParity == receivedParity); // True if no error
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for an 8-bit binary sequence
        System.out.println("Enter an 8-bit binary sequence (space-separated 0 or 1):");
        int[] inputBits = new int[8];
        for (int i = 0; i < 8; i++) {
            inputBits[i] = scanner.nextInt();
            if (inputBits[i] != 0 && inputBits[i] != 1) {
                System.out.println("Invalid input! Please enter only 0 or 1.");
                return;
            }
        }

        // Generate the codeword by appending the parity bit
        int[] codeword = new int[9];
        System.arraycopy(inputBits, 0, codeword, 0, 8); // Copy input bits
        codeword[8] = calculateEvenParity(inputBits); // Add parity bit

        // Display the generated codeword
        System.out.print("Generated Codeword: ");
        for (int bit : codeword) System.out.print(bit);
        System.out.println();

        // Check for errors in the codeword without modification
        System.out.println("Checking for errors without modification...");
        if (checkSyndrome(codeword)) {
            System.out.println("No errors detected.");
        } else {
            System.out.println("Error detected!");
        }

        // Introduce an error and recheck
        codeword[4] = (codeword[4] == 0) ? 1 : 0; // Flip the 5th bit
        System.out.println("Introducing an error and checking again...");
        if (checkSyndrome(codeword)) {
            System.out.println("No errors detected.");
        } else {
            System.out.println("Error detected!");
        }

        scanner.close();
    }
}
