import java.util.Scanner;

class sum{
    public static void main(String[] a)
    {
        Scanner num= new Scanner(System.in);
        System.out.print("First number:");
        int num1 = num.nextInt();

        System.out.print("enter second number: ");
        int num2 = num.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: "+sum);

    }
}