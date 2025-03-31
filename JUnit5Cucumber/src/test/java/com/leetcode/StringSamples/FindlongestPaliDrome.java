package com.leetcode.StringSamples;

public class FindlongestPaliDrome {
    public static void main(String[] args) {
        System.out.println("Long Pali --> "+longestPalindrome("ababaca"));
        System.out.println("Long Pali --> "+longestPalindrome("aaaabaaaa"));
    }

    public static String longestPalindrome(String str) {
        if (str == null || str.isEmpty()) return "";

        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i + 1);
            int maxLen = Math.max(len2, len1);

            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return str.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
