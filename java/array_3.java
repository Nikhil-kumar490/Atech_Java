import java.util.Arrays;

// Advanced or enhance for loop
public class array_3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,11},
                {7,8,9},
        };
        System.out.println(Arrays.deepToString(arr));


        for (int[] n:arr){
            for (int num:n){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
