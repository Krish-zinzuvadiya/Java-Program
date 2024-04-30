import java.util.Scanner;

public class Pb101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        try {
            System.out.print("Enter the number of integers: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                int num = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                
                try {
                    handleExceptions(num);
                    sum += num;
                } catch (Exception e) {
                    System.out.println("Skipping number " + num + ": " + e.getMessage());
                }
            }

            System.out.println("Total sum of valid numbers: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please provide integers.");
        } finally {
            scanner.close();
        }
    }

    public static void handleExceptions(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Number is negative");
        }
        if (num % 10 == 0) {
            throw new Exception("Number is evenly divisible by 10");
        }
        if (num > 1000 && num < 2000) {
            throw new Exception("Number is between 1000 and 2000");
        }
        if (num > 7000) {
            throw new Exception("Number is greater than 7000");
        }
    }
}
