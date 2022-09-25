/**
 * @author Kapil Suryawanshi
 * 25/09/2022
 */
public class PalindromeExample {
	public static void main(String[] args) {
		String inputString="1aaVaa1";
		System.out.println(isPalindrome(inputString)? inputString + " is palendrome": inputString+" is not palendrome");
	}

	private static boolean isPalindrome(String inputString) {
		char ar[]=inputString.toCharArray();

		for(int i = 0,j=ar.length-1 ; i < (ar.length/2); i++,j--) {
				if(ar[i]!=ar[j])
					return false;
		}
		return true;
	}
}