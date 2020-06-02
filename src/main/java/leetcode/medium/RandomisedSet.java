package leetcode.medium;

import java.util.*;

/**
 * 380. Insert Delete GetRandom O(1) -> (https://leetcode.com/problems/insert-delete-getrandom-o1/)
 */
public class RandomisedSet {

    List<Integer> list;
    Map<Integer, Integer> map;

    public RandomisedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }


    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }


    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;

        int lastElement = list.get(list.size() - 1);
        int indexToBeRemoved = map.get(val);

        if (indexToBeRemoved != list.size()-1) {
            list.set(indexToBeRemoved, lastElement);
            map.put(lastElement, indexToBeRemoved);
        }

        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }

    public int getRandom() {
        Random rand = new Random();
        int randomNum = rand.nextInt(list.size());
        return list.get(randomNum);
    }
}

