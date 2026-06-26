import java.util.*;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");

        int ans1 = sc.nextInt();
        if (ans1 == 2)
            score++;

        System.out.println("Q2. 5 + 7 = ?");
        System.out.println("1. 10");
        System.out.println("2. 11");
        System.out.println("3. 12");

        int ans2 = sc.nextInt();
        if (ans2 == 3)
            score++;

        System.out.println("Q3. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Database");
        System.out.println("3. Browser");

        int ans3 = sc.nextInt();
        if (ans3 == 1)
            score++;

        System.out.println("Your Score = " + score + "/3");
    }
}
