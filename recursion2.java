import java.util.*;
public class recursion2 {
    static int power(int n, int pow){
        if(pow ==0){
            return 1;
        }else{
            return n*power(n,pow-1);
        }
    }
    public static void main(String[] args) {
        int n =2;
        Scanner sc = new Scanner(System.in);
        int pow =sc.nextInt();
        System.out.println(power(n,pow));
    }
}
