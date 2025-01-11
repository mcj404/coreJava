package java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArray {
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
        Object[] intArr = filteredStream.toArray();
        for (Object o : intArr){
            System.out.println("Elements in the array are " + o);
        }
        System.out.println("One Liner");

        Object[] intArrOneLiner = arList.stream().filter(i-> i>= 20).toArray();
        for (Object o : intArrOneLiner){
            System.out.println("elements in the array are: " + o);
        }
    }
}
