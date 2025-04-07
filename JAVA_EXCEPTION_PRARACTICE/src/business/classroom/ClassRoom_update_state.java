package business.classroom;

import entity.ClassRoom;
import presentation.UniversityManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassRoom_update_state {
    public static List<ClassRoom> classRoomList = UniversityManager.classRooms;
    static Scanner sc = new Scanner(System.in);
    public static void ClassRoom_update_state() {
        System.out.println("Class Room Update State :");
        int classId = sc.nextInt();
        for(ClassRoom classRoom : classRoomList) {
            if(classRoom.getClassRoomId().equals(classId)) {
                System.out.println("Class Room state :" + classRoom.getStatus()+"\n");
                System.out.println("Are you sure you want to update the class room state? (y/n)");
                String answer = sc.next();
                if(answer.equals("y")) {
                    if(classRoom.getStatus() == ClassRoom.Status.PENDING){
                        classRoom.setStatus(ClassRoom.Status.PROGESS);
                        System.out.println("Class Room state now :"+ classRoom.getStatus()+"\n");
                        return;
                    }
                    else if(classRoom.getStatus() == ClassRoom.Status.PROGESS) {
                        classRoom.setStatus(ClassRoom.Status.CLOSE);
                        System.out.println("Class Room state now :"+ classRoom.getStatus()+"\n");
                    }
                    else {
                        System.out.println("Can't update because status is not PENDING or PROGESS!");
                        return;
                    }
                }

            }
        }




    }


}
