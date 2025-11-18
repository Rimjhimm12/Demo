package collection;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "Alice"));
        employees.add(new Employee(4, "Alice"));
        employees.add(new Employee(1, "Bob"));
        employees.add(new Employee(3, "Charlie"));

        HashSet<Employee> hm = new HashSet<>();
        hm.addAll(employees);
        System.out.println("HashSet (Unordered, Unique): " + hm);

        LinkedHashSet<Employee> hms = new LinkedHashSet<>();
        hms.addAll(employees);
        System.out.println("HashSet (Unordered, Unique): " + hms);

        TreeSet<Employee> hmt = new TreeSet<>(new EmployeeIdComparator());
        hmt.addAll(employees);
        System.out.println("HashSet (Unordered, Unique): " + hmt);

    }
}
