import java.util.*;
public class Q65
{
    public static void main(String[]args)
    {
        int n,m,i,k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first Array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter size of second Array");
        m=sc.nextInt();
        int B[]=new int[m];
        System.out.println("Enter array elements");
        for(i=0;i<m;i++)
        {
            B[i]=sc.nextInt();
        }
        int C[]=new int[m+n];
        System.out.println("Merged array is");
        for(i=0;i<n;i++)
        {
            C[k]=A[i];
            k++;
        }
        for(i=0;i<m;i++)
        {
            C[k]=B[i];
            k++;
        }
        for(i=0;i<(m+n);i++)
        {
            System.out.println(C[i]);
        }
    }
}
