package java8.concepts;

import java.util.function.Function;

public class FunctionalChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = i -> 2*i;
        System.out.println("Double function: " + doubleIt.apply(8));

        Function<Integer, Integer> cubeIt = i -> i*i*i;
        System.out.println("Cube function: " + cubeIt.apply(4));

        System.out.println("Double first: " + doubleIt.andThen(cubeIt).apply(2));
        System.out.println("Cube first: " + doubleIt.compose(cubeIt).apply(2));
    }
}
