/**
 * @author Kapil Suryawanshi
 * 20/09/2022
 */
public class PrimeNumber {
	public static void main(String[] args) {

		int number=11;
		System.out.println(isPrimeNumber(number)
		? number + " number is prime"
			: number + " number is not prime");

	}

	private static boolean isPrimeNumber(int number) {

		for (int i = 2; i < Math.sqrt(number); i++) {
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
}