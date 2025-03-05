package rocks.zipcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


// The test class (already written)

public class StringUtilsTest {
    @Test
    void testReverseString() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("a", StringUtils.reverse("a"));
        assertEquals("321olleh", StringUtils.reverse("hello123"));
    }
    
    @Test
    void testCountOccurrences() {
        assertEquals(3, StringUtils.countOccurrences("banana", 'a'));
        assertEquals(0, StringUtils.countOccurrences("hello", 'x'));
        assertEquals(5, StringUtils.countOccurrences("aaaaa", 'a'));
        assertEquals(0, StringUtils.countOccurrences("", 'a'));
    }
    
    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(StringUtils.isPalindrome("Was it a car or a cat I saw?"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertTrue(StringUtils.isPalindrome(""));  // Empty string is a palindrome
        assertTrue(StringUtils.isPalindrome("a")); // Single character is a palindrome
    }
}

