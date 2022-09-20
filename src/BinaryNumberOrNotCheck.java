/**
 * @author Kapil Suryawanshi
 * 20/09/2022
 */
public class BinaryNumberOrNotCheck {
	public static void main(String[] args) {
		int num=10101;
		System.out.println(isBinaryOrNot(num)
				?num + " Number is binary number"
				:num + " Number is not binary number");

		num=101012;
		System.out.println(isBinaryOrNot(num)
				?num + " Number is binary number"
				:num + " Number is not binary number");

		num=101015;
		System.out.println(isBinaryOrNot(num)
				?num + " Number is binary number"
				:num + " Number is not binary number");

	}

	private static boolean isBinaryOrNot(int num) {
		while (num!=0)
		{
			if(num%10>1)
			{
				return false;
			}
			num=num/10;
		}
		return true;
	}
}