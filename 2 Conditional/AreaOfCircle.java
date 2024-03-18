public class AreaOfCircle {
    public float areaOfCircle(int radius) {
        return (float)Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        int radius = 23;

        AreaOfCircle q = new AreaOfCircle();
        System.out.println(q.areaOfCircle(radius));
    }
}