import java.util.Scanner;

public class Switch_day {
    public static void main(String[] args) {
        Scanner nk = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int m = nk.nextInt();
        switch (m) {
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
        que(m);
    }

    public static void que(int m) {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you know about Previous and next day ?(Y or N)");
        String ans = s.next();
        switch (ans) {
            case "Y":
                System.out.println("Next Day is: " +my(m + 1));
                System.out.println("Previous Day is: " +my(m - 1));
                break;

            case "y":
                System.out.println("Next Day is: " +my(m + 1));
                System.out.println("Previous Day is: " +my(m - 1));
                break;
            default:
                break;
        }
    }

    public static String my(int m) {
        return switch (m) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuseday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "None";
        };

    }
}