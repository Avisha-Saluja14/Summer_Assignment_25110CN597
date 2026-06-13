import java.util.*;
public class Q49 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Entered array is");
        for(i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }
    }
    
}
