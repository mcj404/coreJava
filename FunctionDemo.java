package java8.concepts;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> squareMe = integer -> integer * integer;
        System.out.println("Square of 8 is = " + squareMe.apply(8));
    }
}