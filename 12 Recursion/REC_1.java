/* 
    Recursively call a function
*/

public class REC_1 {
    public static void main(String[] args) {
        REC_1 r = new REC_1();
        
        int n = 5;
        r.message(n);
    }  
    
    public void message(int n) {
        if(n == 0) {
            return;
        }

        System.out.println("Hello World!");
        message(n-1);
    }
}