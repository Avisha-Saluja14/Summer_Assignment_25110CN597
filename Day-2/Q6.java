import java.util.*;
public class Q6 {
    public static void main(String []args)
    {
        int n,rev=0,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse of this number is "+rev);


    }
    
}
