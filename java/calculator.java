import java.util.Scanner;

class calculator {
    public static void main(String[] a)
    {
        Scanner var= new Scanner(System.in);

        System.out.print("1st Number : ");
        int num1 = var.nextInt();

        System.out.print("2nd Number :");
        int num2 = var.nextInt();

        System.out.println("Addition :"+(num1+num2));
        System.out.println("Subtraction :"+(num1-num2));
        System.out.println("Multiplication :"+(num1*num2));
        System.out.println("Division :"+(num1/num2));
        System.out.println("Modular :"+(num1%num2));
    }
}
