package Sorting;

import java.util.Arrays;

public class MergeOperation {

    public static void main(String[] args) {
         int[] a = {2,5,9,13,19};
         int[] b = {7,8,10,16};
         int n = a.length;
         int m = b.length;
         int[] c = new int[n+m];
         int i=0,j=0,k=0;

         while(i<n || j<m)
         {
             if(i<n && j<m)
             {
                 if(a[i]<b[j])
                 {
                     c[k] = a[i];
                     k++;
                     i++;
                 }
                 else
                 {
                     c[k] = b[j];
                     k++;
                     j++;
                 }
             }
             else if (i>=n && j<m)
             {
                 c[k] = b[j];
                 k++;
                 j++;
             }
             else if(j>=m && i<n)
             {
                 c[k] = a[i];
                 i++;
                 k++;
             }
         }

         System.out.println(Arrays.toString(c));
    }
}
