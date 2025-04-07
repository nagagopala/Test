package com.learning.ProductMannaging.service;
public class BracketCombinations {
    public static int BracketCombinations(int num) {
        // Base case: if num is 0, there is one valid combination (no parentheses)
        if (num == 0) {
            return 1;
        }

        int total = 0;

        // Recursively calculate the number of valid combinations
        for (int i = 0; i < num; i++) {
            total += BracketCombinations(i) * BracketCombinations(num - i - 1);
            System.out.println("total check"+total);
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(BracketCombinations(2)); // Output: 5
    }
}