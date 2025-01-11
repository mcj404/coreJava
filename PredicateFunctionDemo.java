package java8.concepts;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {
        //Before Predicate
        PredicateFunctionDemo predicateFunctionDemo = new PredicateFunctionDemo();
        System.out.println(predicateFunctionDemo.testStringLength("Code"));

        //Using Predicate
        Predicate<String> stringPredicate = s -> s.length() >= 5;
        System.out.println("Length of the string using predicate:" + stringPredicate.test("Code"));
    }

    public boolean testStringLength(String s){
        if(s.length() >= 5)
            return true;
        else
            return false;
    }
}
