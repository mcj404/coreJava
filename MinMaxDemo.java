package java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxDemo {
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
        Integer min = filteredStream.min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(min);

        System.out.println("One liners output");
        Integer minValue = arList.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(minValue);
        Integer maxValue = arList.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(maxValue);
    }
}
