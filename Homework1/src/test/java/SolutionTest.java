import org.example.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Nested
    @DisplayName("Test casi eccezionali")
    class TestCasiEccezionali{

        @Test
        void testEmptyString() {
            String s = "";
            int result = Solution.solution(s);
            assertEquals(-1, result);
        }

        @Test
        public void testNullString() {
            String s = null;
            int result = Solution.solution(s);
            assertEquals(-1, result);
        }

    }

    @Test
    public void testValidWord() {
        String s = "abc1234";
        int result = Solution.solution(s);
        assertEquals(7, result);
    }

    @Test
    public void testInvalidDigitCount() {
        String s = "a1b2c3d4e";
        int result = Solution.solution(s);
        assertEquals(-1, result);
    }

    @Test
    public void testInvalidAlphabeticCount() {
        String s = "a1234";
        int result = Solution.solution(s);
        assertEquals(-1, result);
    }

    @DisplayName("Test s lenght == 1")
    @Test
    public void testMinValidWord() {
        String s = "1";
        int result = Solution.solution(s);
        assertEquals(1, result);
    }

    @DisplayName("Test s lenght > 1")
    @Test
    public void validWord() {
        String s = "abcd123";
        int result = Solution.solution(s);
        assertEquals(7, result);
    }

    @Test
    public void WordOddCharacter() {
        String input = "Testing1 is fun";
        int result = Solution.solution(input);
        assertEquals(-1, result);
    }

    @Test
    public void stringWithOnlySpace() {
        String s = "";
        int result = Solution.solution(s);
        assertEquals(-1, result);
    }

    @Test
    public void wordEvenNumbers() {
        String s = "abcd1234";
        int result = Solution.solution(s);
        assertEquals(-1, result);
    }

    @Test
    public void multiWord() {
        String s = "ciao1 casa321 ciaociao12345 ciao123 ciaociao1";
        int result = Solution.solution(s);
        assertEquals(13, result);
    }

}