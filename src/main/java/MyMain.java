import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyMain {
    // Return a list containing only the even numbers from the input collection.
    // Intermediate operations: 1
    public static Collection<Integer> getEvens(Collection<Integer> nums) {
        // REPLACE YOUR CODE HERE
        return Collections.emptyList();
    }

    // Return the first square number in the input collection.
    // Intermediate operations: 1
    public static Optional<Integer> getFirstSquare(Collection<Integer> nums) {
        // REPLACE YOUR CODE HERE
        return Optional.empty();
    }

    // Return whether the input collection contains a 7.
    // Intermediate operations: 0
    public static boolean contains7(Collection<Integer> nums) {
        // REPLACE YOUR CODE HERE
        return false;
    }

    // Return whether every number in the input collection is bigger than 10.
    // Intermediate operations: 0
    public static boolean allBiggerThan10(Collection<Integer> nums) {
        // REPLACE YOUR CODE HERE
        return false;
    }

    // Return whether the first n elements in nums are negative.
    // Intermediate operations: 1
    public static boolean firstNAreNegative(int n, Collection<Integer> nums) {
        // REPLACE YOUR CODE HERE
        return false;
    }

    // Returns whether all the smallest n elements in nums are odd.
    // Intermediate operations: 2
    public static boolean smallestNAreOdd(int n, Collection<Integer> nums) {
        // REPLACE YOUR CODE HERE
        return false;
    }

    // Returns the doubled value of each of the first five unique elements in the array.
    // E.g. 1, 1, 2, 3, 2, 6, 1, 4, 10 => 2, 4, 6, 12, 8
    // Intermediate operations: 3
    public static Collection<Integer> firstFiveUniqueDoubled(Collection<Integer> nums) {
        // REPLACE YOUR CODE HERE
        return Collections.emptyList();
    }

    // Returns the words in input list that start with vowels.
    // For this function, do not count "y" as a vowel.
    // Intermediate operations: 2
    public static Collection<String> wordsThatStartWithVowels(Collection<String> list) {
        // REPLACE YOUR CODE HERE
        return Collections.emptyList();
    }

    // Helper function for palindromesWithoutNumbers.
    // Returns whether the input string has no numbers in it.
    private static boolean stringContainsNoNumbers(String str) {
        return str.chars().noneMatch(Character::isDigit);
    }

    // Returns the words in input list that are palindromes and do not contain any number.
    // Hint: stringContainsNoNumbers is provided above for your use
    // Hint: you may want to write an additional helper function.
    // Intermediate operations: 2
    public static Collection<String> palindromesWithoutNumbers(Collection<String> list) {
        // REPLACE YOUR CODE HERE
        return Collections.emptyList();
    }

    public static void main(String[] args) {
    }
}
