import java.util.Scanner;

public class IT26101386Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sumOfSquares = 0;
        int num;

        System.out.println("Enter positive integers (enter -99 to terminate):");

        while (true) {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
			
            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input! Please enter a positive integer.");
                continue;
            }
			
            sumOfSquares += Math.pow(num, 2);
            count++;
        }
		
        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nRoot Mean Square (RMS) = " + rms);
        } else {
            System.out.println("\nNo valid numbers were entered.");
        }

        scanner.close();
    }
}