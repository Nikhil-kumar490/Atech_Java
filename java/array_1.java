import java.util.Arrays;

public class array_1 {
    public static void main(String[] arrgs){
        int arr[];

        // Methods Of Arrays

        arr = new int[6];
        arr[0]=5;
        arr[1]=2;
        arr[2]=7;

        // 1 -> to string
        int[] arr1 = {2,3,5,6,8,9};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);



        // for each
        int[] num={2,6,3,7,9,5,8};
        for (int n:num){
            System.out.println(n);
        }

        // 2 -> for sort
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        // 3 -> for fill
        int[] arr2= new int[5];
        Arrays.fill(arr2, 10);
        System.out.println(Arrays.toString(arr2));

        // 4 -> for copy
        int[] original={2,6,3,7,9,5,8};
        int [] copied= Arrays.copyOf(original,4);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copied));

        // 5 -> for range
        int[] originals={2,6,3,7,9,5,8};
        int [] copiedd= Arrays.copyOfRange(originals,2,5);
        System.out.println(Arrays.toString(originals));
        System.out.println(Arrays.toString(copiedd));

        // 6 -> for Equal
        int[] eql1={1,2,3,4,5};
        int[] eql2={1,3,4,2,5};
        int[] eql3={1,2,3,4,5};

        System.out.println(Arrays.equals(eql1,eql2));
        System.out.println(Arrays.equals(eql1,eql3));

        // 7 -> Binay search
        int[] src1={1,2,3,4,5};
        int[] src2={1,3,4,2,5};
        int[] src3={1,12,3,14,5,2,6,33,0,19};
        int index= Arrays.binarySearch(src3, 2);
        System.out.println(index);

        // 8 -> arrayCopy
        int[] s={10,20,30,40,50};
        int[] d= new int[5];
        System.arraycopy(s,1,d,0,3);
        System.out.println(Arrays.toString(d));

    }

}
