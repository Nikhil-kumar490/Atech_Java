import java.util.Arrays;

public class array_1 {
    public static void main(String[] arrgs) {
        int arr[];

        arr = new int[6];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 7;

        int[] arr1 = {2, 3, 5, 6, 8, 9};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);

        //---------Array methods---------
        int[] num = {11, 2, 3, 41, 50, 6, 79, 8, 95};

        // 1 -> for each
        for (int n : num) {
            System.out.println(n);
            // 2 -> for sort
            Arrays.sort(num);
            System.out.println(Arrays.toString(num));

            // 3 -> for Fill
            int[] arr2 = new int[5];
            Arrays.fill(arr2, 100);
            System.out.println(Arrays.toString(arr2));

            // 4 -> For Copy
            int [] orininal={7,3,2,57,44,12,5};
            int [] copied = Arrays.copyOf(orininal,3);
                 System.out.println(Arrays.toString(orininal));
                 System.out.println(Arrays.toString(copied));

                 // 5-> Range
            int [] orininals={7,3,9,57,44,12,5};
            int [] copiedd = Arrays.copyOfRange(orininals,2,5);
            System.out.println(Arrays.toString(orininals));
            System.out.println(Arrays.toString(copiedd));
        }
    }
}


