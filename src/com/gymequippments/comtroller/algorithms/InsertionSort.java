package com.gymequippments.comtroller.algorithms;

import com.gymequippments.model.gymequippmentsmodel;
import java.util.List;

public class InsertionSort {
    public void performInsertionSort(List<gymequippmentsmodel> gymList) {
        int listSize = gymList.size();

        for (int step = 1; step < listSize; step++) {
            gymequippmentsmodel key = gymList.get(step);
            int j = step - 1;

            // Compare IDs and insert the key at the correct position
            while (j >= 0 && gymList.get(j).getID().compareTo(key.getID()) > 0) {
                gymList.set(j + 1, gymList.get(j));
                j--;
            }
            gymList.set(j + 1, key);
        }
    }
}
