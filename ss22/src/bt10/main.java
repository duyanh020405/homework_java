package bt10;

public class main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent(new Student(1, "Duy Anh", "CNTT", 3.8));
        sm.addStudent(new Student(2, "Bảo Nam", "Kinh tế", 3.5));
        sm.addStudent(new Student(3, "Minh Đức", "CNTT", 3.9));

        String file = "students.dat";
        sm.saveToFile(file);
        sm.loadFromFile(file);

        System.out.println("Danh sách sinh viên:");
        sm.displayAllStudents();

        System.out.println("\nSinh viên có GPA cao nhất: " + sm.findTopStudent());
        System.out.println("Sinh viên chuyên ngành CNTT: " + sm.searchByMajor("CNTT"));
        System.out.printf("GPA trung bình: %.2f\n", sm.calculateAverageGpa());
    }
}

