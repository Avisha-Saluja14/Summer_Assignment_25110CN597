import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int n,i,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is "+f);
    }
    
}
