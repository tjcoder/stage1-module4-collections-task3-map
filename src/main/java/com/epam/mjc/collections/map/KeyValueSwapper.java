package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> targetMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> pair : sourceMap.entrySet()) {
            Integer key = pair.getKey();
            String val = pair.getValue();

            if (!targetMap.containsKey(val)) {
                targetMap.put(val, key);
            }
        }

        return targetMap;
    }
}
