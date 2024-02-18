public class Exception {
    public static void main(String[] args) {
        Integer n = Integer.valueOf(23);
        Integer m = Integer.valueOf(23);

        // auto boxing
        Integer x = 23;
        
        // un boxing
        int i = Integer.valueOf(23);
        String s = String.valueOf(230);
    }

    public static int pro() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }
}