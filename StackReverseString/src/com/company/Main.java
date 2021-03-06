/*
Name: Rick
Date: 2020-02-21

A modified second year Data Structures assignment. Reversing a string is a basic programming skill so I thought
it would be fun to over-complicate the processes using a Stack.

 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyStackException {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = scanner.nextLine();

        ReverseString s = new ReverseString(str);
        s.reverseString();
        scanner.close();

    }
}
