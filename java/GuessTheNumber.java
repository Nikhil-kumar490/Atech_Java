
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int Gues = r.nextInt(100) + 1;
        int userGues = 0;
        int tris = 0;

        System.out.println("Welcome to the Number Guesing Game!");
        System.out.println("Try to gues the number between 1 to 100.");

        while (userGues != Gues) {
            System.out.print("Enter your gues: ");
            userGues = sc.nextInt();
            tris++;

            if (userGues < Gues) {
                System.out.println("Too low! Try again.");
            } else if (userGues > Gues) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations....You guessed right " + tris + " attempts.");
            }
        }

        sc.close();
    }
}
