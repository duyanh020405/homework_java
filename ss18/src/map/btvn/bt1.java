package map.btvn;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        studentScores.put("Nguyen Van A", 85);
        studentScores.put("Tran Thi B", 90);
        studentScores.put("Le Van C", 78);
        studentScores.put("Pham Thi D", 92);
        studentScores.put("Hoang Van E", 88);

        System.out.println("Danh sách học sinh và điểm số:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Nhap ten muon tim diem");
        boolean flag = false;
        String find = sc.nextLine();
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            if(find.equals(entry.getKey())) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("Nhap ten muon tim diem");
        }
    }
}
