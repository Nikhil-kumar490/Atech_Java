import java.util.Scanner;

class Assignment_Operators {
    public static void main(String[] arg) {
        Scanner var = new Scanner(System.in);

        System.out.print("1st Number : ");
        int num1 = var.nextInt();

        System.out.print("2nd Number : ");
        int num2 = var.nextInt();

        int result;

        // Addition
        result = num1;
        result += num2;
        System.out.println("Addition : " + result);

        // Subtraction
        result = num1;
        result -= num2; // result = result - num2
        System.out.println("Subtraction : " + result);

        // Multiplication
        result = num1;
        result *= num2; // result = result * num2
        System.out.println("Multiplication : " + result);

        // Division
        result = num1;
        result /= num2;
        System.out.println("Division : " + result);

        // Modulo
        result = num1;
        result %= num2;
        System.out.println("Modular : " + result);
    }
}
// int a= 24;
//a/=9;
//System.out.println(a);