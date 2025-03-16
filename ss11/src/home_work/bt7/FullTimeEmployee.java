package home_work.bt7;

public class FullTimeEmployee extends Employee{
    double money_gift;
    public FullTimeEmployee(String name, int age, double salary , double money_gift) {

        super(name, age, salary);
        this.money_gift = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return basicSalary + money_gift;
    }

    @Override
    public void showInfo() {
        System.out.println(name + " " + age + " " + basicSalary + " "+ calculateSalary());
    }
}
