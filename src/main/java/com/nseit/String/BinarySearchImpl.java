package com.nseit.String;



public class BinarySearchImpl {
    private SortAlg quicksort;

    public int binarySearch(int[] numbers, int numberToSearch) {
        //BubbleSortAlg bubblesort = new BubbleSortAlg();
        QuickSort quickSort = new QuickSort();
        int[] sortedNumbers = quicksort.sort(numbers);
        return 12;
    }
}
