package java8.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountDemo {
    public static void main(String[] args) {

        Integer[] intArray = {12,15,21};

        List<Integer> arList = Arrays.asList(intArray);

        //get stream object
        Stream<Integer> openStream = arList.stream();

        //Configure stream by filtering out required values
        Stream<Integer> filteredStream = openStream.filter(integer -> integer >= 20);

        long streamCount = filteredStream.count();
        System.out.println(streamCount);

        //1 liner
        long newFilteredListCount = arList.stream().count();
        System.out.println(newFilteredListCount);
    }
}
