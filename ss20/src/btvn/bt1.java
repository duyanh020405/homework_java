package btvn;
import java.util.ArrayList;
import java.util.List;

public class bt1 {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<Integer>();
        students.add(1);
        students.add(2);
        students.add(3);
        students.add(4);
        students.add(5);
        students.add(6);
        students.add(7);
        students.add(8);
        students.add(9);
        students.add(10);

        students.stream().filter(n->n%2==0).forEach(System.out::println);

    }

}
