import java.util.*;
public class Q45 
{
    public static void main(String[]args)

    {
        Scanner sc = new Scanner(System.in);
        String  s,s1;
        System.out.println("Enter the string");
        s=sc.nextLine();
        s1=palindrome(s);
        if(s1.equals(s))
        {
            System.out.println("It is a palindrome string");
        }
        else
        {
            System.out.println("It is not a palindrome string");
        }
    }
    static String palindrome(String s)
    {
        String s1="";
        int i;
        char ch;
        for(i=0;i<(s.length());i++)
        {
            ch=s.charAt(i);
            s1=ch+s1;
        }
        return s1;
    }
    
}
