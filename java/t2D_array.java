public class t2D_array {
    public static void main(String[] args) {
        int[] arr1 ={3,2,4,5,7,6,8};
        int[] arr2 ={2,4,7,3,8,5,6};
        int[] output = new int[4];

        for (int i=0; i<arr1.length; i++){
            output[i]= arr1[i]+arr2[i];
        }
    }
}
