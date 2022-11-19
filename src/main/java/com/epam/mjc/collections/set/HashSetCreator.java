package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (int iii : sourceList) {
            if (iii % 2 == 0) {
                set.add(iii);
                 do {
                     iii /= 2;
                     set.add(iii);
                } while (iii % 2 == 0);
            } else {
                set.add(iii);
                set.add(iii * 2);
            }
        }
        return set;
    }
}
