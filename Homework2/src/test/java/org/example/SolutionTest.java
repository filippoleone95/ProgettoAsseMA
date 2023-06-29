package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

class SolutionTest {

    @Nested
    @DisplayName("Test casi eccezionali")
    class TestCasiEccezionali{

        @Test
        @DisplayName("Test caso stringa vuota")
        void emptyString() {
            String str = "";
            boolean result = Solution.isPalindromePermutation(str);
            assertTrue(result);
        }

        @Test
        @DisplayName("Test caso stringa nulla")
        public void nullString() {
            String str = null;
            boolean result = Solution.isPalindromePermutation(str);
            assertFalse(result);
        }

    }

    @Test
    @DisplayName("Test caso stringa palindroma")
    public void testPalindromeString() {
        String str = "radar";
        boolean result = Solution.isPalindromePermutation(str);
        assertTrue(result);
    }

    @Test
    @DisplayName("Test lunghezza str == 1")
    public void testStringOneChar() {
        String str = "r";
        boolean result = Solution.isPalindromePermutation(str);
        assertTrue(result);
    }

    @Test
    @DisplayName("Test stringa con spazio")
    public void testPalindromePermutationWithSpace() {
        String str = "taco cat";
        boolean result = Solution.isPalindromePermutation(str);
        Assert.assertTrue(result);
    }

    @Test
    @DisplayName("Test stringa contenente solo uno spazio")
    public void testEmptyString() {
        String str = " ";
        boolean result = Solution.isPalindromePermutation(str);
        Assert.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("generateArguments")
    @DisplayName("Test per 100% Code Coverage")
    void test(String str, boolean expectedResult) {
        assertEquals(Solution.isPalindromePermutation(str), expectedResult);
    }

    static Stream<Arguments> generateArguments() {
        return Stream.of(
                Arguments.of("hello", false),
                Arguments.of(null, false)
        );
    }
}