import java.util.Scanner;

public class Take_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a Num");
        int a = sc.nextInt();

        System.out.print("enter a Num");
        float b = sc.nextFloat();

        System.out.println("enter a string");
        String c= sc.next();

        System.out.println("int- "+a);
        System.out.println("Float- "+b);
        System.out.println("String- "+c);
    }
}
