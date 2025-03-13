package rocks.zipcode;

import java.util.HashMap;

/**
 * EXERCISE 1: StringUtils
 * 
 * Implement the StringUtils class to make all tests pass.
 * The class should have methods to:
 * - reverse a string
 * - count occurrences of a character in a string
 * - check if a string is a palindrome (ignoring case and non-alphanumeric characters)
 */

 // Student must implement this class
public class StringUtils {
    // TODO: Implement the following methods to make the tests pass

    public static String reverse(String str) {
        // Your implementation here
        return new StringBuilder(str).reverse().toString();

    }

    public static int countOccurrences(String str, char c) {
        // Your implementation here
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

//int count = 0;
//        char [] ch = str.toCharArray();
//        for (int i = 0; i<ch.length; i++) {
//if
//        }
//for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == c) ;
//        }
    //HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
    //        char[] strArray = str.toCharArray();
    //        for (char a : strArray) {
    //            if (charCountMap.containsKey(a)) {
    //                charCountMap.put(a, charCountMap.get(a) + 1);
    //            } else {
    //                charCountMap.put(a, 1);
    //            }
    //            return (charCountMap.get(a));
    //        }


    //String str = "banana";
//char c = 'a';
//int count = 3;
//for ( int i = 0; i<0; i++) {
//        return ;
//    }

    public static boolean isPalindrome(String str) {
        // Your implementation here
        // Note: Ignoring case and non-alphanumeric characters
//StringBuilder str1 = new StringBuilder(str);
              String abc = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

               StringBuilder reversed = new StringBuilder(abc);
              StringBuilder newr = reversed.reverse();

               return abc.equals(newr.toString());
    }




    //






    }






    // String reversed = new StringBuilder(str).reverse().toString();
        //        boolean isPalindrome;
        //        if (str.equalsIgnoreCase(reversed)) isPalindrome = false;
        //        else isPalindrome = true;
        //        return str.equals(new StringBuilder(str).reverse().toString());
        //    }
        //}

