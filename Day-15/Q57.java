import java.util.*;
public class Q57 
{
    public static void main(String[]args)
    {
        int n,i,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Reversed array is");
        for(i=0;i<n/2;i++)
        {
            temp=A[i];
            A[i]=A[n-1-i];
            A[n-1-i]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }
    }
    
}
