
    // A driving liasence issue of 18+?

    import java.util.Scanner;

    class driving_liasence_issue{
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter your age :-");

            int age = sc.nextInt();

              // ternary operator

//            String res= age<18 ? "No You are not" : "Yes You are ";
//            System.out.println(res);

            if (age>=18){
                System.out.println("Yes you are eligible for License");
            }

            else{
                int remaing_age= 18-age;
                System.out.println("No...You have to wait for "+remaing_age +"years");
            }
        }
    }