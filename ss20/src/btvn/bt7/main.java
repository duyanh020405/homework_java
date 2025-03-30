package btvn.bt7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Quý", 26, "IT", 2500),
                new Employee("Lan", 24, "IT", 2100),
                new Employee("Minh", 30, "HR", 3000),
                new Employee("Huyền", 28, "IT", 2000),
                new Employee("Long", 32, "IT", 3100),
                new Employee("Trang", 25, "Marketing", 2200),
                new Employee("Việt", 27, "IT", 2500)
        );
        List<Employee> emps = employees.stream().filter(emp -> emp.age >25 && emp.salary > 2000 && emp.department.equals("IT"))
                .sorted(Comparator.comparing(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName)).toList();

        

    }
}
