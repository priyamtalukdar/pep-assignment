
    import java.util.*;

    public class recursionq1 {
      static int count = 0;
    
      public static int countDigits(int num) {
        if (num > 0) {
          count++;
          countDigits(num / 10);
        }
    
        return count;
      }
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int num = 10000;
        int res = 0;
    
        res = countDigits(num);
        System.out.printf("Total digits are: " + res);
      }
    }
