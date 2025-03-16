public class bt6 {

    static class Employee {
        protected String name;
        protected int age;
        protected double basicSalary;

        public Employee(String name, int age, double basicSalary) {
            this.name = name;
            this.age = age;
            this.basicSalary = basicSalary;
        }

        public double calculateSalary() {
            return basicSalary;
        }

        public void showInfo() {
            System.out.println("Tên: " + name + age  + basicSalary);
        }
    }

    static class FullTimeEmployee extends Employee {
        private double bonus;

        public FullTimeEmployee(String name, int age, double basicSalary, double bonus) {
            super(name, age, basicSalary);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return basicSalary + bonus;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println(" Fulltime, Tổng lương: " + calculateSalary());
        }
    }

    static class PartTimeEmployee extends Employee {
        private double hourlyRate;
        private int hoursWorked;

        public PartTimeEmployee(String name, int age, double hourlyRate, int hoursWorked) {
            super(name, age, 0); // Không có lương cơ bản cố định
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculateSalary() {
            return hourlyRate * hoursWorked;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("Parttime, Tổng lương: " + calculateSalary());
        }
    }

    static class Intern extends Employee {
        public Intern(String name, int age, double basicSalary) {
            super(name, age, basicSalary);
        }

        @Override
        public double calculateSalary() {
            return basicSalary;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("Thuc tap sinh Tổng lương: " + calculateSalary());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("Nguyễn Văn A", 30, 1000, 200);
        employees[1] = new PartTimeEmployee("Trần Thị B", 22, 10, 120);
        employees[2] = new Intern("Lê Văn C", 20, 500);

        for (Employee emp : employees) {
            emp.showInfo();
        }
    }
}
