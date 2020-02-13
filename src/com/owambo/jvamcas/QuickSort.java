package com.owambo.jvamcas;

public class QuickSort {

    public void swap(int[]nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int partition(int[]nums,int lo, int hi){

        int pivot = nums[hi];
        int i = lo;//keeps track of the eventual position of the pivot
        for(int j = lo; j < hi; j++){

            if(nums[j] < pivot){
                swap(nums,i,j);
                i++;
            }
        }swap(nums,i,hi);
        return i;//return pivot position

    }
    public void quickSort(int[]nums,int lo, int hi){

        if(lo < hi){
            int pi = partition(nums,lo,hi);

            quickSort(nums,lo, pi - 1);//sort partition left of pivot;
            quickSort(nums,pi + 1, hi);//sort partition right of pivot;
        }
    }
}
