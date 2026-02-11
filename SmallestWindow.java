package com.java.javacodingprograms.Strings;
import java.util.HashMap;
import java.util.Map;

public class SmallestWindow {
    public static void main(String[] args) {
        String str1 = "this is a test string";
        String str2 = "tist";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int requiredChars = map.size();
        int formedChars = 0;
        int windowStart = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int minWindowStart = 0;
        Map<Character, Integer> windowMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str1.length(); windowEnd++) {
            char charEnd = str1.charAt(windowEnd);
            windowMap.put(charEnd, windowMap.getOrDefault(charEnd, 0) + 1);
            if (map.containsKey(charEnd) && windowMap.get(charEnd).equals(map.get(charEnd))) {
                formedChars++;
            }
            while (windowStart <= windowEnd && formedChars == requiredChars) {
                if (windowEnd - windowStart + 1 < minWindowSize) {
                    minWindowSize = windowEnd - windowStart + 1;
                    minWindowStart = windowStart;
                }
                char charStart = str1.charAt(windowStart);
                windowMap.put(charStart, windowMap.get(charStart) - 1);
                if (map.containsKey(charStart) && windowMap.get(charStart) < map.get(charStart)) {
                    formedChars--;
                }
                windowStart++;
            }
        }
        System.out.println("Smallest Window: " + str1.substring(minWindowStart, minWindowStart + minWindowSize));
    }
}

