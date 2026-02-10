package Sorting;

import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {

        int[] arr = {10,20,40,15,5};
        int n =arr.length;
        int key;

        for(int i=1;i<n;i++)
        {
            key=arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}

/* T.C
* Best case :O(N)
* Avg/Worst case (elements sorted in reverse order): O(N^2)
*
* S.C
* O(1)
* */
