import java.util.*;
public class Q58
{
    public static void main(String[] args) 
    {
        
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        } 
        System.out.println("Array shifted to left by one position is");
        int first = A[0];

        for(i = 0; i < n-1; i++) 
        {
            A[i] = A[i + 1];
        }

        A[n-1] = first;

        for(i = 0; i<n; i++)
        {
            System.out.println(A[i]);
        }
    }
}