package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> counterMap = new HashMap<>();

        String[] words = sentence.split(" ");
        for (String word : words) {
            word = word.toLowerCase().trim().replaceAll("[^\\p{L}]", "");
            if (word.isBlank()) continue;

            if (counterMap.containsKey(word)) {
                var count = counterMap.get(word);
                counterMap.put(word, count + 1);
            } else {
                counterMap.put(word, 1);
            }
        }

        return counterMap;
    }
}
