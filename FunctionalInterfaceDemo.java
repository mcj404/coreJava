package java8.concepts;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void singleAbstractMethod();

    default void printName1(){
        System.out.println("Welcome to Code decode");
    }

    default void printname2(){
        System.out.println("Welcome to Code decode");
    }
}
