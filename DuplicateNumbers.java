package java8.trickyProblems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 1, 4, 4};

        Map<Integer, Long> duplicates = IntStream.of(numbers)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        duplicates.forEach((number, count) ->
                System.out.println(number + ": " + count));
    }
}
