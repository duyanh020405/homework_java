package home_work.bt7;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new FullTimeEmployee("A", 36, 1000, 2000),
                new PartTimeEmployee("B", 25, 20, 80),
                new Intern("C", 22, 2000)
        };

        for (Employee emp : employees) {
            emp.showInfo();
        }
    }
}
