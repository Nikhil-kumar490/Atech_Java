import java.util.Arrays;

public class array_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 11},
                {7, 8, 9},
        };
        int[][] copy =new int[arr.length][];
        for (int i=0; i<arr.length; i++){
            copy[i]= Arrays.copyOf(arr[i], arr[i].length);
        }
        arr[0][0] =5;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(copy));
    }
}
