import java.util.Arrays;

public class BubbbleSortTask {

	public static void main(String[] args) {
	int numbers [] = {5,4,9,11,8};
	for (int i =0;i<numbers.length-1;i++) {
		for (int j =0;j<numbers.length-1;j++) {
			int temp = numbers[j];
			if(numbers[j] > numbers[j+1]) {
				numbers[j] = numbers[j+1];
				numbers[j + 1] = temp;
			}
		}
		
	}
	System.out.print("After Sorting:");
	System.out.println(Arrays.toString(numbers));

	}

}
