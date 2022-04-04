package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        //3
        List<String> words = new ArrayList<>(List.of("pudge", "puck", "marsi", "marsi", "puck", "bane", "mars", "mars"));
        printOddNumbers(nums);
        //2
        printSortedUniqueEvenNumbers(nums);
        //3
        printUniqueWords(words);
        //4
        printNumberDuplicates(words);
    }
    public static void printOddNumbers(List<Integer> nums) {
        for (int num : nums) {
            if(num % 2 !=0) {
                System.out.println(num);
            }
        }
    }
    //2
    public static void printSortedUniqueEvenNumbers(List<Integer> nums) {
        Set<Integer> uniqueElements = new TreeSet<>(nums);
        uniqueElements.removeIf(num -> num % 2 !=0);
        for(Integer num : uniqueElements) {
            System.out.println(num + " ");
        }
    }
    //3
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        List<String> duplicateWords = new ArrayList<>(words);
        for(String uniqueWord : uniqueWords) {
            duplicateWords.remove(uniqueWord);
        }
        uniqueWords.removeAll(duplicateWords);
        System.out.println(uniqueWords);
    }
    //4
    public static void printNumberDuplicates(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}
