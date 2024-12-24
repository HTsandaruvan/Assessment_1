package devision;
import java.util.Scanner;

public class Devision {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter first number: ");
	            int num1 = scanner.nextInt();

	            System.out.print("Enter second number: ");
	            int num2 = scanner.nextInt();

	            int result = divide(num1, num2);
	            System.out.println("Result: " + result);

	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter numeric values.");
	        } finally {
	            scanner.close();
	        }
	    }

	    public static int divide(int num1, int num2) {
	        return num1 / num2;
	    }

}
