import java.util.*;
public class Q26 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter number of terms");
        n=sc.nextInt();
        System.out.println("Fibonnaci series is");
        for(i=1;i<=n;i++)
        {
            System.out.println(fibo(i));
        }
    }
    static int fibo(int m)
    {
        if(m==1)
            return 0;
        else if(m==2)
            return 1;
        else 
            return(fibo(m-1)+fibo(m-2));
    }
    
}
