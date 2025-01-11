package java8.trickyProblems;

import java8.concepts.PredicateFunctionDemo;

public class VarAndMemory {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(350);
        Integer b = 350;


        System.out.println(b.intValue());
        System.out.println((a==b));
        System.out.println(args.toString());

        PredicateFunctionDemo.main(new String[10]);
    }



}
