package com.gymequippments.controller.algorithms;

import com.gymequippments.model.gymequippmentsmodel;
import java.util.List;

public class MergeSort {
    public void performMergeSort(List<gymequippmentsmodel> gymList, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort both halves
            performMergeSort(gymList, left, mid);
            performMergeSort(gymList, mid + 1, right);

            // Merge the sorted halves
            merge(gymList, left, mid, right);
        }
    }

    private void merge(List<gymequippmentsmodel> gymList, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        // Create temporary arrays
        gymequippmentsmodel[] leftArray = new gymequippmentsmodel[leftSize];
        gymequippmentsmodel[] rightArray = new gymequippmentsmodel[rightSize];

        for (int i = 0; i < leftSize; i++)
            leftArray[i] = gymList.get(left + i);
        for (int j = 0; j < rightSize; j++)
            rightArray[j] = gymList.get(mid + 1 + j);

        int i = 0, j = 0, k = left;

        // Merge the temporary arrays back into gymList
        while (i < leftSize && j < rightSize) {
            // Compare brands lexicographically as Strings
            String leftBrand = leftArray[i].getBrand();
            String rightBrand = rightArray[j].getBrand();

            // Compare lexicographically
            if (leftBrand.compareTo(rightBrand) <= 0) {
                gymList.set(k, leftArray[i]);
                i++;
            } else {
                gymList.set(k, rightArray[j]);
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray
        while (i < leftSize) {
            gymList.set(k, leftArray[i]);
            i++;
            k++;
        }

        // Copy remaining elements of rightArray
        while (j < rightSize) {
            gymList.set(k, rightArray[j]);
            j++;
            k++;
        }
    }
}
