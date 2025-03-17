import java.util.Arrays;

public class array_1 {
    public static void main(String[] arrgs){
        int arr[];

        // Methods Of Arrays

        arr = new int[6];
        arr[0]=5;
        arr[1]=2;
        arr[2]=7;

        // to string
        int[] arr1 = {2,3,5,6,8,9};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);



        // for each
        int[] num={2,6,3,7,9,5,8};
        for (int n:num){
            System.out.println(n);
        }

        // for sort
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        //for fill
        int[] arr2= new int[5];
        Arrays.fill(arr2, 10);
        System.out.println(Arrays.toString(arr2));

        // for copy
        int[] original={2,6,3,7,9,5,8};
        int [] copied= Arrays.copyOf(original,4);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copied));

        // for range
        int[] originals={2,6,3,7,9,5,8};
        int [] copiedd= Arrays.copyOfRange(originals,2,5);
        System.out.println(Arrays.toString(originals));
        System.out.println(Arrays.toString(copiedd));
    }

}
