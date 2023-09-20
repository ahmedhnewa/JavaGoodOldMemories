public class Point {
    private int x, y;
    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        // 0, 0 will make no difference
        double d1 = getX();
        double d2 = getY();
        return Math.sqrt((d1 * d1) + (d2 * d2));
    }

    public double distance(int x, int y) {
        double d1 = x - getX();
        double d2 = y - getY();
        return Math.sqrt((d1 * d1) + (d2 * d2));
    }

    public double distance(Point point) {
        double d1 = point.x - getX();
        double d2 = point.y - getY();
        return Math.sqrt((d1 * d1) + (d2 * d2));
    }
}
