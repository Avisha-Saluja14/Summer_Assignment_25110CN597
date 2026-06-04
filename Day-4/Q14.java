import java.util.*;
public class Q14 {
    static int fib(int n)
    {
        if (n==1)
            return 0;
      else if(n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[])
    {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        m=sc.nextInt();
        System.out.println(fib(m));
    }

    
}
