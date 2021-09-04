/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Ashley
 */


import java.util.Scanner;




public class Solution02 {


    /*
    ask for an input string
    place the input string into a string variable named "input"
    print out the input and how many characters it has
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String value = input.nextLine();

        System.out.print(value + " has " + value.length() + " characters");

    }
}
