import java.util.Scanner;
public class IT26101386Lab6Q2B {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 1;
        int number;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
            count++;
        }

        scanner.close();
    }
}