package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {


    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();

        for (int iii : sourceList) {
            set.add((int) Math.pow(iii, 2));
        }

        NavigableSet<Integer> navigableSet = new TreeSet<>(set);


        return navigableSet.subSet(4, true, 25, true);
    }
}
