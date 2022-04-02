package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class FindMiddleIndex2
{
    public static void main(String args[])
    {
        //Original array
        int arr[] = {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54, 68,10,20,30};
        // Printing the array
        System.out.println("The array elements are : "+ Arrays.toString(arr));
        int startIndex = 0, lastIndex = arr.length - 1;
        // Setting the mid index
        int midIndex = startIndex + (lastIndex-startIndex)/2;
        System.out.println("The mid index is "+midIndex+" and the element at mid is "+arr[midIndex]);
    }
}
