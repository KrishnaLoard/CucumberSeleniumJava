package com.krishnas.JavaProblems;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProblems {

    public static void main(String[] args) {
        System.out.println(new StringProblems().ReverseString("Hello"));
        System.out.println(new StringProblems().ReverseStringBuilder("Hello"));
        System.out.println(new StringProblems().CheckStringIfPalindrome("madamm"));
        System.out.println(new StringProblems().CheckPalindromeWithReverse("madam"));
        System.out.println(new StringProblems().GetDuplicates("Programming").toString());
        System.out.println(new StringProblems().CheckIfStringAnagram("Programmingg", "Programming"));
        System.out.print(new StringProblems().RemoveDuplicates("Programmingg"));
        System.out.println(new StringProblems().CountOccurrenceEachChar("Programmingg"));
        System.out.println(new StringProblems().FindFirstNonRepeatingChar("Programmingg"));
        System.out.println(new StringProblems().CheckIfStringContainsOnlyDigits("451"));
        System.out.println(new StringProblems().FindLongestSubStringLengthWithOutRepeat("abcabcbb"));
        System.out.println("String Rotation --> " + new StringProblems().CheckIfOneStringIsaRotationOfAnother("abcdeff", "abfcdef"));
        System.out.println("String Rotation --> " + new StringProblems().CheckIfOneStringIsaRotationOfAnother("abcdeff", "abfcdeff"));
        System.out.println("Remove All Spaces From String --> " + new StringProblems().RemoveAllSpacesFromString("Hello  World !! String"));
        System.out.println("String Compression --> " + new StringProblems().StringCompression("a3b4c5"));
        System.out.println(new StringProblems().ConvertStringToTitleCase("hello world checking line title"));
        System.out.println("Most Repeated Char in String --> " + new StringProblems().FindMostRepeatedCharacter("sample sentence"));
        System.out.println("Numbers of Vowels --> " + new StringProblems().CountNumberOfVowels("KishanBheemajiyani"));
        System.out.println("Find the Letter Digits and Symbols --> " + new StringProblems().CountNumberOfLettersDigitsAndSymbols("KishanBheemajiyani_&KKK"));
        System.out.println("Length of Last Word in Line --> " + new StringProblems().FindTheLengthOfTheLastWordInString("Hello World Getting"));
        System.out.println("Remove Duplicates --> " + new StringProblems().RemoveDuplicateCharsFromString("HelloWorld"));
        new StringProblems().FindPermutationOfString("", "abc");
        System.out.println("Check if String has Unique Chars --> " + new StringProblems().CheckIfAStringHasAllUniqueCharacters("Faxx"));
        String input = "hello,world,java,Testing";
        String delimiter = ",";
        System.out.println("Reverse Results --> " + new StringProblems().SplitAStringByDelimiterAndReverseEachWord(input, delimiter));
    }

    public String ReverseString(String Reverse) {

        var stringBuffer = new StringBuilder();
        for (int i = Reverse.length() - 1; i >= 0; i--) {
            stringBuffer.append(Reverse.charAt(i));
        }
        return stringBuffer.toString();
    }

    public String ReverseStringBuilder(String Reverse) {
        var stringBuffer = new StringBuilder(Reverse);
        return stringBuffer.reverse().toString();
    }

    public boolean CheckStringIfPalindrome(String palindrome) {
        StringBuilder stringBuilder = new StringBuilder(palindrome);
        return palindrome.contentEquals(stringBuilder.reverse());
    }

    public boolean CheckPalindromeWithReverse(String Palindrome) {
        String reverseString = ReverseStringBuilder(Palindrome);
        return reverseString.equals(Palindrome);
    }

    public List<String> GetDuplicates(String Duplicate) {
        List<String> listString = new ArrayList<String>();
        Map<Character, Integer> getDuplicates = new HashMap<Character, Integer>();

        for (char c : Duplicate.toCharArray()) {
            getDuplicates.put(c, getDuplicates.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entries : getDuplicates.entrySet()) {
            if (entries.getValue() > 1) {
                listString.add(entries.getKey() + "");
            }
        }
        return listString;
    }

    public boolean CheckIfStringAnagram(String str1, String str2) {
        char[] stringChara = str1.toCharArray();
        char[] stringChars = str2.toCharArray();
        Arrays.sort(stringChars);
        Arrays.sort(stringChara);

        return Arrays.equals(stringChara, stringChars);
    }

    public char[] RemoveDuplicates(String strDuplicate) {
        Map<Character, Integer> getMapinteger = new HashMap<Character, Integer>();
        for (char c : strDuplicate.toCharArray()) {
            getMapinteger.put(c, getMapinteger.getOrDefault(c, 0) + 1);
        }

        var bufferReader = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : getMapinteger.entrySet()) {
            if (entry.getValue() == 1)
                bufferReader.append(entry.getKey());
        }
        return bufferReader.toString().toCharArray();
    }

    public boolean CountOccurrenceEachChar(String strDuplicate) {
        Map<Character, Integer> getMapInteger = new HashMap<Character, Integer>();
        for (char c : strDuplicate.toCharArray()) {
            getMapInteger.put(c, getMapInteger.getOrDefault(c, 0) + 1);
        }
        System.out.println();
        for (Map.Entry<Character, Integer> entries : getMapInteger.entrySet()) {
            System.out.print(entries.getKey() + ":" + entries.getValue() + ", ");
        }
        System.out.println();
        return true;
    }

    public char FindFirstNonRepeatingChar(String strFirstSingle) {
        Map<Character, Integer> getMapInteger = new LinkedHashMap<Character, Integer>();
        for (char c : strFirstSingle.toCharArray()) {
            getMapInteger.put(Character.toLowerCase(c), getMapInteger.getOrDefault(Character.toLowerCase(c), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entries : getMapInteger.entrySet()) {
            if (entries.getValue() == 1) {
                return entries.getKey();
            }
        }
        return '0';
    }

    public boolean CheckIfStringContainsOnlyDigits(String strFirstChar) {
        String pattern = "\\d+";
        Pattern matchPattern = Pattern.compile(pattern);
        Matcher matcher = matchPattern.matcher(strFirstChar);
        return matcher.matches();
    }

    public int FindLongestSubStringLengthWithOutRepeat(String strSubString) {
        int left = 0;
        int maxlength = 0;
        Set<Character> setForm = new HashSet<Character>();
        for (int right = 0; right < strSubString.length(); right++) {
            if (setForm.contains(strSubString.charAt(right))) {
                setForm.remove(strSubString.charAt(left));
                left++;
            }
            setForm.add(strSubString.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
        }
        setForm.forEach(System.out::print);
        System.out.println();
        return maxlength;
    }

    public boolean CheckIfOneStringIsaRotationOfAnother(String firstString, String SecondString) {
        char[] array1 = firstString.toCharArray();
        char[] array2 = SecondString.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public String RemoveAllSpacesFromString(String StrWholeString) {
        return StrWholeString.replaceAll("\\s+", "");
    }

    public String StringCompression(String StrCompressionString) {
        var IndividualString = new StringBuilder();
        for (int i = 0; i <= StrCompressionString.length() - 2; i += 2) {
            System.out.println("Individual Pairs --> " + StrCompressionString.substring(i, i + 2));
            char[] eachPair = StrCompressionString.substring(i, i + 2).toCharArray();
            IndividualString.append(String.valueOf(eachPair[0]).repeat(Math.max(0, eachPair[1] - '0')));
        }
        return IndividualString.toString();
    }

    public String ConvertStringToTitleCase(String LineString) {
        String[] Array1 = LineString.split(" ");
        var strBuilder = new StringBuilder();
        for (String Str : Array1) {
            String line = Character.toUpperCase(Str.charAt(0)) + Str.substring(1) + " ";
            strBuilder.append(line);
        }
        return strBuilder.toString();
    }

    public String FindMostRepeatedCharacter(String InputString) {
        int max = 0;
        String maxStr = "";
        Map<Character, Integer> getCounts = ReusableMethodsJava.CountCharInString(InputString);
        for (char ch : InputString.toCharArray()) {
            if (Character.isWhitespace(ch)) continue;
            if (getCounts.get(ch) > max) {
                max = getCounts.get(ch);
                maxStr = ch + "";
            }
        }
        return maxStr;
    }

    public int CountNumberOfVowels(String StrInput) {
        int vowels = 0;
        int constants = 0;
        for (char ch : StrInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels += 1;

                } else {
                    constants += 1;
                }
            }
        }
        return vowels;
    }

    public String CountNumberOfLettersDigitsAndSymbols(String StrInput) {
        int Letters = 0;
        int Digits = 0;
        int OtherSymbol = 0;
        for (char ch : StrInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                Letters += 1;
            } else if (Character.isDigit(ch)) {
                Digits++;
            } else if (Character.OTHER_SYMBOL == Character.getType(ch) || Character.MODIFIER_SYMBOL == Character.getType(ch)
                    || Character.MATH_SYMBOL == Character.getType(ch) || Character.CURRENCY_SYMBOL == Character.getType(ch)
                    || Character.OTHER_PUNCTUATION == Character.getType(ch)) {
                OtherSymbol++;
            }
        }
        return Letters + "_" + Digits + "_" + OtherSymbol;
    }

    public int FindTheLengthOfTheLastWordInString(String InputLine) {
        String[] LineArray = InputLine.split(" ");
        return LineArray[LineArray.length - 1].length();
    }

    public String RemoveDuplicateCharsFromString(String InputString) {
        Set<Character> CharString = new HashSet<Character>();
        for (char ch : InputString.toCharArray()) {
            CharString.add(ch);
        }
        //System.out.println(CharString);
        return Arrays.toString(CharString.toArray());
    }


    public void FindPermutationOfString(String Prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(Prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                char CurrentCat = remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                FindPermutationOfString(Prefix + CurrentCat, newRemaining);
            }
        }
    }

    public boolean CheckIfAStringHasAllUniqueCharacters(String UniqueCharsString) {
        Map<Character, Integer> GetCounts = ReusableMethodsJava.CountCharInString(UniqueCharsString);
        for (Map.Entry<Character, Integer> Entries : GetCounts.entrySet()) {
            if (Entries.getValue() > 1) {
                return false;
            }
        }
        return true;
    }

    public String SplitAStringByDelimiterAndReverseEachWord(String strString, String delimiter) {
        String[] ArrayString = strString.split(delimiter);
        var builderString = new StringBuilder();
        for (String Str : ArrayString) {
            builderString.append(ReusableMethodsJava.ReverseString(Str));
            builderString.append(delimiter);
        }
        return builderString.toString();
    }

}