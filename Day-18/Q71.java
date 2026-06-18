import java.util.*;
public class Q71
{
    public static void main(String[]args)
    {
        int n,pos=0,a,lb,ub,mid,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter number to be searched");
        a=sc.nextInt();
        lb=0;
        ub=(n-1);
        mid=(lb+ub)/2;
        while(lb<=ub)
        {
            if(a==A[mid])
            {
                System.out.println("Element found at "+(mid+1)+" position");
                pos=1;
                break;
            }
            else if(a>A[mid])
            {
                lb=mid+1;
            }
            else
            {
                ub=mid-1;
            }
            mid=(lb+ub)/2;
        }
        if(pos==0)
        {
            System.out.println("Search unsuccessful");
        }
    }
}