package java8.trickyProblems;

public class NameAndSalary {
    private String name;
    private double salary;

    public NameAndSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + '}';
    }
}
