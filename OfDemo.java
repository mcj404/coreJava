package java8.concepts;

import java.util.stream.Stream;

public class OfDemo {
    public static void main(String[] args) {
        Stream.of(1,11,111,1111).forEach(x-> System.out.println(x));

        String[] name = {"Code", "decode", "demos"};
        Stream.of(name).filter(x->x.length() > 4).forEach(x-> System.out.println(x));
    }
}
