import java.util.*;
public class recursion4 {

//     static int add(int x, int y)    
// {
//     if(y==0)
//         return x;
//     else
//         return(1+add(x,y-1));
// }
//     public static void main(String[] args) {
//         int x =10;
//         int y =20;
        
//         System.out.println(add(x,y));
//     }

    public static void main(String[] args) {
        int x=10;
        int y=20;
        int sum =0;;
        int z;  
            Scanner sc = new Scanner(System.in);   
             
            for(int i=0;i<3;i++)    
            {    
            z = sc.nextInt();  
            sum=sum+z;       
            } System.out.println(sum); 
    }

}
