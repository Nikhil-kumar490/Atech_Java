import java.util.Arrays;

public class array_1 {
    public static void main(String[] arrgs){
        int arr[];

        arr = new int[6];
        arr[0]=5;
        arr[1]=2;
        arr[2]=7;

        int[] arr1 = {2,3,5,6,8,9};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);

        int[] num={11,2,3,41,50,6,79,8,95};

        // for each
//        for (int n:num){
//            System.out.println(n);

            // for sort
            Arrays.sort(num);
            System.out.println(Arrays.toString(num));
        }
    }


