public class AreaOfRectangle {
    public static int commAreaOfRec(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x1 = Math.max(ax1, bx1);
        int y1 = Math.max(ay1, by1);
        int x2 = Math.min(ax2, bx2);
        int y2 = Math.min(ay2, by2);

        if(x1 < x2 && y1 < y2) {
            return (x2 - x1) * (y2 - y1);
        } else {
            return 0;
        }
    }

    public static int areaOfRec(int x1, int y1, int x2, int y2) {
        int len = 0;
        int bre = 0;

        if(x1 <= 0) {
            len = -x1 + x2;
        } else {
            len = x2 - x1;
        }

        if(y1 <= 0) {
            bre = -y1 + y2;
        } else {
            bre = y2 - y1;
        }

        int res = len * bre;

        return res<0 ? -res : res;
    }

    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = areaOfRec(ax1, ay1, ax2, ay2);
        int area2 = areaOfRec(bx1, by1, bx2, by2);

        int comArea = commAreaOfRec(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);

        return area1 + area2 - comArea;
    }


    public static void main(String[] args) {
        // int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        int ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2;

        int area = computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        System.out.println(area);
    }
}