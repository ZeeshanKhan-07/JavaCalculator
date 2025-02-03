package JavaCalculator;
import java.util.Scanner;

public class calculate {
    static double calculations(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Error: Division by zero is not allowed.");
                }
                return num1 / num2;
            default:
                throw new ArithmeticException("Invalid Operation, Please select a valid Operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Calculator....");
            System.out.println("Select an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the Calculator:");
                break;
            }

            System.out.println("Enter the First Number...");
            double num1 = sc.nextDouble();

            System.out.println("Enter the Second Number...");
            double num2 = sc.nextDouble();

            char operation;

            switch (choice) {
                case 1:
                    operation = '+';
                    break;
                case 2:
                    operation = '-';
                    break;
                case 3:
                    operation = '*';
                    break;
                case 4:
                    operation = '/';
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                    continue;
            }

            try {
                double result = calculations(num1, num2, operation);
                System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}