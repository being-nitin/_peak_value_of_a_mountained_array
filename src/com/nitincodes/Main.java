package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// peak value of a mountain array:
        int[] arr = {12,13,14,15,16,10,9,8,7};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return arr[start];
}
}

