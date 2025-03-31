package com.krishnas.JavaProblems;

import java.util.*;

public class ArrayProblemsVariety {

    public static void main(String[] args) {
        int x = 10; // You can change this to any size
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("Get Method Second High Integer --> " + new ArrayProblemsVariety().GetSecondLargestElementInArray(arr));
        System.out.println("Get Method High Integer --> " + new ArrayProblemsVariety().GetLargestElementInArray(arr));
        System.out.println("Get Method Smallest Integer --> " + new ArrayProblemsVariety().GetSmallestAndLargestElement(arr));
        System.out.println("Check If the Array Sorted --> " + new ArrayProblemsVariety().CheckIfAnArrayIsSorted(arr));
        System.out.println("Descending Array --> " + new ArrayProblemsVariety().ReverseAnArray(arr));
        System.out.println("Sum of Elements Array --> " + new ArrayProblemsVariety().FindSumOfElementInTheArray(arr));
        int Y = 15;
        char[] chars = new char[Y];
        Arrays.fill(chars, 'A');
        System.out.println("Find the Frequency --> " + new ArrayProblemsVariety().CountFrequencyOfEachCharsInArray(chars));
        char[] charString = new char[]{'a', 'b', 'a', 'c', 'd'};
        System.out.println("Get Count of Chars in Array --> " + new ArrayProblemsVariety().FindDuplicateElementsInArray(charString));

        int Z = 15;
        int[] ZIntegers = new int[Z];
        for (int i = 0; i < Z; i++) {
            ZIntegers[i] = i;
        }
        ZIntegers[4] = 3;
        System.out.println("Find Missing Number --> " + new ArrayProblemsVariety().CheckMissingNumberFromArray(ZIntegers));

        ZIntegers[2] = 0;
        ZIntegers[3] = 0;
        System.out.println("Move Element to the Zero --> " + Arrays.toString(new ArrayProblemsVariety().MoveZerosToTheLast(ZIntegers)));

        for (int i = 0; i < Z; i++) {
            ZIntegers[i] = i + 1;
        }
        ZIntegers[2] = 0;
        ZIntegers[3] = 0;
        System.out.println("Move Element to the Zero With Order Change --> " + Arrays.toString(new ArrayProblemsVariety().MoveZerosToLastWithOutChangingOrder(ZIntegers)));

        System.out.println("Reminder Method --> " + new ArrayProblemsVariety().LeftRotateMethodOutPut(ZIntegers, 20));

        for (int i = 0; i < Z; i++) {
            ZIntegers[i] = i + 1;
        }
        new ArrayProblemsVariety().LeftToRightRotateForTheArray(ZIntegers, 20);

        int[] RotationArray = new ArrayProblemsVariety().CopyFromIndexWrapIndex(ZIntegers, 0);
        System.out.println("Copy From Array Index --> " + Arrays.toString(RotationArray));

        int[] RotationArraySecond = new ArrayProblemsVariety().CopyFromIndexWrapIndex(RotationArray, 5);
        System.out.println("Copy From Array Index --> " + Arrays.toString(RotationArraySecond));

        int[] newInteger = new int[]{5, 7, 8, 5, 9, 1};
        System.out.println("Reminder Update --> " + new ArrayProblemsVariety().FindTheLeaderElementInArray(newInteger));
    }

    public int GetSecondLargestElementInArray(int[] ArrayInput) {
        Arrays.sort(ArrayInput);
        System.out.println(Arrays.toString(ArrayInput));
        return ArrayInput[ArrayInput.length - 2];
    }

    public int GetLargestElementInArray(int[] ArrayInput) {
        Arrays.sort(ArrayInput);
        System.out.println(Arrays.toString(ArrayInput));
        return ArrayInput[ArrayInput.length - 1];
    }

    public int GetSmallestAndLargestElement(int[] ArrayInput) {
        Arrays.sort(ArrayInput);
        System.out.println(Arrays.toString(ArrayInput));
        return ArrayInput[0];
    }

    public boolean CheckIfAnArrayIsSorted(int[] ArrayInput) {
        int[] CopyArray = Arrays.copyOf(ArrayInput, ArrayInput.length);
        Arrays.sort(ArrayInput);
        return Arrays.equals(ArrayInput, CopyArray);
    }

    public List<Integer> ReverseAnArray(int[] ArrayInput) {
        List<Integer> ListIntegers = new ArrayList<Integer>();
        for (int a : ArrayInput) {
            ListIntegers.add(a);
        }
        ListIntegers.sort(Collections.reverseOrder());
        return ListIntegers;
    }

