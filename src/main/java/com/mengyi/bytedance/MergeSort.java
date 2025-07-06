package com.mengyi.bytedance;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] tmp = new int[arr.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.split(arr, 0, arr.length - 1, tmp);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private void split(int[] arr, int left, int right, int[] tmp){
        if(left < right){
            int mid = left + (right - left) / 2;
            split(arr, left, mid, tmp);
            split(arr, mid + 1, right, tmp);
            merge(arr, left, mid, right, tmp);
        }
    }
    private void merge(int[] arr, int left, int mid, int right, int[] tmp){
        for(int i = left; i <= right; i++){
            tmp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid && j <= right){
            if(tmp[i] <= tmp[j]){
                arr[k++] = tmp[i++];
            }else{
                arr[k++] = tmp[j++];
            }
        }
        while(i <= mid){
            arr[k++] = tmp[i++];
        }
        while(j <= right){
            arr[k++] = tmp[j++];
        }
    }
}
