package java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(15);
        arList.add(25);
        arList.add(52);

        //get stream object
        Stream<Integer> openStream = arList.stream();

        //Configure stream by filtering out required values
        Stream<Integer> filteredStream = openStream.filter(integer -> integer >= 20);

        List<Integer> newFilteredListOrigin = filteredStream.collect(Collectors.toList());
        newFilteredListOrigin.stream().forEach(x-> System.out.println(x));

        //1 liner
        List<Integer> newFilteredList = arList.stream().filter(i-> i >= 20).collect(Collectors.toList());
        newFilteredList.forEach(x-> System.out.println(x));
    }
}
