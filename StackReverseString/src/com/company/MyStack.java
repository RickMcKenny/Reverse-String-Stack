/*
Name: Rick McKenny
Date: 2020-02-21

Modified a data structures homework assignment. This is an implementation of the Abstract Stack class
using a one-dimensional char array.
 */

package com.company;

public class MyStack {

    private char[] arr;
    private int Capacity;
    private int count = 0;


     public MyStack(String capacity) {
        setCapacity(capacity);
        this.arr = new char[Capacity];
    }

    private void setCapacity(String capacity) {
        this.Capacity = capacity.length();
    }

    public void push(char c){
         /*
         @param: char c
         return: none, used to push var onto stack.


          */
         this.count = this.count + 1;
         this.arr = arr(this.arr, c);
    }

    private char[] arr(char[] arr, char pushChar){
         /*
         param1: the array representing this stack
         param2: the variable to be pushed to the stack
          */
        char[] newArr = new char[Capacity];
        newArr[0] = pushChar;

        for (int i = 0, j = 1; j < this.arr.length; i++, j++) {
            newArr[j] = arr[i];
        }

        return newArr;

    }

    public char pop() throws MyStackException {
         if(this.isEmpty()){
             throw new MyStackException("Stack is empty");
         }

         this.count = this.count - 1;
         char pop = this.arr[0];
         for (int i = 0; i < this.arr.length - 1; i++) {
             this.arr[i] = this.arr[i + 1];
             }

             return pop;
         }

    public boolean isEmpty() {
         /*
         if count == 0, stack is empty. returns false otherwise
          */
        return this.count == 0? true : false;
    }

}
