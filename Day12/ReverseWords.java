
public class ReverseWords {

	public static void main(String[] args) {
		String s = "Hello World";
		String reverse = new StringBuilder(s).reverse().toString();
		System.out.println(reverse);
	}

}
