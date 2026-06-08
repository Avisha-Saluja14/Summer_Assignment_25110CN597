import java.util.*;

public class Q29 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter number of rows");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
