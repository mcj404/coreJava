package java8.trickyProblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequentlyAsked {
    public static void main(String[] args) {
        String input = "ilovejavatechie";
        characterFrequencyCountOfString(input);
        duplicateElements(input);
        findFirstNonRepeatElement(input);
        findSecondHighest();
        longestString();
        numbersStartWith(2);
        joinMethodUsage();
        skipAndLimit();
    }

    public static void characterFrequencyCountOfString(String input){

        Map<String, Long> map = Arrays.stream(input.split(""))      //Array of characters
                .collect(Collectors.groupingBy(                           //groupingBy for counting own
                        Function.identity(), Collectors.counting()
                ));
        System.out.println(map);
    }

    public static void duplicateElements(String input) {

        List<String> duplicateElements =
                Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(element -> element.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Duplicate Elements" + duplicateElements);
    }

    public static void findFirstNonRepeatElement(String input){
        String firstNonRepeatingElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(element -> element.getValue() == 1)  // make > 2 for first repeated element
                .findFirst()
                .get()
                .getKey();
        System.out.println("First non-repeating element: " + firstNonRepeatingElement);
    }

    public static void findSecondHighest(){
        int[] numbers = {5,9,11,2,8,21,1};

        Integer secondHighest = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Highest Number " + secondHighest);
    }

    public static void longestString(){
        String[] stringsArray = {"java", "techie", "springboot", "microservices"};

        String lengthiest = Arrays.stream(stringsArray)
                .reduce((word1, word2) ->
                        word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println("Longest word: " + lengthiest);
    }

    public static void numbersStartWith(int number){
        String stringNumber = String.valueOf(number);
        int[] numbers = {5,9,11,2,8,21,1};
        List<String> startsWith = Arrays.stream(numbers)
                .boxed()
                .map(each -> each + "")
                .filter(each -> each.startsWith(stringNumber))
                .collect(Collectors.toList());
        System.out.println("Start with array: " + startsWith);
    }

    public static void joinMethodUsage(){
        List<String> integers = Arrays.asList("1", "2", "3", "4", "5");
        String results = String.join("->", integers);
        System.out.println(results);
    }

    public static void skipAndLimit(){
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::print );
    }


}
