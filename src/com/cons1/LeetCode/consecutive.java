package com.cons1.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class consecutive {

    public static int longest_flat(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else
                map.put(array[i], 1);
        }
        int max = Integer.MIN_VALUE;
        int prev = 0;
        int m = 0;
        for (int name : map.keySet())
        {
            // search  for value
            max = map.get(name);
            if(max > prev)
                m = max;
            prev = max;
        }
        return m;
    }


}
