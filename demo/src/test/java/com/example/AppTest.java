package com.example;

import org.junit.Test;
import org.junit.Assert;

public class AppTest 
{
    @Test
    public void NegativeNumberTest()
    {
        RuntimeException exception = null;
        try {
            StringCalculator.add("-1,5");
        } catch (RuntimeException e) {
            exception = e;
        }
        Assert.assertEquals("Negatives not allowed", exception.getMessage());
    }
}
