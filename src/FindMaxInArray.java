import java.util.Arrays;

/**
 * @author Kapil Suryawanshi
 * 19/09/2022
 */
public class FindMaxInArray {
	public static void main(String[] args) {
		int array[] = {23,34,89,5,68,90,190};

		findMaxInArrayUsingStream(array);
		findMaxInArray(array);
	}

	private static void findMaxInArray(int[] array) {
		int maxValue=array[0];

		for (int i = 1; i < array.length; i++) {
			if(array[i]>maxValue)
			{
				maxValue=array[i];
			}
		}
		System.out.println("Maximum in Array using search : " + maxValue);
	}

	private static void findMaxInArrayUsingStream(int[] array) {
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println("Maximum in Array using Stream : " + max);
	}
}