package Arrays;

import java.util.Arrays;

public class ArraysFill {

    public static void main(String[] args) {

        //By default array is initialised with 0, to override it with another value use fill
        int[] arr = new int[10];
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));
    }
}
