import java.util.*;
public class Q66
{
    public static void main(String[]args)
    {
        int n,m,i,k=0,c=0,j;
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
        for(i=0;i<n;i++)
        {
            C[k]=A[i];
            k++;
        }
        for(i=0;i<m;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(B[i]==A[j])
                    c++;
            }
            if(c==0)
            {
                C[k]=B[i];
                k++;
            }
        }
        System.out.println("Union of above two array is");
        for(i=0;i<k;i++)
        {
            System.out.println(C[i]);
        }
    }
}