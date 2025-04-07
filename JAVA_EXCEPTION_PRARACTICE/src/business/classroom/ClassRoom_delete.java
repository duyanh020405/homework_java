package business.classroom;

import entity.ClassRoom;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class ClassRoom_delete {
    static List<ClassRoom> classRoomList = UniversityManager.classRooms;
    public static void classRoom_delete() {
        System.out.println("Enter id class to delete");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (ClassRoom classRoom : classRoomList) {
            if(classRoom.getClassRoomId() == id) {
                if(classRoom.getTeacherId() == 0 && classRoom.getListStudents().isEmpty()) {
                    classRoomList.remove(classRoom);
                    System.out.println("Success");
                    break;
                }
            }
            else {
                System.out.println("Can't delete class room because class room id doesn't match");
                break;
            }
        }

    }
}
