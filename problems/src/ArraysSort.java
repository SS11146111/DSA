import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {

        //sorting array

        int[] arr = new int[] {10,5,4,3,12,8};

        // variation 1, sorting entire array in ascending by default
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //variation 2, sorting subarray or part of the main array, end index is exclusive
        Arrays.sort(arr,3, arr.length);
        System.out.println(Arrays.toString(arr));






    }
}
