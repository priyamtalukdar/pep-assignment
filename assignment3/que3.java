import java.util.*;
public class que3 {
   
        public static void main(String[] args) {
            ArrayList<String> li = new ArrayList<String>();
            li.add("A");
            li.add("B");
            li.add("C");
            li.add("D");
            li.add("E");
    
            int index1 = 0;
            int index2 = li.size()-1;
            System.out.println(li);
    
            String temp = li.get(index1);
            li.set(index1, li.get(index2));
            li.set(index2, temp);
    
            System.out.println(li);
        }
    }
