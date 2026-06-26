import java.util.*;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 50; // Secret number

        while (true) {
            System.out.print("Guess the number: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct! You guessed it.");
                break;
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }
        }
    }
}