package java8.trickyProblems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";

        // Convert the string to a stream of characters
        Map<Character, Long> duplicates = input
                .chars()
                .mapToObj(c -> (char) c)  // Convert int stream to character stream
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))  // Group by character and count occurrences
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)  // Filter for duplicates
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue));  // Collect the results in a map

        // Print the duplicates
        duplicates.forEach((character, count) ->
                System.out.println(character + ": " + count));

        input.chars().mapToObj(c-> (char) c).forEach(System.out::println);
    }
}

