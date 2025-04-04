
    import java.util.Scanner;

    public class Salting_Algorithm {
        public static String addSalt(String word) {
            String saltedWord = " ";

            for (int i = 0; i < word.length(); i++) {
                saltedWord = saltedWord + word.charAt(i) + "s";
            }

            return saltedWord; // Return the final salted string
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = sc.nextLine(); // Take user input

            System.out.println("Salted Output: " + addSalt(word)); // Print the salted result
        }
    }
