import java.util.Scanner;

class even {
    public static void main(String[] a) {
        Scanner var = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = var.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "is even.");
        } else {
               System.out.println(num+"is odd.");
        }

    }
}