    public int FindSumOfElementInTheArray(int[] ArrayInput) {
        int Sum = 0;
        for (int a : ArrayInput) {
            Sum = Sum + a;
        }
        return Sum;
    }

    public String CountFrequencyOfEachCharsInArray(char[] charArray) {
        Map<Character, Integer> MapInteger = new HashMap<>();
        for (char ch : charArray) {
            MapInteger.put(ch, MapInteger.getOrDefault(ch, 0) + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : MapInteger.entrySet()) {
            String CountString = entry.getKey() + ":" + entry.getValue() + ",";
            stringBuilder.append(CountString);
        }
        return stringBuilder.toString();
    }

    public String FindDuplicateElementsInArray(char[] charArray) {
        Map<Character, Integer> MapInteger = ReusableMethodsJava.CountCharInString(Arrays.toString(charArray));
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Character, Integer> entries : MapInteger.entrySet()) {
            String appendString = entries.getKey() + ":" + entries.getValue() + ",";
            builder.append(appendString);
        }
        return builder.toString();
    }

    public boolean CheckMissingNumberFromArray(int[] ArrayIntegers) {
        Arrays.sort(ArrayIntegers);
        for (int i = 0; i < ArrayIntegers.length; i++) {
            if (ArrayIntegers[i] != i) {
                System.out.println("Missing Number --> " + i);
                return false;
            }
        }
        System.out.println("NO Missing Number");
        return true;
    }

    public int[] MoveZerosToTheLast(int[] ArrayListIntegers) {
        int Right = ArrayListIntegers.length - 1;
        for (int i = 0; i < ArrayListIntegers.length / 2; i++) {
            if (ArrayListIntegers[i] == 0) {
                int temp = ArrayListIntegers[Right];
                ArrayListIntegers[Right] = 0;
                ArrayListIntegers[i] = temp;
                Right--;
            }
        }
        return ArrayListIntegers;
    }

    public int[] MoveZerosToLastWithOutChangingOrder(int[] ArrayIntegers) {
        int IndexPointer = 0;
        for (int in : ArrayIntegers) {
            if (in != 0) {
                ArrayIntegers[IndexPointer++] = in;
            }
        }
        while (IndexPointer < ArrayIntegers.length) {
            ArrayIntegers[IndexPointer++] = 0;
        }
        return ArrayIntegers;
    }

    public int LeftRotateMethodOutPut(int[] ArrayInt, int RotationNumber) {
        int M = 0;
        if (RotationNumber > ArrayInt.length) {
            M = RotationNumber % ArrayInt.length;
        } else {
            M = RotationNumber;
        }
        System.out.println("Reminder " + M);
        return M;
    }

    public void LeftToRightRotateForTheArray(int[] ArrayInt, int RotationNumber) {
        int M = LeftRotateMethodOutPut(ArrayInt, RotationNumber);
        int[] ArrayCopy = new int[ArrayInt.length];
        int Start = 0;
        for (int i = M; i < ArrayInt.length; i++) {
            ArrayCopy[Start] = ArrayInt[Start + M];
            Start++;
        }
        Start = ArrayInt.length - M;
        for (int i = 0; i < M; i++) {
            ArrayCopy[Start] = ArrayInt[i];
            Start++;
        }
        System.out.println("Left Rotate M --> " + Arrays.toString(ArrayCopy));
    }

    public int[] CopyFromIndexWrapIndex(int[] ArrayInt, int StartIndex) {
        int[] ArrayList = new int[ArrayInt.length];
        int Length = ArrayInt.length;
        for (int i = 0; i < Length; i++) {
            ArrayList[i] = ArrayInt[(StartIndex + i) % Length];
        }
        return ArrayList;
    }

    public int FindTheLeaderElementInArray(int[] ArrayListMethod) {
        int LeadMax = ArrayListMethod[0];
        for (int i = 0; i < ArrayListMethod.length - 1; i++) {
            LeadMax = ArrayListMethod[i];
            boolean flag = false;
            for (int j = i + 1; j < ArrayListMethod.length; j++) {
                if (ArrayListMethod[j] > LeadMax) {
                    break;
                } else if (ArrayListMethod[j] < LeadMax) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("This One is High --> " + ArrayListMethod[i]);
            }
        }
        return LeadMax;
    }


}
