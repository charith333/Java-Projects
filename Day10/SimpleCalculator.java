import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number:");
		double n1=input.nextDouble();
		
		System.out.println("enter the second number:");
		double n2=input.nextDouble();
		
		System.out.println("choose an operation(+,-,*,/):");
		char operators=input.next().charAt(0);
		
		double result;
		switch(operators) {
		case '+':
			result=n1+n2;
			System.out.println("result:"+result);
			break;
			
		case'-':
			result=n1-n2;
			System.out.println("result:"+result);
			break;
		
		case'*':
			result=n1*n2;
			System.out.println("result:"+result); 
			break;
		
		case'/':
		if(n2 !=0) {
			result=n1/n2;
			System.out.println("result:"+result);
		}else {
			System.out.println("error:cannot divide by zero!");
		}
	
			break;
			
			default:
				System.out.println("Invalid operator");
		
		}
		input.close();

	}

}
