package bt1.presention;

import bt1.modle.Employees;
import bt1.service.EmployeeServiceI;
import bt1.service.EmployeeServiceImp;
import btvn.bt7.Employee;
import entity.Student;

import java.util.Scanner;

public class Employees_UI {
    private static EmployeeServiceI employeeService;

    public Employees_UI() {
        employeeService = new EmployeeServiceImp();
    }

    public static void main(String[] args) {
        new Employees_UI();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID bạn muốn tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        Employees find = employeeService.findById(id);
        find.toString();
    }

}
