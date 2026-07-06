package org.yourcompany.mfwmorningjune26.multithreading.callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort,ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws InterruptedException, ExecutionException {
        System.out.println("Executing: " + arrayToSort  + " Thread: " + 
            Thread.currentThread().getName()
        );

        // S1. Breaking condition
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        // S2. Find mid
        int mid = arrayToSort.size() / 2;
         // [1,2,3,4,5,6,7,8,9]

        // S3. Create left array -- [1,2*,3,4]
        List<Integer> leftArray = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }

        // S4. Create right array -- [5,6,7,8,9]
        List<Integer> rightArray = new ArrayList<>();
        for (int i = mid; i < arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }
       

        // Recursive calls (No multithreading)
        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);


        Future<List<Integer>> leftSortedArrayFuture = executorService
            .submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService
            .submit(rightMergeSorter);


        // Merge step [1], [2]
        List<Integer> sortedArray = new ArrayList<>();
        List<Integer> leftSortedArray = leftSortedArrayFuture.get(); // BLOCKING CALL.
        List<Integer> rightSortedArray = rightSortedArrayFuture.get(); // BLOCKING CALL.
        int i = 0;
        int j = 0;
        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i++));
            } else {
                sortedArray.add(rightSortedArray.get(j++));
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i++));
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j++));
        }

        return sortedArray;
    }
}
