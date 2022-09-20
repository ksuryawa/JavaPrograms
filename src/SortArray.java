import java.util.Arrays;
import java.util.Collections;

/**
 * @author Kapil Suryawanshi
 * 19/09/2022
 */
public class SortArray {
	public static void main(String[] args) {
		Integer array[] = {23,34,89,5,68,90,190};

		sortAscending(array);
		sortDescending(array);
	}

	private static void sortDescending(Integer[] array) {
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Descending Sorted array : " + Arrays.toString(array));
	}

	private static void sortAscending(Integer[] array) {
		Arrays.sort(array);
		System.out.println(" Ascending Sorted array : " + Arrays.toString(array));
	}
}