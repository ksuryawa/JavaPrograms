import java.util.ArrayList;
import java.util.List;

/**
 * @author Kapil Suryawanshi
 * 26/09/2022
 */
public class FindDuplicatNumberInList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		list.add(1);
		list.add(6);

		findDuplicateNumber(list);
	}

	private static void findDuplicateNumber(List<Integer> list) {
		List<Integer> listWithoutDupl=new ArrayList<>();
		System.out.println(list);

		System.out.print("Duplicate numbers are in the list : " );
		for(int i:list)
		{
			if(listWithoutDupl.contains(i))
			{
				System.out.print(i + " ");
			}
			else
			{
				listWithoutDupl.add(i);
			}
		}
		System.out.println("\nList without duplicate : " +listWithoutDupl);
	}
}