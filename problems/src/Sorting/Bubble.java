package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        int[] arr = {20,10,40,50,25,15};
        int temp;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

      /*  for(int k : arr)
        {
            System.out.print(k+ " ");
        }*/

        System.out.println(Arrays.toString(arr));

        //T.C = O(n^2), S.C = O(1);
    }
}
