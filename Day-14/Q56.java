import java.util.*;
public class Q56
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,c=0,d;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(i=0; i<n; i++)
{
    c = 0;

    for(j=0; j<i; j++)
    {
        if(A[i] == A[j])
        {
            c = 1;
            break;
        }
    }

    if(c == 1)
        continue;

    for(j=i+1; j<n; j++)
    {
        if(A[i] == A[j])
        {
            System.out.println(A[i] + " is a duplicate in array");
            break;
        }
    }
}
    }
}
