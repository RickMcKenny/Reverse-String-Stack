/*
Name: Rick McKenny
Date: 2020-02-21

Simple throw away program to reverse a String.
 */

package com.company;

public class ReverseString {
    private MyStack S;
    private String Input;

    public ReverseString(String input){ // constructor
        setInput(input);
        this.S = new MyStack(input);
        populateStack(input);
    }

    public void reverseString() throws MyStackException {
        /*
        @param: none
        @return: none
        pop's the items from the stack, resulting in a reversed string.
         */
        while (!this.S.isEmpty()) {
            char c = this.S.pop();
            System.out.print(c);
        }
    }

    private void populateStack(String input){
        /*
        @param: String input, the string to reverse
        return: none, populates this.S

        converts the string to a char array, pushes the resulting
        items onto the stack.
         */
        char[] c = input.toCharArray();
        for(char s : c){
            this.S.push(s);
        }
    }

    private void setInput(String input){
        //setter
        this.Input = input;
    }

    public String getInput(){
        //getter
        return this.Input;
    }
    

}
