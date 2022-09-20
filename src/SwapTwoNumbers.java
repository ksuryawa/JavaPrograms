/**
 * @author Kapil Suryawanshi
 * 18/09/2022
 */
public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;

		System.out.println(" Original Number - a = " + a + " b = " + b );

		swapNumbersWithTemp(a,b);

		swapNumbersWithoutTemp(a,b);
	}

	private static void swapNumbersWithoutTemp(int a, int b) {
		a=a+b;  //a=10+20=30
		b=a-b;  //b=30-20=10
		a=a-b;  //a=30-10=20a

		System.out.println(" Swap Numbers without Temp - a = " + a + " b = " + b );
	}

	private static void swapNumbersWithTemp(int a, int b) {

		int temp=a;
		a=b;
		b=temp;

		System.out.println(" Swap Numbers with Temp - a = " + a + " b = " + b );

	}
}