public class Q1 {
    public float areaOfCircle(int radius) {
        return (float)Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        int radius = 23;

        Q1 q = new Q1();
        System.out.println(q.areaOfCircle(radius));
    }   
}