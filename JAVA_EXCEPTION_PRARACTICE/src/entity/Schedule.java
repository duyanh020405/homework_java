package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Schedule implements IApp {
    private static int autoId = 1;
    private int scheduleId = autoId++;
    private int classroomId;
    private LocalDateTime startTime, endTime;
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Enter classroom ID: ");
        classroomId = Integer.parseInt(sc.nextLine());

        while (true) {
            System.out.print("Enter start time (yyyy-MM-dd HH:mm:ss): ");
            String start = sc.nextLine();
            System.out.print("Enter end time (yyyy-MM-dd HH:mm:ss): ");
            String end = sc.nextLine();

            if (isValid(start) && isValid(end)) {
                startTime = LocalDateTime.parse(start, fmt);
                endTime = LocalDateTime.parse(end, fmt);
                if (endTime.isAfter(startTime)) break;
            }
            System.out.println("Invalid input. Make sure format is correct and end > start.");
        }
    }

    private boolean isValid(String time) {
        return time.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
    }

    public void displayData() {
        System.out.println("Schedule ID: " + scheduleId);
        System.out.println("Classroom ID: " + classroomId);
        System.out.println("Start: " + startTime.format(fmt));
        System.out.println("End: " + endTime.format(fmt));
    }
}
