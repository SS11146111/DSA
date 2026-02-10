package Sorting;

import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {

            int mid = (start + end)/2;
            // sort left half
            mergeSort(arr, start, mid);
            // sort right half
            mergeSort(arr, mid + 1, end);
            // merge both halves
            combine(arr, start, mid, end);
        }
    }

    public static void combine(int[] arr, int start, int mid, int end)
    {
        int totalLength = end - start + 1;
        int[] c = new int[totalLength];

        int i=start, j= mid+1, k=0;

        while(i<=mid || j<=end)
        {
            if(i<=mid && j<=end)
            {
                if(arr[i]<arr[j])
                {
                    c[k] = arr[i];
                    k++;
                    i++;
                }
                else
                {
                    c[k] = arr[j];
                    k++;
                    j++;
                }
            }
            else if (i>mid && j<=end)
            {
                c[k] = arr[j];
                k++;
                j++;
            }
            else if(j>end && i<=mid)
            {
                c[k] = arr[i];
                i++;
                k++;
            }

        }

        for(int z=0;z<totalLength;z++)
        {
            arr[start+z] = c[z];
        }
    }
    public static void main(String[] args) {
        int[] arr = {15, 20, 5, 45, 30, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

//T.C = O(n*logn), S.C = O(n)
