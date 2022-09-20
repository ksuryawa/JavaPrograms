/**
 * @author Kapil Suryawanshi
 * 20/09/2022
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		int number=10;
		generateFibonacciSeries(number);
	}

	private static void generateFibonacciSeries(int number) {
		int first=0;
		int second=1;
		int temp;

		System.out.print("FibonacciSeries : "+ first + " " + second + " ");

		for (int i = 0; i < number; i++) {
			temp=first+second;
			first=second;
			second=temp;
			System.out.print(temp + " ");
		}
	}
}