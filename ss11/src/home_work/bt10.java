package home_work;

import java.util.ArrayList;
import java.util.List;

public class bt10 {
abstract class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
    abstract void takeVacation();
}
interface AttendMeeting {
    void attendMeeting();
}
class Manager extends Employee implements AttendMeeting {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println("Quản lý" + name + "(Lương:$"+salary +") đang giám sát dự án.");
    }

    @Override
    void takeVacation() {
        System.out.println("Quản lý " + name + " (Lương: $" + salary + ") đang đi nghỉ phép tại Pháp.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Quản lý " + name + " (Lương: $" + salary + ") đang tham gia cuộc họp.");
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println("Lập trình viên " + name + " (Lương: $" + salary + ") đang viết code cho hệ thống mới.");
    }

    @Override
    void takeVacation() {
        System.out.println("Lập trình viên " + name + " (Lương: $" + salary + ") đang đi nghỉ phép ở Bali.");
    }
}

class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void startWork() {
        for (Employee employee : employees) {
            employee.work();
        }
    }
    public void giveVacation() {
        for (Employee employee : employees) {
            employee.takeVacation();
        }
    }
    public void organizeMeeting() {
        for (Employee employee : employees) {
            if (employee instanceof AttendMeeting) {
                ((AttendMeeting) employee).attendMeeting();
            }
        }
    }
}

    public void main(String[] args) {
        Company company = new Company();

        Manager manager = new Manager("Alice", 8000);
        Developer developer = new Developer("Bob", 5000);

        company.addEmployee(manager);
        company.addEmployee(developer);

        company.startWork();
        company.giveVacation();
        company.organizeMeeting();
    }
}