/**
 * @author Kapil Suryawanshi
 * 25/09/2022
 */
public class ChangeStringCharactersCase {
	public static void main(String[] args) {
		String inputString = "KAPIL SuRaWaNShi";

		System.out.println(" Output : " + changeCase(inputString));
	}

	private static String changeCase(String inputString) {
		char ar[]=inputString.toCharArray();

		for (int i = 0; i <ar.length ; i++) {
			if(ar[i]>=65 && ar[i]<=90 )
			{
				ar[i]+=32;
			} else if (ar[i]>=97 && ar[i]<=122){
				ar[i]-=32;
			}

		}
		return new String(ar);
	}


}