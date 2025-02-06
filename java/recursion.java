public class recursion {
    public static void main(String[] args) {
        // Factorial

        int i=7;
        System.out.println(+factorial(i));
    }
    public static int factorial(int i){
        if (i==0){
            //Base case
            return 1;
        } else{
            return i * factorial(i-1);// recrsive case

            // for sum of natural number
//            return i * factorial(i-1);// recrsive case

        }
    }
}
