package home_work.bt7;

class Intern extends Employee {
    public Intern(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }
    @Override
    public double calculateSalary() {
        return basicSalary;
    }
    @Override
    public void showInfo() {
        System.out.println(name + ", Age: " + age + ", Salary: " + calculateSalary());}}
