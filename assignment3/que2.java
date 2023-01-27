import java.util.*;
public class que2 {
      public static void main(String[] args) {
    ArrayList l1 = new ArrayList();
    l1.add("1");
    l1.add("2");
    l1.add("3");
    ArrayList l2 = new ArrayList();
    l2.add("One");
    l2.add("Two");
    l2.add("Three");
    l2.add("Four");
    l2.add("Five");
    Collections.copy(l2,l1);
    System.out.println(l2);   
  }
}
 
