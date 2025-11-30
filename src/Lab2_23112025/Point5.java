package Lab2_23112025;

public record Point5(double x, double y) {

    public Point5() {
        this(0, 0);
    }

    // Statyczna metoda licząca odległość między dwoma punktami
    public static double distance(Point5 p1, Point5 p2) {
        double dx = p2.x() - p1.x();
        double dy = p2.y() - p1.y();
        return Math.sqrt(dx * dx + dy * dy); // można też Math.hypot(dx, dy)
    }
}

