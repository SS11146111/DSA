import java.util.Arrays;

public class ArraysBinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[] {10,5,4,3,12,8};

        //searching in sorted array

        //variation 1
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 10));

        //variation 2
        //searching key within a range
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 3, 6, 10));

        //variation 3
        //searching an element that is not present will return a -ve number
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 3, 6, 100));

    }
}
