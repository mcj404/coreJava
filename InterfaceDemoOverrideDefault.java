package java8.concepts;

public class InterfaceDemoOverrideDefault implements InterfaceDemo {

    public void printName(){
        System.out.println("Fuck off, I have overridden you!");
    }

    public static void main(String[] args) {
        InterfaceDemoOverrideDefault overrideDefault = new InterfaceDemoOverrideDefault();
        overrideDefault.printName();
    }

}
