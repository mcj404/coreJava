package java8.concepts;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Integer> consumer1 = i -> System.out.print("Calling first consumer -> ");
        Consumer<Integer> consumer2 = i -> System.out.println("Calling second consumer");

        consumer1.andThen(consumer2).accept(10);

    }
}
