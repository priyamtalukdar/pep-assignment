import java.util.ArrayList;
    public class que1 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(2);
        li.add(4);

        int searchElement = 2;
        boolean isPresent = li.contains(searchElement);
        if (isPresent) {
            int firstIndex = li.indexOf(searchElement);
            int lastIndex = li.lastIndexOf(searchElement);
            System.out.println("Element " + searchElement + " is present in the ArrayList.");
            System.out.println("First occurrence of element " + searchElement + " is at index " + firstIndex);
            System.out.println("Last occurrence of element " + searchElement + " is at index " + lastIndex);
        } else {
            System.out.println("Element " + searchElement + " is not present in the ArrayList.");
        }
    }
}
