package com.gfs.exercise;

public class Main {

    public static void main(String[] args) {

        final Palindrome palindrome = new Palindrome();
        String testString = "race a car";

        System.out.println(testString + " is an palindrome = " + palindrome.determineIsAnPalindrome(testString));

    }
}
