package home_work.bt7;

abstract class Employee {
     protected String name;
     protected int age;
     protected double basicSalary ;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.basicSalary = salary ;
    }

   public abstract double calculateSalary();

   public void showInfo(){
       System.out.println(name + " " + age + " " + basicSalary + " "+ calculateSalary());
   }

}
