package home_work.bt7;

public class PartTimeEmployee extends Employee{
    double hour;
    public PartTimeEmployee(String name, int age, int basicSalary , double hour) {

        super(name, age, basicSalary);
        this.hour = hour;
    }

    @Override
    public double calculateSalary() {
        return (basicSalary / 30/24) * hour;
    }

    @Override
    public void showInfo() {
        System.out.println(name + " " + age + " " + basicSalary + " "+ calculateSalary());
    }
}
