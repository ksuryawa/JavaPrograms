/**
 * @author Kapil Suryawanshi
 * 25/09/2022
 */
public class ArmstrongNumberExample {
	public static void main(String[] args) {
		int number=-153;
		int sum=0;
		int temp=number;

		while(temp > 0)
		{
			int remainder=temp%10;
			temp=temp/10;
			sum =sum+(remainder*remainder*remainder);

		}

		if(number==sum)
			System.out.println(number + " is Armstrong Number");
		else
			System.out.println(number + " is not Armstrong Number");
	}
}