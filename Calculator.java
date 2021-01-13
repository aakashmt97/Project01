import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		float a, b, res;
		char choice, ch;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			choice = scan.next().charAt(0);
			
			switch (choice) {
			
			case '1' :	System.out.println("Enter two numbers : ");
						a = scan.nextFloat();
						b = scan.nextFloat();
						res = a + b;
						System.out.println("Result = " + res);
						break;
			case '2' :	System.out.println("Enter two numbers : ");
						a = scan.nextFloat();
						b = scan.nextFloat();
						res = a - b;
						System.out.println("Result = " + res);
						break;
			case '3' :	System.out.println("Enter two numbers : ");
						a = scan.nextFloat();
						b = scan.nextFloat();
						res = a * b;
						System.out.println("Result = " + res);
						break;
			case '4' :	System.out.println("Enter two numbers : ");
						a = scan.nextFloat();
						b = scan.nextFloat();
						res = a / b;
						System.out.println("Result = " + res);
						break;
			}
		}while (choice != '5');
		
		scan.close();
	}
}
