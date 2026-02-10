package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {

        int[] arr = {15, 20, 5, 45, 30, 10};
        int n = arr.length;
        int temp;

        for(int i =0;i<n;i++)
        {
            int minIndex = i;

            for(int j =i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

//T.C = O(n^2), S.C = O(1);
