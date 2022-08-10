public class MoveablePoinTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(4.0f,7.0f);
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(3.2f,3.4f,3.3f,4.6f);
        System.out.println(moveablePoint);
        moveablePoint.Move();
        System.out.println(moveablePoint);
    }
}
