package com.mengyi.bytedance;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    private void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int tmp = low - 1;
        for(int i = low; i < high; i++){
            if(arr[i] <= pivot){
                tmp++;
                int t = arr[tmp];
                arr[tmp] = arr[i];
                arr[i] = t;
            }
        }
        int t = arr[tmp + 1];
        arr[tmp + 1] = arr[high];
        arr[high] = t;
        return tmp + 1;
    }
}
