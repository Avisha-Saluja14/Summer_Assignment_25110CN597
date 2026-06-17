import java.util.*;
public class Q67
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
            c=0;
            for(j=0;j<m;j++)
            {
              if(A[i]==B[j])
              {
                c++;
              }
            }  
            if(c>0)
           {
             int f=0;

           for(int p=0;p<k;p++)
          {
           if(C[p]==A[i])
           {
            f=1;
            break;
           }
         }

    if(f==0)
    {
        C[k]=A[i];
        k++;
    }
   }    
   }  
        System.out.println("INTERSECTION OF ARRAY IS");
        for(i=0;i<k;i++)
            {
                System.out.println(C[i]);
            }   
        }
    } 
