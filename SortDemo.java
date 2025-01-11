package java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(15);
        arList.add(250);
        arList.add(52);

        //get stream object
        Stream<Integer> openStream = arList.stream();

        //Configure stream by filtering out required values
        Stream<Integer> filteredStream = openStream.filter(integer -> integer >= 20);

        //you can sort any stream filter or mapped or on normal stream (non filter or non mapped too
        Stream<Integer> sortedStream = filteredStream.sorted();
        sortedStream.forEach(x-> System.out.println(x));

        //1 liner
        Stream<Integer> newFilteredSortedList = arList.stream().filter(i->i >= 20).sorted();
        newFilteredSortedList.forEach(x-> System.out.println(x));

        //descendingOrder
        Stream<Integer> newFilteredDescSortedList = arList.stream().filter(i->i >= 20).sorted((i1,i2)-> i2.compareTo(i1));
        newFilteredDescSortedList.forEach(x-> System.out.println(x));
    }
}
