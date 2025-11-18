package collection;

import java.util.Comparator;
import java.util.Queue;
import java.util.Stack;

public class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int idCompare = Integer.compare(e1.employeeId, e2.employeeId);
        if (idCompare != 0) {
            Queue
            return idCompare;
        }
        return e1.employeeName.compareTo(e2.employeeName);
    }
}

