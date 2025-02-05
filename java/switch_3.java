import java.util.Scanner;

public class switch_3 {
    public static void main(String[] args) {
        Scanner nk= new Scanner(System.in);
        System.out.print("Enter a num : ");
        int m= nk.nextInt();
        switch(m){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuseday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong number");
        }

//        public static int que(){
//            Scanner s= new Scanner(System.in);
//            System.out.println("Do you want know ");
//            String ans;
        }
    }

