/**
 * @author Kapil Suryawanshi
 * 18/09/2022
 */
public class ReverseString {
	public static void main(String[] args) {

		String str= "Sumati Kapil Suryawanshi";

		StringBuilder stringBuilder=new StringBuilder(str);

		stringBuilder.reverse();

		System.out.println(stringBuilder);

		String words[] =str.split(" ");
		//System.out.println(words);

		for (String word : words) {
			StringBuilder builder=new StringBuilder(word);
			builder.reverse();

			System.out.println(builder);

		}

	}
}