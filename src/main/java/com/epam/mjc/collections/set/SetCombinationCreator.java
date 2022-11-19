package com.epam.mjc.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> newSet = new HashSet<>();
        newSet.addAll(firstSet);
        newSet.addAll(secondSet);

        firstSet.retainAll(secondSet);
        firstSet.removeAll(thirdSet);

        thirdSet.removeAll(newSet);

        firstSet.addAll(thirdSet);

        return firstSet;
    }
}
