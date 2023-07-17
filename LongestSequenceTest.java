package com.aurionpro.test;
public class LongestSequenceTest {
    
    public static void main(String[] args) {
        String input = "siddhi";
        String longestSequence = findLongestSequence(input);
        
        System.out.println("Input: " + input);
        System.out.println("Longest sequence: " + longestSequence);
    }
    
    public static String findLongestSequence(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        
        char prevChar = '\0';
        char currentChar;
        int currentCount = 0;
        int maxCount = 0;
        
        StringBuilder longestSequence = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);
            
            if (currentChar == prevChar) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            
            if (currentCount > maxCount) {
                maxCount = currentCount;
                longestSequence.setLength(0);
                longestSequence.append(currentChar);
            } else if (currentCount == maxCount) {
                longestSequence.append(currentChar);
            }
            
            prevChar = currentChar;
        }
        
        return longestSequence.toString();
    }
}
