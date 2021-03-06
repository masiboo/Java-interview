package org.example;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class FizzBuzz2
{
    public static void main( String[] args )    {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
