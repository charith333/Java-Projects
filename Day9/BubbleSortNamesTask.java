import java.util.Arrays;

public class BubbleSortNamesTask {

	public static void main(String[] args) {
			String names [] = {"Jaanu","Chintu","Bunny"};
			for (int i =0;i<names.length-1;i++) {
				for (int j =0;j<names.length-1;j++) {
					String temp = names[j];
					if(names[j].compareTo(names[j+1])>0) {
						names[j] = names[j+1];
						names[j + 1] = temp;
					}
				}
				
			}
			System.out.print("After Sorting:");
			System.out.println(Arrays.toString(names));

	}

}
