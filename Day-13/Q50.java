import java.util.*;
public class Q50 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,sum=0;
        double avg=0.0;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+A[i];
        }
        System.out.println("Sum of array elements is "+ sum);
        avg=(double)sum/n;
        System.out.println("Average of array elements is "+ avg);
    }
}
