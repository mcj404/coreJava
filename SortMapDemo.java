package java8.concepts;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("five", 5);
        map.put("one", 1);
        map.put("zero", 0);
        map.put("nine", 9);

        Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2)-> o2.getEmpId() - o1.getEmpId());
        Address address = new Address("Bengaluru", "Karnataka", "560037");
        employeeMap.put(new Employee(1, "Scaledge", "Ashish", address), 69);
        employeeMap.put(new Employee(2, "EvolveBack", "Alok", address), 79);

        System.out.println(employeeMap);

        //Converting a map into list of entries
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        //Sort using traditional approach
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //Sort using lambda expression
        Collections.sort(entries, (o1, o2)-> o1.getKey().compareTo(o2.getKey()));

        /*for(Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpName)))
                .forEach(System.out::println);
    }
}
