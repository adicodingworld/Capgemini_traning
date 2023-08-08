import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter your birth date (YYYY-MM-DD): ");
        String birthDateStr = scanner.next();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        // Calculate your current age
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();

        // Age validation
        if (age < 18) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Invalid age. Age must be at least 18 years.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else if (age > 55) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Invalid age. Age must be less than 55 years.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else if (age >= 18 && age <= 55) {
            // Salary range check
            if (monthlySalary >= 4500 && monthlySalary <= 6500) {
                // Calculate various salary components
                double dearnessAllowance = 0.02 * monthlySalary;
                double travelAllowance = 0.01 * monthlySalary;
                double houseRentAllowance = 0.03 * monthlySalary;
                double providentFund = 0.005 * monthlySalary;

                // Calculate annual salary
                double annualSalary = 12 * monthlySalary;

                // Check if annual salary exceeds 10000 Rs
                if (annualSalary > 10000) {
                    annualSalary -= 1000; // Deduct professional tax
                }

                // Calculate retirement date
                LocalDate retirementDate = birthDate.plusYears(55);

                // Display calculated values
                System.out.println("Your Age: " + age);
                System.out.println("Dearness Allowance: " + dearnessAllowance);
                System.out.println("Travel Allowance: " + travelAllowance);
                System.out.println("House Rent Allowance: " + houseRentAllowance);
                System.out.println("Provident Fund: " + providentFund);
                System.out.println("Annual Salary: " + annualSalary);
                System.out.println("Retirement Date: " + retirementDate);
            } else {
                System.out.println("Invalid salary. Monthly salary should be between 4500 and 6500 Rs.");
            }
        } else {
            System.out.println("Invalid age. Age should be between 18 and 55 years.");
        }

        scanner.close();
    }
}
