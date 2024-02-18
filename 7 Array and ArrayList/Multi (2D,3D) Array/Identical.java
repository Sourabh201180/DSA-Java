public class Identical {
    public static void main(String[] args) {
        int[][] mat1 = { {1, 2, 3}, 
                        {4, 5, 6}, 
                        {7, 8, 9} };

        int[][] mat2 = { {1, 2, 3}, 
                        {4, 5, 6}, 
                        {7, 8, 9} };

        Identical iden = new Identical();
        
        System.out.print(iden.identicalOrNot(mat1, mat2));
    }
    
    public boolean identicalOrNot(int[][] mat1, int[][] mat2) {
        if(mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            return false;
        }
        
        for(int i=0; i<mat1.length; i++) {
            for(int j=0; j<mat1[0].length; j++) {
                if(mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}