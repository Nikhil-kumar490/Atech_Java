import java.util.Scanner;

public class HalfSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter 1st word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter 2nd word: ");
        String word2 = sc.nextLine();

        int h1 = word1.length() / 2;
        int h2 = word2.length() / 2;


        String w1 = word1.substring(0, h1) + word2.substring(h2);
        String w2 = word2.substring(0, h2) + word1.substring(h1);


        System.out.println("Swapped Word 1: " + w1);
        System.out.println("Swapped Word 2: " + w2);
    }
}
