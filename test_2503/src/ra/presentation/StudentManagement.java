package ra.presentation;

import ra.entity.Student;

import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on = false;
        Map<String, Student> students = new LinkedHashMap<String,Student>();
        do{
        System.out.println("---------------Menu-------------");
        System.out.println("1. All Student");
        System.out.println("2. Add Student");
        System.out.println("3. Delete Student");
        System.out.println("4. AVG Score Student");
        System.out.println("5. Max avg of Student");
        System.out.println("6. Min avg of Student");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                    if(students.size() == 0){
                        System.out.println("Dont have any student to show");
                    }
                    else {
                        for(Map.Entry<String, Student> entry : students.entrySet()){
                            System.out.println(entry.getKey() + ": " + entry.getValue().getName()
                                    + "- tuoi :  " + entry.getValue().getAge()+" "+"- avg : "+entry.getValue().getAvg_score());
                        }
                }
                    break;
            case 2:
                Student new_student = Student.inputData(sc);
                if (new_student != null) {
                    students.put(new_student.getId(), new_student);
                }
                break;

            case 3:
                Student.deleteStudent(students);
                break;
            case 4:
                float sum = 0;
                for(Map.Entry<String, Student> entry : students.entrySet()){
                    sum += entry.getValue().getAvg_score();
                }
                sum = sum / students.size();
                System.out.println("Avg from all Students :"+sum);
                break;
            case 5:
                Student student_max = new Student("",null);
                float max_score = 0;
                for(Map.Entry<String, Student> entry : students.entrySet()){
                    if(entry.getValue().getAvg_score() > max_score){
                        max_score = entry.getValue().getAvg_score();
                        student_max =new Student(entry.getValue().getId(), entry.getValue().getName());
                    }
                }
                System.out.println("Avg max from all Students :"+ student_max.getName());
                break;

            case 6:
                Student student_min = new Student("",null);
                float min_score = students.get(student_min.getName()).getAvg_score();
                for(Map.Entry<String, Student> entry : students.entrySet()){
                    if(entry.getValue().getAvg_score() < min_score){
                        min_score = entry.getValue().getAvg_score();
                        student_min = new Student(entry.getValue().getId(),entry.getValue().getName());
                    }
                }
                System.out.println("Avg min from all Students :"+ student_min.getName());
                break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
                    break;

        }



     }
        while(!on);
   }
}
