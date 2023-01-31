import java.io.*;
import java.util.LinkedList;
public class five {
public static void main(String args[]) {

	// Creating an empty LinkedList
	LinkedList<String> list = new LinkedList<String>();

	// Use add() method to add elements in the list
	list.add("10");
	list.add("20");
	list.add("30");
	list.add("12");
	list.add("23");

	// Displaying the list
	System.out.println("LinkedList:" + list);
	System.out.println("The first occurrence of Geeks is at index:"+ list.indexOf("23"));

}
}

