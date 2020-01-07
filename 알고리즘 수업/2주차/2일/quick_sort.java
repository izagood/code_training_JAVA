package week02.d2.ch3;

import java.util.Arrays;

public class QuickSort {
    void quick_sort(int[] data, int l, int r) {

        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];

        do {
            while (data[left] < pivot)
                left++;
            while (data[right] > pivot)
                right--;
            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }

        } while (left <= right);
        if (l < right)
            quick_sort(data, l, right);
        if (r > left)
            quick_sort(data, left, r);

    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();

        int[] arr = {4 , 5 , 6, 3, 2, 1};

        qs.quick_sort(arr, 0,arr.length-1);

        System.out.println(Arrays.toString(arr));



    }
}
