import java.util.Arrays;
// Adding The 2 Arrays crosponding  values in new array list

public class t2D_array {
    public static void main(String[] args) {
//        int[] arr1 ={3,2,4,5,7,6,8};
//        int[] arr2 ={2,4,7,3,8,5,6};
//        int[] output = new int[7];
//
//        for (int i=0; i<arr1.length; i++){
//            output[i]= arr1[i]+arr2[i];
//        }
//        System.out.println(Arrays.toString(output));

        // find Maximum value in the array

        int[] arr={5,8,6,5,12,34,77,5,50,1,91,57,15,88,96};
//        Arrays.sort(aar);
//        System.out.println(aar[aar.length-1]);
       int max = arr[0];
       for (int num:arr){
           if (max<num){
               max = num;
           }
       }
        System.out.println("Maximum is :"+max);
    }
}
