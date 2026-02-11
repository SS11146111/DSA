package Sorting;

import java.util.Arrays;

public class Counting {

    private static int findMax(int[] arr)
    {
        int maxi = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maxi = Math.max(maxi,arr[i]);
        }

        return maxi;
    }

    public static void countingSort(int[] arr)
    {
        int k =0;
        int maxNum = findMax(arr);
        int[] countFreq = new int[maxNum+1];

        for(int num : arr)
        {
            countFreq[num]++;
        }
        //count={0,1,1,1,1,1,0,0,1,2,1}
        System.out.println("countFreq = " + Arrays.toString(countFreq));

        for(int i=1; i<countFreq.length; i++)
        {
            countFreq[i] = countFreq[i] + countFreq[i-1];
        }
        //count={0,1,2,3,4,5,5,5,6,8,9}
        System.out.println("countFreq' = " + Arrays.toString(countFreq));

        int[] temp = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--)
        {
            int position = countFreq[arr[i]]-1;
            temp[position] = arr[i];
            countFreq[arr[i]]--;
        }

        for(int num: temp)
        {
            arr[k++] = num;
        }


    }
    public static void main(String[] args) {

        int[] arr = {2,5,1,4,3,9,8,9,10};
        countingSort(arr);
        System.out.println("Sorted array = " + Arrays.toString(arr));

    }
}
