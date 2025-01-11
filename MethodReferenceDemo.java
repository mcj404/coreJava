package java8.concepts;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo = Test :: testImplementation;
        functionalInterfaceDemo.singleAbstractMethod();
    }
}

class Test{
    public static void testImplementation(){
        System.out.println("This is test Implementation of the abstract method");
    }
}
