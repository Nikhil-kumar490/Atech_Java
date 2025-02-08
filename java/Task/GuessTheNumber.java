package Task;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int Guess = r.nextInt(100) + 1;
        int userGuess = 0;
        int tris = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 to 100.");

        while (userGuess != Guess) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            tris++;

            if (userGuess < Guess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > Guess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations....You guessed right " + tris + " attempts.");
            }
        }

        sc.close();
    }
}
