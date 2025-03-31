package com.leetcode.StringSamples;

public class StringToIntegerAlgo {

    public static int StringtoInteger(@org.jetbrains.annotations.NotNull String str){
        int i = 0;
        int n = str.length();
        int sign = 1;
        int result = 0;

        while (i < n && ' ' == str.charAt(i)){
            i++;
        }

        if(i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')){
            if (str.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        while (i < n){
            if(!Character.isDigit(str.charAt(i)) && str.charAt(i) != '+' && str.charAt(i) != '-'){
                i++;
                continue;
            }else if(str.charAt(i) == '+' || str.charAt(i) == '-'){
                if (str.charAt(i) =='-'){
                    sign = -1;
                    i++;
                    continue;
                }
            }
            int digit = str.charAt(i) - '0';
            if(result > (Integer.MAX_VALUE - digit) / 10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        //System.out.println(StringtoInteger("Words Can be Worked +8951154"));
        System.out.println(StringtoInteger("Worked -8951154"));
    }
}
