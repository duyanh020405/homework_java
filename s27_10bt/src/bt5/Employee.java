package bt5;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int departmentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Employee(int id, int departmentId, double salary, String name) {
        this.id = id;
        this.departmentId = departmentId;
        this.salary = salary;
        this.name = name;
    }
}
