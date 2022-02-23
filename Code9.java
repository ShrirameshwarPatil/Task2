
import java.util.ArrayList;
import java.util.ListIterator;

public class Code9 {

	// Main driver method
	public static void main(String[] args)
	{

		// Create an ArrayList
		ArrayList<String> colors = new ArrayList<String>();

		// Add elements to above ArrayList
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Pink");
		colors.add("Black");
		colors.add("Green");

		// ArrayList ={Red, White, Blue, Pink, Black, Green}
		ListIterator<String> listIterator
			= colors.listIterator();

		System.out.println("List Before remove() method = "
						+ colors);

		// Removing ith element from ArrayList
		// using listiterator

		// Suppose i = 3, so traversing
		// till that element
		for (int i = 0; i < 3; i++) {
			listIterator.next();
		}

		// Removes one more element from list
		// 'blue' element is removed from arraylist
		listIterator.remove();

		// Printing the final ArrayList after removing
		// elements from originally created ArrayList
		System.out.println("List After remove() method = "
						+ colors);
	}
}
