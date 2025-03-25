//There is an array given as input with number (integer )
//values containing from 0 to n. You have to find out
//the missing number from the array.
//Input - [5,3,1,0,2]
//output  - 4
//
//input - [2,3,6,1,5,0]
//output-4

import java.util.Arrays;

public class Array_quastion {
    public static void main(String[] args) {
        int[] arr = {2,3,6,1,5,0};
        Arrays.sort(arr);
        for (int i =0; i< arr.length; i++){
            if(arr[i]!=i){
                System.out.println(i);
                break;
            }
        }
    }
}
