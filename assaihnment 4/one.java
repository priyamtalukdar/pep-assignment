import java.util.LinkedList;

class Main {
  public static void main(String[] args){
    LinkedList<String> l1 = new LinkedList<>();
    l1.add("1");
    l1.add("2");
    l1.add("3");
    l1.add("5");
    l1.add("4");
    System.out.println("LinkedList: " + l1);
    String middle = l1.get(l1.size()/2);
    System.out.println("Middle Element: " + middle);
    }
}