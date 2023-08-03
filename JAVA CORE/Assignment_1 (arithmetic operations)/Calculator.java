import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        Calculator calculator = new Calculator();

        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                
                    if (num2 != 0) 
                    {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } 
                    else 
                    {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                case 4:
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 0:
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    public double add(double num1, double num2) 
    {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) 
    {
        return num1 - num2;
    }

    public double divide(double num1, double num2) 
    {
        return num1 / num2;
    }

    public double multiply(double num1, double num2) 
    {
        return num1 * num2;
    }
}
