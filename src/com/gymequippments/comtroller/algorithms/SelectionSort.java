package com.gymequippments.comtroller.algorithms;

import com.gymequippments.model.gymequippmentsmodel;
import java.util.List;

/**
 *
 * @author SHUBHAM BHATTA
 */


public class SelectionSort {
    public void performSelectionSort(List<gymequippmentsmodel> gymList) {
        int listSize = gymList.size();

        for (int step = 0; step < listSize - 1; step++) {
            int minIndex = step;

            for (int next = step + 1; next < listSize; next++) {
                // Compare string properties (e.g., modelName) lexicographically
                if (gymList.get(next).getName().compareTo(gymList.get(minIndex).getName()) < 0) {
                    minIndex = next;
                }
            }

            // Swap
            gymequippmentsmodel tempgymmodel = gymList.get(step);
            gymList.set(step, gymList.get(minIndex));
            gymList.set(minIndex, tempgymmodel);
        }
    }
}
