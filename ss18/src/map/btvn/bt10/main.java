package map.btvn.bt10;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        do {
            System.out.println("----------Menu-----------");
            System.out.println("1. Add Employee");
            System.out.println("2. Show all Employee");
            System.out.println("3. All total employee");
            System.out.println("4. Avg(salary)");
            System.out.println("5. Max salary");
            System.out.println("6. Min salary");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Employee employee = Employee.addEmployee(sc);
                    if (employee != null) {
                        employees.put(employee.getId(), employee);
                        System.out.println("Employee added");
                    } else {
                        System.out.println("Employee not added");
                    }
                    break;
                case 2:
                    for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
                        System.out.println(entry.getValue().getName() + " " + entry.getValue().getSalary());
                    }
                    break;
                case 3:
                    float total = 0;
                    for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
                        total += entry.getValue().getSalary();
                    }
                    System.out.println("Total salary: " + total);
                    break;
                case 4:
                    float total_all = 0;
                    for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
                        total_all += (float) entry.getValue().getSalary();
                    }
                    total_all = total_all / employees.size();
                    System.out.println("Avg Total salary: " + total_all);
                    break;
                case 5:
                    int max_salary = (int) employees.get(0).getSalary();
                    for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
                        if(entry.getValue().getSalary() > max_salary){
                            max_salary = (int) entry.getValue().getSalary();
                        }
                    }
                    System.out.println("Max salary: " + max_salary);
                    break;

                case 6:
                    int min_salary = (int) employees.get(0).getSalary();
                    for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
                        if(entry.getValue().getSalary() < min_salary){
                            max_salary = (int) entry.getValue().getSalary();
                        }
                    }
                    System.out.println("Max salary: " + min_salary);
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;

            }
        }
            while (on) ;

        }
    }