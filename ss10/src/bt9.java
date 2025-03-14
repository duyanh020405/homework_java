package ss10.src;
import java.util.ArrayList;
class Employee {
    protected String name;
    protected int id;
    protected double salary;
    public Employee() {
        this.name = "";
        this.id = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }
    @Override
    public String toString() {
        return  name + id + salary;
    }
}

// Lớp con Manager kế thừa từ Employee
class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        this.bonus = 0.0;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + bonus;
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        super();
        this.programmingLanguage = "";
    }
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return super.toString() + ", Ngôn ngữ lập trình: " + programmingLanguage;
    }
}
public class bt9 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("Alice", 101, 5000);
        Manager mgr1 = new Manager("Bob", 102, 7000, 2000);
        Developer dev1 = new Developer("Charlie", 103, 6000, "Java");

        employeeList.add(emp1);
        employeeList.add(mgr1);
        employeeList.add(dev1);

        for (Employee emp : employeeList) {
            System.out.println(emp.toString());
            System.out.println("Lương thực nhận: " + emp.getSalary());
            System.out.println("-------------------");
        }
        emp1.increaseSalary(500);
        System.out.println("Sau khi tăng lương:");
        System.out.println(emp1.toString());
    }
}
