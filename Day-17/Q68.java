import java.util.*;

public class Q68
{
    public static void main(String[] args)
    {
        int n, m, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first Array");
        n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter array elements");
        for(i = 0; i < n; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter size of second Array");
        m = sc.nextInt();

        int B[] = new int[m];

        System.out.println("Enter array elements");
        for(i = 0; i < m; i++)
        {
            B[i] = sc.nextInt();
        }

        System.out.println("Common elements are");

        for(i = 0; i < n; i++)
        {
            int a = 0;
            for(int p = 0; p < i; p++)//checking for duplicates
            {
                if(A[i] == A[p])
                {
                    a = 1;
                    break;
                }
            }

            if(a == 0)
            {
                for(j = 0; j < m; j++)
                {
                    if(A[i] == B[j])
                    {
                        System.out.println(A[i]);
                        break;
                    }
                }
            }
        }
    }
}