package arithmeticCalculator;
import java.util.Scanner;

public class aitheticCalc {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        double x = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double y = scanner.nextDouble();
	        System.out.println("Select operation:");
	        System.out.println("1. Addition (+)");
	        System.out.println("2. Subtraction (-)");
	        System.out.println("3. Multiplication (*)");
	        System.out.println("4. Division (/)");

	        System.out.print("Enter the operation number: ");
	        int choice = scanner.nextInt();

	        double result = 0.0;

	        switch (choice) {
	            case 1:
	                result = x + y;
	                System.out.println("Result: " + result);
	                break;
	            case 2:
	                result = x - y;
	                System.out.println("Result: " + result);
	                break;
	            case 3:
	                result = x * y;
	                System.out.println("Result: " + result);
	                break;
	            case 4:
	                if (y != 0) {
	                    result = x / y;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Cannot divide by zero.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operation choice.");
	        }

	        scanner.close();
	    }
	


}
