/**
 * @author Kapil Suryawanshi
 * 20/09/2022
 */
public class SumOfDigitsInNumber {
	public static void main(String[] args) {
		int number=123456;

		System.out.println("Number : "+number);
		System.out.println("Sum of Digits : " + sumOfDigits(number));
	}

	private static int sumOfDigits(int num) {
		int sum=0;
		while (num!=0)
		{
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
		}

		return sum;
	}
}