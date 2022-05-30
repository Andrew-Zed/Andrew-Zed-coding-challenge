//package com.andrew;
//
////Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string has sufficient
////space at the end to hold the additional characters and that you are given the “true” length of the string.
//
//import java.util.Arrays;
//
//public class Main {
//
//    static void replaceSpaces(char[] str, int length) {
//        int spaceCount = 0, newLength, i;
//
//        for(i = 0; i < length; i++) {
//
//            if(str[i] == ' ') {
//                spaceCount++;
//            }
//        }
//        newLength = length + spaceCount * 2;
////        str[newLength] = '\0';
//        for(i = length - 1; i >= 0; i--){
//            if(str[i] == ' '){
//                str[newLength - 1] = '0';
//                str[newLength - 2] = '2';
//                str[newLength - 3] = '%';
//            } else {
//                str[newLength - 1] = str[i];
//                newLength = newLength -1;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
////        String test = "I am dog";
//        char[] array = {'I', ' ', 'a', 'm', ' ', 'd', 'o','g','\0','\0','\0','\0'};
//        replaceSpaces(array,8);
//        for (char i : array) {
//            System.out.println(i);
//        }
//    }
//
//}
