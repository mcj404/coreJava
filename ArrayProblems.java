package java8.trickyProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayProblems {
    public static void main(String[] args) {

        int[] numbers = {5,2,8,3,1,1};
        fetchSecondSmallest(numbers);
        System.out.println("======================");

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        fetchCommonElements(arr1, arr2);
        System.out.println("======================");

        reverseArrayInPlace(arr1);
        System.out.println("======================");

        String[] strings = {"Apple", "Banana", "Avacado", "Apricot"};
        fetchLengthOfLongestStringInArray(strings);

    }

    public static void fetchSecondSmallest(int[] array){
        int secondSmallestElement = Arrays.stream(array)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
        System.out.println(secondSmallestElement);
    }

    public static void fetchCommonElements(int[] firstArray, int[] secondArray) {
        List<Integer> commonElements =
                Arrays.stream(firstArray)               //take first array stream
                        .filter(number ->               // all matching numbers using anyMatch
                                Arrays.stream(secondArray)
                                        .anyMatch(secondArrayNumber -> secondArrayNumber == number))
                        .boxed()                        //boxed to Integer
                        .collect(Collectors.toList());  //collect as list
        System.out.println("Common Elements are: " + commonElements);
    }

    public static void reverseArrayInPlace(int[] array){
        IntStream.range(0, array.length/2)              //Check only the half length of array
                .forEach(element -> {
                    int temp = array[element];             //Traditional swap logic
                    array[element] = array[array.length - element -1];
                    array[array.length -element -1] = temp;
                });
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void fetchLengthOfLongestStringInArray(String[] strings){
        int maxLength = Arrays.stream(strings)
                .mapToInt(string -> string.length())    //Transforms the string array to integer array
                .max()
                .orElse(0);
        System.out.println("Maximum length: " + maxLength);
    }

}
