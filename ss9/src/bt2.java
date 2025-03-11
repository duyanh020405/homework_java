class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("New salary after increase: " + salary);
        } else {
            System.out.println("Err!");
        }
    }

    public static void main(String[] args) {
        Employee people = new Employee(1, "Duy Anh", "Nhan Vien", 12000);
        people.displayInfo();
        System.out.println("Current Salary: " + people.getSalary());
        people.setSalary(15000);
        System.out.println("Updated Salary: " + people.getSalary());
        people.increaseSalary(50);
        System.out.println("Final Salary: " + people.getSalary());
    }
}
