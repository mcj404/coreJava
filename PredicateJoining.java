package java8.concepts;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() > 5;
        System.out.println("The length of the string is greater than 5: " + checkLength.test("code Decode"));

        Predicate<String> checkEven = s -> s.length() % 2 == 0;
        System.out.println("The length of string is even: " + checkEven.test("code Decode"));

        //it can be joined with and
        System.out.println("after merging with and " + checkLength.and(checkEven).test("code Decode"));

        //it can be joined with or
        System.out.println("after merging with and " + checkLength.or(checkEven).test("code Decode"));

        //it can be joined with negate
        System.out.println("after merging with and " + checkLength.negate().test("code Decode"));
    }
}
