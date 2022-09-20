import org.w3c.dom.ls.LSOutput;

/**
 * @author Kapil Suryawanshi
 * 18/09/2022
 */
public class ReverseWordInSentence {


	public static void main(String[] args) {
		String sentence="Sumati Kapil Suryawanshi";
		System.out.println("Original sentence : " + sentence);
		System.out.println("Reverse sentence : " + reveseSentence(sentence));
	}

	private static String reveseSentence(String sentence) {
		String[] words = sentence.split("\\s");

		String reverseWord="";

		for (String word : words) {
			StringBuilder result= new StringBuilder(word);

			result.reverse();
			reverseWord =reverseWord + result.toString()+ " ";
		}

		return reverseWord.trim();

	}
}