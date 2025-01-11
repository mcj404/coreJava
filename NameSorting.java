package java8.trickyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameSorting {
    public static void main(String[] args) {
        List<NameAndSalary> list = Arrays.asList(
                new NameAndSalary("John", 40000),
                new NameAndSalary("Bob", 50000),
                new NameAndSalary("Carla", 45000),
                new NameAndSalary("Alice", 35000),
                new NameAndSalary("Pop", 60000)
        );

        List<NameAndSalary> sortedNames = list.stream()
                .sorted(Comparator.comparing(NameAndSalary::getName)
                                    .thenComparing(NameAndSalary::getSalary))
                .collect(Collectors.toList());
         sortedNames.forEach(System.out::println);

    }
}
