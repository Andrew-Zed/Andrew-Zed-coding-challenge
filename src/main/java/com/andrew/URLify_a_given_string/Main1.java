package com.andrew.URLify_a_given_string;

import static com.andrew.URLify_a_given_string.Solution1.replaceSpaces;

public class Main1 {
    public static void main(String[] args) {
        char[] str = "Mr John Smith".toCharArray();

        // Prints the replaced string
        str = replaceSpaces(str);

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }
}
