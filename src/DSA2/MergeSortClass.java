package DSA2;

import java.util.Arrays;

public class MergeSortClass
{

    void mergesort(int[] a, int s, int e) {
        if (s >= e) {
            return;
        } //base condition

        int m = (s + e) / 2; //divide

        mergesort(a, s, m);
        mergesort(a, m + 1, e);

        merge(a, s, m, e);
    }

    void merge(int[] arr, int s, int m, int e) {
        int i = s;
        int j = m + 1;
        int[] c = new int[e - s + 1];
        int k = 0;

        while (i <= m && j <= e)//i<=m && j<=e not i< m && j< e as we have started from s not 0
        {
            if (arr[i] <= arr[j]) {
                c[k] = arr[i];
                k++;
                i++;

            } else {
                c[k] = arr[j];
                k++;
                j++;
            }

        }
        while (i <= m) {
            c[k] = arr[i];
            k++;
            i++;
        }
        while (j <= e) {
            c[k] = arr[j];
            k++;
            j++;
        }

        k = 0;
        for (i = s; i <= e; i++) {
            arr[i] = c[k];
            k++;
        }
    }

public static void main(String[] args) {
    int arr[] = {1, 4, 5, 3, 8, 6, 9, 2, 3, 13, 1, 6};
    MergeSortClass sortobj = new MergeSortClass();
    sortobj.mergesort(arr, 0, arr.length - 1);
    System.out.println("Sorted Array: " + Arrays.toString(arr));
}
}
