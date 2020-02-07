package com.company;

public class Main {

    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        int[] data = inputReader.readfiles("input.txt");
        int n,k=0;
        assert null != data;
        n = data[0];
        int[] a = new int[n];
        for(int i=1;i<=n;i++){
            a[k++]=data[i];
        }
        int key=data[n+1];
        BinarySearch binarySearch;
        binarySearch = new BinarySearch();
        System.out.println(binarySearch.BinarySearchIteration());
    }


}