/**
 * @author Kapil Suryawanshi
 * 22/09/2022
 */
public class Factorial {
	public static void main(String[] args) {
		int num=5;
		System.out.println("Factorial of "+num+" is : "+ findFactorial(num)
		);
	}

	private static int findFactorial(int num) {
		if(num==0)
			return 1;

		return num*findFactorial(num-1);
	}
}