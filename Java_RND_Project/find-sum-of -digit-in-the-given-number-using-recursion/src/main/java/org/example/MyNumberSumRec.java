package org.example;

public class MyNumberSumRec {

    static int sum = 0;

    public static void main(String a[]) {
        System.out.println("Sum is: " + getNumberSum(223));
    }

    public static int getNumberSum(int number) {

        if (number == 0) {
            return sum;
        } else {
            sum += (number % 10);
            getNumberSum(number / 10);
        }
        return sum;
    }
}