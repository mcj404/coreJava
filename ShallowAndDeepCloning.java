package java8.concepts;

public class ShallowAndDeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Bengaluru","Karnataka","560037");
        Employee emp1 = new Employee(2925, "Altimetrik", "Ashish", address);

        //To get the clone of employee class, implement cloneable interface to employee class. Else the "emp1" will not have
        //clone method in it. Remember to override the clone method.
        Employee emp2 = (Employee) emp1.clone();

        System.out.println("After cloning");
        System.out.println("Emp1 == " + emp1);
        System.out.println("Emp2 == " + emp2);

        emp2.getAddress().setCity("Bodhgaya");
        System.out.println("After setting different city");
        System.out.println("Emp1 == " + emp1);
        System.out.println("Emp2 == " + emp2);



    }
}
