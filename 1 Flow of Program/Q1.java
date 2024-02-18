public class Q1 {
    public boolean checkLeapYear(int year) {
        if(year % 400 == 0 || year % 4 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int year = 2010;

        Q1 q = new Q1();
        System.out.println(q.checkLeapYear(year));
    }
}