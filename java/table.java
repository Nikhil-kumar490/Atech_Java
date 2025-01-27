import java.util.Scanner;

class table {
    public static void main(String[] a){
        Scanner var= new Scanner(System.in);
         System.out.print("enter a number: ");
         int num= var.nextInt();

         for(int i=1; i<=10; i++){
             System.out.println(num + " x " + i + " = " + (num * i));
         }
    }
}
