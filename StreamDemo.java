package java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(15);
        arList.add(23);
        arList.add(4);

        //Streams
        List<Integer> newAl = new ArrayList<Integer>();
        newAl = arList.stream().filter(x-> x>=15).collect(Collectors.toList());
        newAl.stream().forEach(x-> System.out.println(x));

        //without streams:
        /*List<Integer> arListFromMethod = findElements(arList);
        for(Integer i : arListFromMethod){
            System.out.println(i);
        } */
    }

    /*public static List<Integer> findElements(List<Integer> arList){
        List<Integer> newAl = new ArrayList<Integer>();
        for (Integer i : arList){
            if(i >= 15){
                newAl.add(i);
            }
        }
        return newAl;
    }*/
}
