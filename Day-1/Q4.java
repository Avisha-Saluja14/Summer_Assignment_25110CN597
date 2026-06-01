import java.util.*;
public class Q4 {
    public static void main(String []args)
    {
        int n,c=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        System.out.println("Number of digits in this number are "+ c);
    }
    
}
