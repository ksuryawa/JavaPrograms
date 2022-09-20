/**
 * @author Kapil Suryawanshi
 * 18/09/2022
 */
public class ReverseNumber {
	public static void main(String[] args) {
		int number=12567;
		System.out.println(" Reverse number : " + reverseNumber(number));

	}

	private static int reverseNumber(int number) {
		int reversedNumber=0;

		while (number!=0)
		{
			int remainder=number%10;
			number=number/10;
			reversedNumber=(reversedNumber*10)+remainder;

		}

		return reversedNumber;
	}


}