package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> targetMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> pair : sourceMap.entrySet()) {
            Integer val = pair.getKey();
            String key = pair.getValue();

            targetMap.putIfAbsent(key, val);
            targetMap.computeIfPresent(key, (k, v) -> val < v ? val : v);
        }

        return targetMap;
    }
}
