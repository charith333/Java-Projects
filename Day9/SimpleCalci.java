import java.util.Scanner;

public class SimpleCalci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two digits:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter a choice:"
				+ "1.Addition"
				+ "2.Subtraction"
				+ "3.Multiplication"
				+ "4.Division");
		int choice = sc.nextInt();

		
		
		switch (choice) {
		case 1: {
			System.out.println("Addition:"+ a+b);
			break;
		}
		case 2: {
			System.out.println("Subtraction:"+ (a-b));
			break;
		}
		case 3: {
			System.out.println("Multiplication:"+ a*b);
			break;
		}
		case 4: {
			System.out.println("Division:"+ a/b);
			break;
		}
		default:
			System.out.println("Invalid Choice.");
			break;
		}
	}

}
