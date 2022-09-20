import java.util.Arrays;

/**
 * @author Kapil Suryawanshi
 * 19/09/2022
 */
public class FindMinInArray {
	public static void main(String[] args) {
		int array[]={123,134,9,89,9};

		findMinInArrayUsingStream(array);
		findMinInArrayUsingSearch(array);
	}

	private static void findMinInArrayUsingSearch(int[] array) {
		int min=array[0];

		for (int i = 1; i <array.length ; i++) {
			if(array[i]<min)
				min=array[i];

		}
		System.out.println("Minium Value in Array using Search : " + min);
	}

	private static void findMinInArrayUsingStream(int[] array) {
		int minValue = Arrays.stream(array).min().getAsInt();

		System.out.println("Minium Value in Array using Stream : " + minValue);

	}
}