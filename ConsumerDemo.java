package java8.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> squareMe = integer -> System.out.println("Taking an argument and returning nothing: " + integer);
        squareMe.accept(5);

        List<Integer> integers = Arrays.asList(2, 3, 45, 67);
        integers.stream().forEach(each -> System.out.println(each));
    }
}
