
import java.util.Scanner;

public class switch_st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your percentage :- " );
        int i = sc.nextInt();
        int gradeCategory = i / 10;
        switch (gradeCategory){
            case 10:
                System.out.println("Grade: A++");
            case 9:
                System.out.println("Grade: A+");
                break;
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
                System.out.println("Grade: D");
                break;
            case 4:
                System.out.println("Grade: E )");
                break;
            default:
                System.out.println("Grade: F (Fail)");
                break;
        }
    }
}
