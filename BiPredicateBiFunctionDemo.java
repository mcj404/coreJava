package java8.concepts;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a,b) -> a+b > 5;
        System.out.println("Sum greater than 5: " + biPredicate.test(8,9));

        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a*b;
        System.out.println("Multiplication of both: " + biFunction.apply(10,9));
    }
}
