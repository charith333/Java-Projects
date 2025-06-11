import java.util.Scanner;
import java.util.Stack;

public class StackActions {

	public static void main(String[] args) {
		Stack<String> actions = new Stack<>();
		actions.add("Write");
		actions.add("Delete");
		actions.add("Insert");
		System.out.println(actions);
		
		actions.peek();
		Scanner sc = new Scanner(System.in);
		System.out.println("Type undo to undo the actions:");
		String s = sc.nextLine();
		
		if(s.equals("undo")) {
			actions.pop();
			actions.pop();
			System.out.println(actions);
		}
		else {
			System.out.println("Invalid");
		}
		

	}

}
