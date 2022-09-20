/**
 * @author Kapil Suryawanshi
 * 19/09/2022
 */
public class SumOfDigits {
	public static void main(String[] args) {
		int num=900;

		sum(num);
	}

	private static void sum(int num) {
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}

		System.out.println("Sum of digits : " +sum);
	}
}