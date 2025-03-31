package com.krishnas.JavaProblems;

import java.util.HashMap;
import java.util.Map;

public class ReusableMethodsJava {
    public static Map<Character, Integer> CountCharInString(String LineString) {
        LineString = LineString.replaceAll("\\s+", "");
        Map<Character, Integer> getCounts = new HashMap<>();
        for (char ch : LineString.toCharArray()) {
            getCounts.put(ch, getCounts.getOrDefault(ch, 0) + 1);
        }
        return getCounts;
    }

    public static String ReverseString(String strInput) {
        return new StringBuilder(strInput).reverse().toString();
    }
}
