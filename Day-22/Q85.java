import java.util.*;
public class Q85
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,rev="";
        char ch;
        int i;
        System.out.println("Enter the word");
        s=sc.nextLine();
        for(i=0;i<(s.length());i++)
        {
           ch=s.charAt(i);
           rev=ch+rev;
        }
        if(rev.equals(s))
            System.out.println("It is a palindrome string");
        else
            System.out.println("It is not a palindrome string");
    }
}
