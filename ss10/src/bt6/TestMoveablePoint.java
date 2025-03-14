package ss10.src.bt6;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,2,1,2);
        System.out.println(moveablePoint.toString());
        moveablePoint.move();

        System.out.println("After move: "+moveablePoint.toString());
        moveablePoint.setxSpeed(2);
        moveablePoint.setySpeed(1);
        moveablePoint.move();
        System.out.println("After change speed "+moveablePoint.toString());
    }
}
