/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymequippments.comtroller.algorithms;


import com.gymequippments.model.gymequippmentsmodel;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author SHUBHAM BHATTA
 */
public class BinarySearch {
public void sortByName(List<gymequippmentsmodel> euiplist) {
        // Sort the list using a custom comparator that compares names
        Collections.sort(euiplist, new Comparator<gymequippmentsmodel>() {
            @Override
            public int compare(gymequippmentsmodel equipment1, gymequippmentsmodel equipment2) {
                return equipment1.getName().compareToIgnoreCase(equipment2.getName());
            }
        });
    }

    // Method to search for an equipment by Name using Binary Search
    public gymequippmentsmodel searchByName(String searchValue, List<gymequippmentsmodel> euiplist,
            int left, int right) {

        if (right < left) {
            return null;
        }

        int mid = (left + right) / 2;

        // Compare searchValue with the equipment name (ignoring case)
        if (searchValue.toLowerCase().equals(euiplist.get(mid).getName().toLowerCase())) {
            return euiplist.get(mid);
        } else if (searchValue.compareToIgnoreCase(euiplist.get(mid).getName()) < 0) {
            return searchByName(searchValue, euiplist, left, mid - 1);
        } else {
            return searchByName(searchValue, euiplist, mid + 1, right);
        }
    }
}