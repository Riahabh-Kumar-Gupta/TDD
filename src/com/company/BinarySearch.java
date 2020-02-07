package com.company;

public class BinarySearch {
    public int BinarySearchIteration(){
        InputReader inputReader = new InputReader();
        int[] data = inputReader.readfiles("input.txt");
        int n, k = 0;
        if (null == data) throw new AssertionError();
        n = data[0];
        int[] a = new int[n];
        for(int i=1;i<=n;i++){
            a[k++]=data[i];
        }
        int key=data[n+1];
        int l=0,r=data[0]-1,mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]>key)
                r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}
