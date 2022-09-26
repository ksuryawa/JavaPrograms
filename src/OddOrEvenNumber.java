
import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Kapil Suryawanshi
 * 26/09/2022
 */
public class OddOrEvenNumber {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(in);
		out.println("Enter number : ");
		num=sc.nextInt();

		if((num&1)==0)
		{
			out.println(num + " is Even number");
		}
		else
		{
			out.println(num + " is Odd number");
		}
	}
}