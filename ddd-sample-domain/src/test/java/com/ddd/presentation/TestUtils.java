package com.ddd.presentation;

import java.util.Arrays;

public class TestUtils {

    private TestUtils() {}

    public static String generateStringOfLength(int length) {
        char[] chars = new char[length];
        Arrays.fill(chars, '*');
        return new String(chars);
    }
}
