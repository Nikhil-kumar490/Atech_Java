public class sum_of_array {
    public static void main(String[] args) {
        int[] arr= {2,6,3,7,9,5,8};
        int sum =0;
        int mult=1;

//        for (int i=0; i<arr.length; i++){
//            sum = sum + arr[i];
//        }

        for (int i:arr){
            sum = sum + i;
        }

        for (int i:arr){
            mult = mult * i;
        }
        System.out.println("Sum of all Numbers :"+sum);
        System.out.println("Multople of all Numbers :"+mult);
    }


}
