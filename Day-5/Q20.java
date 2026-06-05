import java.util.*;

public class Q20 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largestFactor = -1;

        while (n % 2 == 0) 
        {
            largestFactor = 2;
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2)
        {
            while (n % i == 0) 
            {
                largestFactor = i;
                n=n/i;
            }
        }

        if (n > 2) 
        {
            largestFactor = n;
        }

        System.out.println("Largest Prime Factor = " + largestFactor);

    }
}
