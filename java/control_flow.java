public class control_flow {
    public static void main(String[] args) {
        int i=4;
        if (i<=10){
            if (i<=5){
                System.out.println("yeh");
            }else {
                System.out.println("No");
            }
            System.out.println("Small");
        } else if(i<=15){
            System.out.println("medium");
        }
        else {
            System.out.println("big");
        }
    }
}
