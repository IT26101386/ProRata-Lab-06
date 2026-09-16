import java.util.Scanner;

public class IT26101386Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        int number;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = scanner.nextInt();
            sum += number;
            count++;
        }
		
        double average = (double) sum / 10;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}