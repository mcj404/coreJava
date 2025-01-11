package java8.concepts;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Date> currentDate = () -> new Date();
        System.out.println("Today's Date: " + currentDate.get());
    }
}
