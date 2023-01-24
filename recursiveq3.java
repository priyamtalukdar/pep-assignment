import java.util.*;
public class recursiveq3 {

    // // using for loop
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int first =0;
    //     int second =1;
    //     int temp=0;
        
    //     for(int i = 2;i<=n;i++){
    //         temp =first + second;
    //         first = second;
    //         second = temp;
    //     }System.out.println(second);
   // }

        
         //using recursion
         public static int fib(int n) {
            if (n == 1 || n == 0) {
                return n;
            }
            return fib(n-1) + fib(n-2);
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
            System.out.println(fib(n));
}
}
