/**
 * @author Kapil Suryawanshi
 * 18/09/2022
 */
public class ReverseStringWithoutInbuildFun {
	public static void main(String[] args) {
		String originalString="Sumati Patil";

		System.out.println("Reverse String : "+ reverseString(originalString));
		System.out.println("Reverse String with swap: "+ reverseStr(originalString));
	}

	private static String reverseStr(String originalString) {
		char ch[]=originalString.toCharArray();
		char temp;
		int swapCount=0;
		for (int i = 0,j= ch.length-1; i < (ch.length/2); i++,j--) {
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			swapCount++;
		}
		System.out.println("Swap Count : "+swapCount);
		return new String(ch);
	}

	private static String reverseString(String originalString) {
		String reversedString="";
		char character;
		int count=0;
		for (int i = 0; i < originalString.length(); i++) {
			character=originalString.charAt(i);
			reversedString=character + reversedString;
			count++;
		}
		System.out.println( "Count : "+count);
		return reversedString;
	}
}