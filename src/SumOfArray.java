import java.util.Arrays;

/**
 * @author Kapil Suryawanshi
 * 19/09/2022
 */
public class SumOfArray {
	public static void main(String[] args) {
		int arr[]={10,15,5,20,50};

		sumOfArray(arr);
	}

	private static void sumOfArray(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}

		int sum1 = Arrays.stream(arr).sum();
		System.out.println("Sum of array : " + sum);
		System.out.println("Sum of array using stream: " + sum1);
	}
}