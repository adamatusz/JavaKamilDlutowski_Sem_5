package Lab2_23112025;

public class PointTest {
    public static void main(String[] args) {
        Point5 a = new Point5();           // (0,0)
        Point5 b = new Point5(3, 4);

        double d = Point5.distance(a, b);
        System.out.println("Odległość: " + d); // 5.0
    }
}

