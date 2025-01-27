import java.util.Scanner;

class leep_year {
     public static void main(String[] a){
         Scanner var= new Scanner(System.in);
         System.out.print("enter a year : ");

         int year = var.nextInt();

         if ((year%4==0 && year%100 !=0) || (year%400==0)) {
             System.out.println(year + "is a Leap Year ");
         } else{
             System.out.println(year+"is not a Leap Year ");
         }
    }
}
