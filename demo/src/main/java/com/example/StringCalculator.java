package com.example;

/**
 * Hello world!
 *
 */
public class StringCalculator 
{
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        //String[] negativeNumbersArray = numbers.split(",|\n");

        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int Number = Integer.parseInt(number.trim());

                if (Number < 0) {
                    throw new RuntimeException("Negatives not allowed");
                }
            }
        }
        return returnValue;
    }
}
