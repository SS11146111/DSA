package Sorting;

import java.util.Arrays;

public class Radix {


    public static void countingSort(int[] arr, int place)
    {
        int[] count = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            int key = (arr[i]/place)%10;
            count[key]++;
        }

        for(int i =1;i<count.length;i++)
        {
            count[i] = count[i-1] + count[i];
        }

        int[] result = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--)
        {
            int key = (arr[i]/place)%10;
            int position = count[key]-1;
            result[position] = arr[i];
            count[key]--;
        }

        for(int i=0;i<result.length;i++)
        {
            arr[i] = result[i];
        }

    }
    public static void main(String[] args) {

        int[] arr = {10,345,23,189,94,68};
        int ma = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            ma = Math.max(arr[i],ma);
        }

        for(int place =1; ma/place >0;place *=10)
        {
            countingSort(arr,place);
        }

        System.out.println(Arrays.toString(arr));
    }
}

//T.C = O(d × (n + k))
//n = number of elements
//d = number of digits in the largest number
//k = range of digits (0–9 → k = 10)
//Since k = 10 (constant), we simplify:O(d × n)

//S.C = O(n + k), since k = 10 (constant), S.C = O(n);